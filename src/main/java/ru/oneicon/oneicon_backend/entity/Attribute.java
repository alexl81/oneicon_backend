package ru.oneicon.oneicon_backend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity(name = "Attribute")
@Table(name = "attribute")
public class Attribute implements Serializable {

    @Id
    @SequenceGenerator(name = "attribute_sequence", sequenceName = "attribute_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "attribute_sequence")
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name", nullable = false, columnDefinition = "VARCHAR(100)")
    private String name;

    @JsonBackReference
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, mappedBy = "attribute")
    private List<ProductAttribute> productAttributeList = new ArrayList<>();

    @JsonManagedReference
    @OneToMany(mappedBy = "attribute", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<AttributeValue> attributeValueList = new ArrayList<>();



    public void addAttributeValue(AttributeValue attributeValue) {
        if (!this.attributeValueList.contains(attributeValue)) {
            this.attributeValueList.add(attributeValue);
            attributeValue.setAttribute(this);
        }
    }

    public void removeAttributeValue(AttributeValue attributeValue) {
        if (this.attributeValueList.contains(attributeValue)) {
            this.attributeValueList.remove(attributeValue);
            attributeValue.setAttribute(null);
        }
    }
}
