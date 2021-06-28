package ru.oneicon.oneicon_backend.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.oneicon.oneicon_backend.entity.*;
import ru.oneicon.oneicon_backend.repository.ProductAttributeRepository;

@Service
@Slf4j
public class ProductAttributeService {

    private final ProductAttributeRepository productAttributeRepository;

    public ProductAttributeService(ProductAttributeRepository productAttributeRepository) {
        this.productAttributeRepository = productAttributeRepository;
    }

    public void addAttributeToProduct(Product product, Attribute attribute) {
        log.info("addAttributeToProduct was called");
        ProductAttributeId paId = new ProductAttributeId(product.getId(), attribute.getId());
        ProductAttribute productAttribute = new ProductAttribute(paId, product, attribute);
        productAttributeRepository.save(productAttribute);
    }

    public void removeAttributeFromProduct(Product product, Attribute attribute) {
        log.info("removeAttributeFromProduct was called");
        ProductAttributeId paId = new ProductAttributeId(product.getId(), attribute.getId());
        productAttributeRepository.deleteById(paId);
    }

    public boolean hasProduct(Product product, Attribute attribute) {
        ProductAttributeId paId = new ProductAttributeId(product.getId(), attribute.getId());
        return productAttributeRepository.existsById(paId);
    }
}
