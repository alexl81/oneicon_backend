package ru.oneicon.oneicon_backend.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.oneicon.oneicon_backend.entity.Category;
import ru.oneicon.oneicon_backend.entity.Product;
import ru.oneicon.oneicon_backend.entity.ProductCategory;
import ru.oneicon.oneicon_backend.exception.BadRequestException;
import ru.oneicon.oneicon_backend.exception.NotFoundException;
import ru.oneicon.oneicon_backend.repository.CategoryRepository;
import ru.oneicon.oneicon_backend.repository.ProductRepository;
import java.util.List;


@Service
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
    }

    public Page<Product> getAllProducts(Pageable page) {
        log.info("getAllProducts was called");
        return productRepository.findAll(page);
    }

    public Long countAllProducts() {
        log.info("countAllProducts was called");
        return productRepository.count();
    }

    public Product getProductById(Long id) {
        log.info("getProductById was called");
        return productRepository.findById(id)
                .orElseThrow(() -> {
                    NotFoundException notFoundException = new NotFoundException("Product with id " + id + " was not found");
                    log.error("error in getting product {}", id, notFoundException);
                    return notFoundException;
                });
    }

    public void addProduct(Product product) {
        log.info("addProduct was called");
        if(product.getName() == null)
            throw new BadRequestException("Product name must not be empty");
        else if(product.getDescription() == null)
            throw new BadRequestException("Product description must not be empty");
        else if(product.getImage() == null || product.getImage2() == null || product.getImage3() == null)
            throw new BadRequestException("Product images must not be empty");
        else if(product.getPrice() == null)
            throw new BadRequestException("Product price must not be empty");
        productRepository.save(product);
    }

    public Product updateProduct(Product product) {
        log.info("updateProduct was called");
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        log.info("deleteProduct was called");
        if(!productRepository.existsById(id)) {
            throw new NotFoundException("Product with id " + id + " does not exists");
        }
        productRepository.deleteById(id);
    }

}
