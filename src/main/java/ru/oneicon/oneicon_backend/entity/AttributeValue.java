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
@Entity(name = "AttributeValue")
@Table(name = "attribute_value")
public class AttributeValue implements Serializable {

    @Id
    @SequenceGenerator(name = "attribute_value_sequence", sequenceName = "attribute_value_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "attribute_value_sequence")
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "value", nullable = false, columnDefinition = "VARCHAR(100)")
    private String value;

    @ManyToOne
    @JoinColumn(
            name = "attribute_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "attribute_attribute_value_fk"))
    private Attribute attribute;
}
