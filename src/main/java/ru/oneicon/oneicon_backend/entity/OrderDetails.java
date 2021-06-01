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
@Entity(name = "OrderDetails")
@Table(name = "order_details")
public class OrderDetails implements Serializable {

    @Id
    @SequenceGenerator(name = "order_details_sequence", sequenceName = "order_details_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_details_sequence")
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "attributes", nullable = false, columnDefinition = "VARCHAR(100)")
    private String attributes;

    @Column(name = "product_name", nullable = false, columnDefinition = "VARCHAR(100)")
    private String productName;

    @Column(name = "quantity", nullable = false, columnDefinition = "INT")
    private Integer quantity;

    @Column(name = "unit_cost", nullable = false, columnDefinition = "DECIMAL(10)")
    private Integer unitCost;

    @ManyToOne
    @JoinColumn( name = "product_id", nullable = false, referencedColumnName = "id", foreignKey = @ForeignKey(name = "product_order_details_fk"))
    private Product product;

    @ManyToOne
    @JoinColumn( name = "order_id", nullable = false, referencedColumnName = "id", foreignKey = @ForeignKey(name = "orders_order_details_fk"))
    private Orders orders;
}
