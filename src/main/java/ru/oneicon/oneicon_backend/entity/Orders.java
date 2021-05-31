package ru.oneicon.oneicon_backend.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity(name = "Orders")
@Table(name = "orders")
public class Orders implements Serializable {

    @Id
    private Long id;

    @Column(name = "total_amount", nullable = false, columnDefinition = "DECIMAL(10)")
    private Integer totalAmount;

    @Column(name = "created_on", nullable = false, columnDefinition = "TIMESTAMP WITHOUT TIME ZONE" )
    private Date createdOn;

    @Column(name = "shipped_on", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Date shippedOn;

    @Column(name = "status", nullable = false, columnDefinition = "INT")
    private Integer status;

    @Column(name = "comments", columnDefinition = "TEXT")
    private String comments;

    @ManyToOne
    @JoinColumn( name = "customer_id", nullable = false, referencedColumnName = "id", foreignKey = @ForeignKey(name = "customer_orders_fk"))
    private Customer customer;

}
