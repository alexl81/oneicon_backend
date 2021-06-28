package ru.oneicon.oneicon_backend.api.resource;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.hateoas.ResourceSupport;

/**
 * Spring HATEOAS-oriented DTO for {@see Category} entity
 */

@AllArgsConstructor
@Getter
public class CategoryResource extends ResourceSupport {

    private final String name;
    private final String description;
}
