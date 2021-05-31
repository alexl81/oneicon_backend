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
@Entity(name = "Customer")
@Table(name = "customer", uniqueConstraints = @UniqueConstraint(name = "customer_email_unique", columnNames = "email"))
public class Customer implements Serializable {

    @Id
    @SequenceGenerator(name = "customer_sequence", sequenceName = "customer_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_sequence")
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "first_name", nullable = false, columnDefinition = "VARCHAR(45)")
    private String firstName;

    @Column(name = "last_name", nullable = false, columnDefinition = "VARCHAR(45)")
    private String lastName;

    @Column(name = "email", nullable = false, columnDefinition = "VARCHAR(100)")
    private String email;

    @Column(name = "password", nullable = false, columnDefinition = "VARCHAR(100)")
    private String password;

    @Column(name = "address_1", columnDefinition = "VARCHAR(100)")
    private String address1;

    @Column(name = "address_2", columnDefinition = "VARCHAR(100)")
    private String address2;

    @Column(name = "city", columnDefinition = "VARCHAR(50)")
    private String city;

    @Column(name = "region", columnDefinition = "VARCHAR(50)")
    private String region;

    @Column(name = "postal_code", columnDefinition = "VARCHAR(50)")
    private String postalCode;

    @Column(name = "country", columnDefinition = "VARCHAR(50)")
    private String country;

    @Column(name = "phone_1", columnDefinition = "VARCHAR(30)")
    private String phone1;

    @Column(name = "phone_2", columnDefinition = "VARCHAR(30)")
    private String phone2;

    @OneToMany(
            mappedBy = "customer",
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private List<Orders> orders = new ArrayList<>();

}
