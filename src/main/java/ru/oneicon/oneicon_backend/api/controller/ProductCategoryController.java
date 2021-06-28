package ru.oneicon.oneicon_backend.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.oneicon.oneicon_backend.api.assembler.ProductResourceAssembler;
import ru.oneicon.oneicon_backend.entity.Category;
import ru.oneicon.oneicon_backend.entity.Product;
import ru.oneicon.oneicon_backend.service.CategoryService;
import ru.oneicon.oneicon_backend.service.ProductService;

/**
 * API Endpoint for categories and products association
 */

@RestController
@RequestMapping(path = "/category/{categoryId}/product")
public class ProductCategoryController {


    private  final CategoryService categoryService;
    private  final ProductService productService;
    private final ProductResourceAssembler productResourceAssembler;
    private final PagedResourcesAssembler<Product> pagedResourcesAssembler;

    @Autowired
    public ProductCategoryController(CategoryService categoryService, ProductService productService, ProductResourceAssembler productResourceAssembler, PagedResourcesAssembler<Product> pagedResourcesAssembler) {
        this.categoryService = categoryService;
        this.productService = productService;
        this.productResourceAssembler = productResourceAssembler;
        this.pagedResourcesAssembler = pagedResourcesAssembler;
    }


    @GetMapping
    public ResponseEntity<?> retrieveAllProducts(@PathVariable("categoryId") Long categoryId, Pageable page) {
        // Getting the requiring category; or throwing exception if not found
        final Category category = categoryService.getCategoryById(categoryId);

        // Getting all products associated with checked category
        final Page<Product> products = productService.getAllProducts(category, page);
        return ResponseEntity.ok(pagedResourcesAssembler.toModel(products));
        // this must be return ResponseEntity.ok(pagedResourcesAssembler.toResource(products, productResourceAssembler));
    }

    @PostMapping(path="/{productId}")
    public ResponseEntity<?> createProduct(@PathVariable Long categoryId, @PathVariable Long productId) {
        // Getting the requiring category; or throwing exception if not found
        Category category = categoryService.getCategoryById(categoryId);

        // Getting the requiring product; or throwing exception if not found
        Product product = productService.getProductById(productId);

        // Validating if association does not exist...
        if(productService.hasCategory(product, category)) {
            throw new IllegalArgumentException("product " + product.getId() + " already contains category " + category.getId());
        }

        //Associating product with category...
        productService.addCategory(product, category);

        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

    @DeleteMapping(path = "/{productId}")
    public ResponseEntity<?> removeProduct(@PathVariable Long categoryId, @PathVariable Long productId) {
        // Getting the requiring category; or throwing exception if not found
        Category category = categoryService.getCategoryById(categoryId);

        // Getting the requiring product; or throwing exception if not found
        Product product = productService.getProductById(productId);

        // Validating if association does not exist...
        if(!productService.hasCategory(product, category)) {
            throw new IllegalArgumentException("product " + product.getId() + " does not contain category " + category.getId());
        }

        //Dis-associating product with category...
        productService.removeCategory(product, category);

        return ResponseEntity.noContent().build();
    }
}
