package ru.oneicon.oneicon_backend.entity;

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
@Entity(name = "Category")
@Table( name = "category")
public class Category implements Serializable {

    @Id
    @SequenceGenerator(name = "category_sequence", sequenceName = "category_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_sequence")
    @Column(name = "id",updatable = false)
    private Long id;

    @Column(name = "name", nullable = false, columnDefinition = "VARCHAR(100)")
    private String name;

    @Column(name = "description", nullable = false, columnDefinition = "VARCHAR(1000)")
    private String description;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, mappedBy = "category")
    private List<ProductCategory> productCategory = new ArrayList<>();
}
