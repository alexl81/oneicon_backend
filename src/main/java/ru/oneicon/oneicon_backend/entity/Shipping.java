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
@Entity(name = "Shipping")
@Table(name = "shipping")
public class Shipping implements Serializable {

    @Id
    @SequenceGenerator(name = "shipping_sequence", sequenceName = "shipping_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shipping_sequence")
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "shipping_type", nullable = false, columnDefinition = "VARCHAR(100)")
    private String shippingType;

    @Column(name = "shipping_cost", nullable = false, columnDefinition = "DECIMAL(10)")
    private Integer shippingCost;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true, mappedBy = "shipping")
    private List<Orders> orders = new ArrayList<>();

    @ManyToOne
    @JoinColumn(
            name="shipping_region_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "shipping_region_shipping_fk"
            )
    )
    private ShippingRegion shippingRegion;

}
