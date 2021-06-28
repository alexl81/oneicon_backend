package ru.oneicon.oneicon_backend.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.oneicon.oneicon_backend.entity.Category;
import ru.oneicon.oneicon_backend.entity.Product;
import ru.oneicon.oneicon_backend.entity.ProductCategory;
import ru.oneicon.oneicon_backend.entity.ProductCategoryId;
import ru.oneicon.oneicon_backend.repository.ProductCategoryRepository;

@Service
@Slf4j
public class ProductCategoryService {

    private final ProductCategoryRepository productCategoryRepository;

    @Autowired
    public ProductCategoryService(ProductCategoryRepository productCategoryRepository) {
        this.productCategoryRepository = productCategoryRepository;
    }

    public void addProductToCategory(Product product, Category category) {
        log.info("addProductToCategory was called");
        ProductCategoryId pcId = new ProductCategoryId(category.getId(), product.getId());
        ProductCategory pc = new ProductCategory(pcId, category, product);
        productCategoryRepository.save(pc);
    }

    public void removeProductFromCategory(Category category, Product product) {
        log.info("removeProductFromCategory was called");
        ProductCategoryId pcId = new ProductCategoryId(category.getId(), product.getId());
        productCategoryRepository.deleteById(pcId);
    }

    public boolean hasCategory(Category category, Product product) {
        ProductCategoryId pcId = new ProductCategoryId(category.getId(), product.getId());
        return productCategoryRepository.existsById(pcId);
    }

}
