package ru.oneicon.oneicon_backend.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import ru.oneicon.oneicon_backend.entity.*;
import ru.oneicon.oneicon_backend.service.CategoryService;
import ru.oneicon.oneicon_backend.service.ProductService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {


    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "/all")
    public Page<Product> getAllProducts(Pageable pageable) {
        return productService.getAllProducts(pageable);
    }

    @GetMapping(path="/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return productService.getProductById(id);
    }

//    @PostMapping
//    public void createProduct(@RequestBody Product product) {
//        productService.createProduct(product);
//    }

//    @PutMapping(path="/{id}")
//    public Product editProduct(@RequestBody Product product) {
//        return productService.updateProduct(product);
//    }

    @DeleteMapping(path="/{id}")
    public void removeProduct(@PathVariable("id") Long id) {
        productService.deleteProduct(id);
    }

    @GetMapping(path = "/{id}/attributes")
    public List<Attribute> getAttributesByProductId(@PathVariable("id") Long productId) {
        Product product = productService.getProductById(productId);
        return product.getProductAttributeList().stream()
                .map(ProductAttribute::getAttribute)
                .collect(Collectors.toList());
    }


}

