package ru.oneicon.oneicon_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
    public Page<Product> getAllProducts(Pageable page) {
        return productService.getAllProducts(page);
    }

    @GetMapping(path="/count")
    public Long countAllProducts() {
        return productService.countAllProducts();
    }

    @GetMapping(path="/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public void createProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @PutMapping(path="/{id}")
    public Product editProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    // set image 1
    @PutMapping(path="/{id}/image1")
    public Product setImage1(@PathVariable("id") Long id,
                            @RequestBody String image) {
        Product product = productService.getProductById(id);
        product.setId(product.getId());
        product.setName(product.getName());
        product.setPrice(product.getPrice());
        product.setImage(image);
        product.setImage2(product.getImage2());
        product.setImage3(product.getImage3());
        return productService.updateProduct(product);
    }

    // set image 2
    @PutMapping(path="/{id}/image2")
    public Product setImage2(@PathVariable("id") Long id,
                            @RequestBody String image) {
        Product product = productService.getProductById(id);
        product.setId(product.getId());
        product.setName(product.getName());
        product.setPrice(product.getPrice());
        product.setImage(product.getImage());
        product.setImage2(image);
        product.setImage3(product.getImage3());
        return productService.updateProduct(product);
    }

    // set image 3
    @PutMapping(path="/{id}/image3")
    public Product setImage3(@PathVariable("id") Long id,
                             @RequestBody String image) {
        Product product = productService.getProductById(id);
        product.setId(product.getId());
        product.setName(product.getName());
        product.setPrice(product.getPrice());
        product.setImage(product.getImage());
        product.setImage2(product.getImage3());
        product.setImage3(image);
        return productService.updateProduct(product);
    }

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

    @GetMapping(path = "/{id}/categories")
    public List<Category> getCategoriesForProduct(@PathVariable("id") Long productId) {
        Product product = productService.getProductById(productId);
        return product.getProductCategoryList().stream()
                .map(ProductCategory::getCategory)
                .collect(Collectors.toList());
    }




}

