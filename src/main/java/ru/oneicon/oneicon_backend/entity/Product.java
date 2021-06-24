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
@Entity(name = "Product")
@Table(name = "product")
public class Product implements Serializable {

    @Id
    @SequenceGenerator(name = "product_sequence", sequenceName = "product_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_sequence")
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name", nullable = false, columnDefinition = "VARCHAR(100)")
    private String name;

    @Column(name = "description", nullable = false, columnDefinition = "VARCHAR(1000)")
    private String description;

    @Column(name = "price", nullable = false, columnDefinition = "DECIMAL(10)")
    private Integer price;

    @Column(name = "image", nullable = false, columnDefinition = "VARCHAR(100)")
    private String image;

    @Column(name = "image_2", nullable = false, columnDefinition = "VARCHAR(100)")
    private String image2;

    @Column(name = "image_3", nullable = false, columnDefinition = "VARCHAR(100)")
    private String image3;

    @OneToMany(fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "product")
    @JsonBackReference
    private List<ProductCategory> productCategoryList = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true, mappedBy = "product")
    @JsonManagedReference
    private List<ProductAttribute> productAttributeList = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true, mappedBy = "product")
    @JsonIgnore
    private List<OrderDetails> orderDetailsList = new ArrayList<>();

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true, mappedBy = "product")
    @JsonIgnore
    private List<Review> reviews = new ArrayList<>();

}
