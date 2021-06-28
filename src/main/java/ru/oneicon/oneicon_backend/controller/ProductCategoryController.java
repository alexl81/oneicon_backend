package ru.oneicon.oneicon_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.oneicon.oneicon_backend.entity.Category;
import ru.oneicon.oneicon_backend.entity.Product;
import ru.oneicon.oneicon_backend.service.CategoryService;
import ru.oneicon.oneicon_backend.service.ProductCategoryService;
import ru.oneicon.oneicon_backend.service.ProductService;

@RestController
@RequestMapping(path = "api/v1/")
public class ProductCategoryController {

    private final ProductCategoryService productCategoryService;
    private final ProductService productService;
    private final CategoryService categoryService;

    @Autowired
    public ProductCategoryController(ProductCategoryService productCategoryService,
                                     ProductService productService,
                                     CategoryService categoryService) {
        this.productCategoryService = productCategoryService;
        this.productService = productService;
        this.categoryService = categoryService;
    }

    @PostMapping(path="/category/{categoryId}/addproduct/{productId}")
    public void associateProductToCategory(@PathVariable("categoryId") Long categoryId,
                                           @PathVariable("productId") Long productId) {
        // Getting the requiring category; or throwing exception if not found
        Category category = categoryService.getCategoryById(categoryId);

        // Getting the requiring product; or throwing exception if not found
        Product product = productService.getProductById(productId);

        // Validating if association does not exist...
        if (productCategoryService.hasCategory(category, product)) {
            throw new IllegalArgumentException("product " + product.getId() + " already contains category " + category.getId());
        }
        // Associating product with category...
        productCategoryService.addProductToCategory(product, category);
    }

    @DeleteMapping(path = "/category/{categoryId}/removeproduct/{productId}")
    public void disassociateProductFromCategory(@PathVariable("categoryId") Long categoryId,
                                                @PathVariable("productId") Long productId) {
        // Getting the requiring category; or throwing exception if not found
        Category category = categoryService.getCategoryById(categoryId);

        // Getting the requiring product; or throwing exception if not found
        Product product = productService.getProductById(productId);

        // Validating if association does not exist...
        if (!productCategoryService.hasCategory(category, product)) {
            throw new IllegalArgumentException("product " + product.getId() + " does not contain category " + category.getId());
        }
        // Dis-associating product with category...
        productCategoryService.removeProductFromCategory(category, product);
    }

}
