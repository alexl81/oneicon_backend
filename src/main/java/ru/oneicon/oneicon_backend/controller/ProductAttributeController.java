package ru.oneicon.oneicon_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.oneicon.oneicon_backend.entity.Attribute;
import ru.oneicon.oneicon_backend.entity.Category;
import ru.oneicon.oneicon_backend.entity.Product;
import ru.oneicon.oneicon_backend.service.AttributeService;
import ru.oneicon.oneicon_backend.service.ProductAttributeService;
import ru.oneicon.oneicon_backend.service.ProductService;

@RestController
@RequestMapping(path = "api/v1/")
public class ProductAttributeController {

    private final ProductAttributeService productAttributeService;
    private final ProductService productService;
    private final AttributeService attributeService;

    @Autowired
    public ProductAttributeController(ProductAttributeService productAttributeService,
                                      ProductService productService,
                                      AttributeService attributeService) {
        this.productAttributeService = productAttributeService;
        this.productService = productService;
        this.attributeService = attributeService;
    }

    @PostMapping(path="/product/{productId}/addattribute/{attributeId}")
    public void associateAttributeToProduct(@PathVariable("productId") Long productId,
                                           @PathVariable("attributeId") Long attributeId) {
        // Getting the requiring product; or throwing exception if not found
        Product product = productService.getProductById(productId);

        // Getting the requiring attribute; or throwing exception if not found
        Attribute attribute = attributeService.getAttributeById(attributeId);

        // Validating if association does not exist...
        if (productAttributeService.hasProduct(product, attribute)) {
            throw new IllegalArgumentException("attribute " + attribute.getId() + " already contains product " + product.getId());
        }
        // Associating attribute with product...
        productAttributeService.addAttributeToProduct(product, attribute);
    }

    @DeleteMapping(path = "/product/{productId}/removeattribute/{attributeId}")
    public void disassociateAttributeFromProduct(@PathVariable("productId") Long productId,
                                                @PathVariable("attributeId") Long attributeId) {
        // Getting the requiring product; or throwing exception if not found
        Product product = productService.getProductById(productId);

        // Getting the requiring attribute; or throwing exception if not found
        Attribute attribute = attributeService.getAttributeById(attributeId);

        // Validating if association does not exist...
        if (!productAttributeService.hasProduct(product, attribute)) {
            throw new IllegalArgumentException("attribute " + attribute.getId() + " does not contain product " + product.getId());
        }
        // Dis-associating attribute with product...
        productAttributeService.removeAttributeFromProduct(product, attribute);
    }
}
