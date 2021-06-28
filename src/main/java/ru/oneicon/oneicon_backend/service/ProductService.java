package ru.oneicon.oneicon_backend.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.oneicon.oneicon_backend.entity.Category;
import ru.oneicon.oneicon_backend.entity.Product;
import ru.oneicon.oneicon_backend.entity.ProductCategory;
import ru.oneicon.oneicon_backend.entity.ProductCategoryId;
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

    /**
     * Gets all products present in the system.
     * The result is paginated.
     *
     * @param page the page to fetch results from
     * @return the paginated results
     */
    public Page<Product> getAllProducts(Pageable page) {
        log.info("getAllProducts was called");
        return productRepository.findAll(page);
    }

    /**
     * Gets a specific product by looking for its id.
     *
     * @param id the id of the product to look for
     * @return the product (if any)
     */
    public Product getProductById(Long id) {
        log.info("getProductById was called");
        return productRepository.findById(id)
                .orElseThrow(() -> {
                    NotFoundException notFoundException = new NotFoundException("Product with id " + id + " was not found");
                    log.error("error in getting product {}", id, notFoundException);
                    return notFoundException;
                });
    }

    /**
     * Gets all products that are associated with the given category.
     * The association can be either directly or indirectly.
     * Please {@see Product} entity for more details.
     *
     * @param category the category to filter
     * @param page the page to fetch results from
     * @return the paginated results
     */
    public Page<Product> getAllProducts(Category category, Pageable page) {
        return productRepository.findByAssociatedWithCategory(category.getId(), page);
    }


    /**
     * Creating the product.

     *
     * @param name the name of the product
     * @param description the description of the product
     * @param price the price of the product
     * @param image the image of the product
     * @param image2 the image2 of the product
     * @param image3 the image3 of the product
     * @return the new product
     */
    public Product createProduct(String name, String description, Integer price,
                              String image, String image2, String image3 ) {
        log.info("createProduct was called");
        return saveProduct(name, description, price, image, image2, image3);
    }

    /**
     * Updating the existing product.

     *
     * @param name the name of the product
     * @param description the description of the product
     * @param price the price of the product
     * @param image the image of the product
     * @param image2 the image2 of the product
     * @param image3 the image3 of the product
     * @return the new product
     */
    public Product updateProduct(String name, String description, Integer price,
                                 String image, String image2, String image3 ) {
        log.info("updateProduct was called");
        return saveProduct(name, description, price, image, image2, image3);
    }

    private Product saveProduct(String name, String description, Integer price, String image, String image2, String image3) {
        Product product = new Product();
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);
        product.setImage(image);
        product.setImage2(image2);
        product.setImage3(image3);
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        log.info("deleteProduct was called");
        if(!productRepository.existsById(id)) {
            throw new NotFoundException("Product with id " + id + " does not exists");
        }
        productRepository.deleteById(id);
    }

    public boolean hasCategory(Product product, Category category) {
        ProductCategoryId pcId = new ProductCategoryId();
        ProductCategory productCategory = new ProductCategory(pcId, category, product);
        return product.getProductCategoryList().contains(productCategory);
    }

    public void addCategory(Product product, Category category) {
        ProductCategoryId pcId = new ProductCategoryId();
        ProductCategory productCategory = new ProductCategory(pcId,category, product);
        product.getProductCategoryList().add(productCategory);
        productRepository.save(product);
    }

    public void removeCategory(Product product, Category category) {
        ProductCategoryId pcId  = new ProductCategoryId();
        ProductCategory productCategory = new ProductCategory(pcId, category, product);
        product.getProductCategoryList().remove(productCategory);
        productRepository.save(product);
    }

    public boolean hasProductAssociated(Category category) {
        return productRepository.countByAssociatedWithCategory(category.getId()) > 0;
    }
}
