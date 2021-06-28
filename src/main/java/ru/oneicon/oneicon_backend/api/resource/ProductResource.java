package ru.oneicon.oneicon_backend.api.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.hateoas.ResourceSupport;

import java.util.List;

/**
 * Spring HATEOAS-oriented DTO for {@see Product} entity
 *
 */
@AllArgsConstructor
@Getter
public class ProductResource extends ResourceSupport {
     private final String name;
     private final String description;
     private final Integer price;
     private final String image;
     private final String image2;
     private final String image3;
     private final List<CategoryResource> categories;
}
