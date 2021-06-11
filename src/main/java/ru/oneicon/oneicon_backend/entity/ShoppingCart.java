package ru.oneicon.oneicon_backend.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity(name = "ShoppingCart")
@Table(name = "shopping_cart")
public class ShoppingCart {

    @Id
    @SequenceGenerator(name = "shopping_cart_sequence", sequenceName = "shopping_cart_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shopping_cart_sequence")
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "cart_id", nullable = false, columnDefinition = "UUID")
    private UUID cartId;

    @Column(name = "product_id", nullable = false, columnDefinition = "INTEGER")
    private Integer product_id;

    @Column(name = "attributes", nullable = false, columnDefinition = "VARCHAR(1000)")
    private String attributes;

    @Column(name = "quantity", nullable = false, columnDefinition = "INTEGER")
    private Integer quantity;

    @Column(name = "added_on", nullable = false, columnDefinition = "TIMESTAMP WITHOUT TIME ZONE" )
    private Date added_on;
}
