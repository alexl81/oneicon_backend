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
@Entity(name = "ShippingRegion")
@Table(name = "shipping_region")
public class ShippingRegion implements Serializable {

    @Id
    @SequenceGenerator(name = "shipping_region_sequence", sequenceName = "shipping_region_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shipping_region_sequence")
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "shipping_regions", nullable = false, columnDefinition = "VARCHAR(100)")
    private String shippingRegions;

    @OneToMany(
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            mappedBy = "shippingRegion",
            orphanRemoval = true
    )
    private List<Shipping> shipping = new ArrayList<>();

}
