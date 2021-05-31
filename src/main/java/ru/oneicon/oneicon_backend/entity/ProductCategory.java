package ru.oneicon.oneicon_backend.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity(name = "ProductCategory")
@Table(name = "product_category")
public class ProductCategory implements Serializable {

    @EmbeddedId
    private ProductCategoryId id;

    @ManyToOne
    @MapsId("categoryId")
    @JoinColumn(name = "category_id", foreignKey = @ForeignKey(name = "product_category_category_id_fk"))
    private Category category;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id", foreignKey = @ForeignKey(name = "product_category_product_id_fk"))
    private Product product;

}
