package ru.oneicon.oneicon_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.oneicon.oneicon_backend.entity.Product;
import ru.oneicon.oneicon_backend.entity.ShoppingCart;

import java.util.Optional;
import java.util.UUID;

@Repository
@Transactional
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {

    @Query(value = "SELECT quantity FROM shopping_cart WHERE cart_id = ?1 AND product_id = ?2 AND attributes = ?3;", nativeQuery = true)
    Integer productQuantity(UUID cartId, Long productId, String attributes);

    @Query(value = "SELECT sc.id, p.name, sc.attributes, p.price, sc.quantity, p.price * sc.quantity AS subtotal FROM shopping_cart sc INNER JOIN product p ON sc.product_id = p.id WHERE sc.cart_id = ?1;", nativeQuery = true)
    Optional<Product> shoppingCartGetProducts(UUID cartId);


    @Query(value = "SELECT SUM(p.price * sc.quantity) AS total_amount FROM shopping_cart sc INNER JOIN product p ON sc.product_id = p.id WHERE sc.cart_id = ?1;", nativeQuery = true)
    Double getTotalAmount(UUID cartId);

}
