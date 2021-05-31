package ru.oneicon.oneicon_backend.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Embeddable
public class ProductCategoryId implements Serializable {

    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "product_id")
    private Long productId;
}
