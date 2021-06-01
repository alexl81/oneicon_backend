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
@Entity(name = "Review")
@Table(name = "review")
public class Review implements Serializable {

    @Id
    @SequenceGenerator(name = "review_sequence", sequenceName = "review_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "review_sequence")
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "review", nullable = false, columnDefinition = "TEXT")
    private String review;

    @Column(name = "rating", nullable = false, columnDefinition = "SMALLINT")
    private Integer rating;

    @Column(name = "created_on", nullable = false, columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Date createdOn;

    @ManyToOne
    @JoinColumn( name = "customer_id", nullable = false, referencedColumnName = "id", foreignKey = @ForeignKey(name = "customer_review_fk"))
    private Customer customer;

    @ManyToOne
    @JoinColumn( name = "product_id", nullable = false, referencedColumnName = "id", foreignKey = @ForeignKey(name = "product_review_fk"))
    private Product product;
}
