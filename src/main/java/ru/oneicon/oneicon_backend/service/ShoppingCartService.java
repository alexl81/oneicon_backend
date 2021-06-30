package ru.oneicon.oneicon_backend.service;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.oneicon.oneicon_backend.entity.Product;
import ru.oneicon.oneicon_backend.entity.ShoppingCart;
import ru.oneicon.oneicon_backend.exception.NotFoundException;
import ru.oneicon.oneicon_backend.repository.ShoppingCartRepository;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@Slf4j
public class ShoppingCartService {

    private final ShoppingCartRepository shoppingCartRepository;

    @Autowired
    public ShoppingCartService(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
    }


    /**
     *
     *     SELECT quantity
     *     FROM   shopping_cart
     *     WHERE  cart_id = inCartId
     *       AND product_id = inProductId
     *       AND attributes = inAttributes
     *     INTO   productQuantity;
     *
     * -- Create new shopping cart record, or increase quantity of existing record
     *     IF productQuantity IS NULL THEN
     *         INSERT INTO shopping_cart(cart_id, product_id, attributes,
     *                                   quantity, added_on)
     *         VALUES (inCartId, inProductId, inAttributes, 1, NOW());
     *     ELSE
     *         UPDATE shopping_cart
     *         SET    quantity = quantity + 1
     *         WHERE  cart_id = inCartId
     *           AND product_id = inProductId
     *           AND attributes = inAttributes;
     *     END IF;
     */
    public ShoppingCart shoppingCartAddProduct(
            UUID cartId,
            Long productId,
            String attributes) {
            ShoppingCart shoppingCart = new ShoppingCart();
        if(shoppingCartRepository.productQuantity(cartId, productId,attributes) == null) {
            shoppingCart.setCartId(UUID.randomUUID());
            shoppingCart.setProduct_id(productId);
            shoppingCart.setAttributes(attributes);
            shoppingCart.setQuantity(1);
            shoppingCart.setAdded_on(LocalDateTime.now());
        } else {
            shoppingCart.setQuantity(shoppingCart.getQuantity() + 1);
        }
        return shoppingCartRepository.save(shoppingCart);
    }

    public Product shoppingCartGetProducts(UUID cartId) {
        return shoppingCartRepository.shoppingCartGetProducts(cartId)
                .orElseThrow(() -> {
                    NotFoundException notFoundException = new NotFoundException("In shopping cart with cart_id " + cartId + " 0 products found");
                    log.error("error in getting product in shopping cart {}", cartId, notFoundException);
                    return notFoundException;
                });
    }


    public Double shoppingCartGetTotalAmount(UUID cartId) {
        return shoppingCartRepository.getTotalAmount(cartId);
    }

    public void shoppingCartEmpty(Long id) {
        shoppingCartRepository.deleteById(id);
    }
}
