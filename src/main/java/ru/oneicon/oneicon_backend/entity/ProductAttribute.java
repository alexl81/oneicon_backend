package ru.oneicon.oneicon_backend.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity(name = "ProductAttribute")
@Table(name = "product_attribute")
public class ProductAttribute implements Serializable {

    @EmbeddedId
    @JsonIgnore
    private ProductAttributeId id;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id", foreignKey = @ForeignKey(name = "product_attribute_product_id_fk"))
    @JsonIgnore
    private Product product;

    @ManyToOne
    @MapsId("attributeValueId")
    @JoinColumn(name = "attribute_id", foreignKey = @ForeignKey(name = "product_attribute_attribute_id_fk"))
    private Attribute attribute;
}
