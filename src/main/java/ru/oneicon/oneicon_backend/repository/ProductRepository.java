package ru.oneicon.oneicon_backend.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.oneicon.oneicon_backend.entity.Category;
import ru.oneicon.oneicon_backend.entity.Product;

import java.util.Optional;


@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product, Long> {


    /**
     * Gets all products that are associated with the given category.
     * The association can be either directly or indirectly.
     * Please {@see Product} entity for more details.
     *
     * @param category the category to filter
     * @param page the page to fetch results from
     * @return the paginated results
     */
    Page<Product> getAllProducts(Category category, Pageable page);

    /**
     * Gets a specific product by looking for its id.
     *
     * @param id the id of the product to look for
     * @return the product (if any)
     */
    Optional<Product> getProductById(Long id);








    //SQL Native Queries being used to get categories associated with products
    String GET_PRODUCTS_ASSOCIATED_WITH_CATEGORY_SQL =
            "SELECT p.* FROM product p INNER JOIN product_category pc ON p.id = pc.product_id WHERE  pc.category_id = ?1";
    String COUNT_PRODUCTS_ASSOCIATED_WITH_CATEGORY_SQL =
            "SELECT COUNT(1) FROM (" + GET_PRODUCTS_ASSOCIATED_WITH_CATEGORY_SQL + ")";

    /**
     * Finds the products associated with a given category
     *
     * @param categoryId the categoryId to look for
     * @param pageable the page to fetch data from
     * @return the paginated products
     */
    @Query(value = GET_PRODUCTS_ASSOCIATED_WITH_CATEGORY_SQL, countQuery = COUNT_PRODUCTS_ASSOCIATED_WITH_CATEGORY_SQL, nativeQuery = true)
    Page<Product> findByAssociatedWithCategory(Long categoryId, Pageable pageable);


    /**
     * Counts the number of products associated with given category.
     *
     * @param categoryId the category Id to check
     * @return the number of products associated with the category
     */
    @Query(value = COUNT_PRODUCTS_ASSOCIATED_WITH_CATEGORY_SQL, nativeQuery = true)
    Long countByAssociatedWithCategory(Long categoryId);
}
