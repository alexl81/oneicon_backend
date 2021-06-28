package ru.oneicon.oneicon_backend.api.assembler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;
import ru.oneicon.oneicon_backend.api.controller.CategoryController;
import ru.oneicon.oneicon_backend.api.controller.ProductCategoryController;
import ru.oneicon.oneicon_backend.api.resource.CategoryResource;
import ru.oneicon.oneicon_backend.entity.Category;
import ru.oneicon.oneicon_backend.service.ProductService;

/**
 * Transform {@link Category} into {@link CategoryResource}  DTO
 */

@Component
public class CategoryResourceAssembler extends ResourceAssemblerSupport<Category, CategoryResource> {


    private final ProductService productService;

    @Autowired
    public CategoryResourceAssembler(ProductService productService) {
        super(CategoryController.class, CategoryResource.class);
        this.productService = productService;
    }


    @Override
    protected CategoryResource instantiateResource(Category entity) {
        return new CategoryResource(entity.getName(), entity.getDescription());
    }

    @Override
    public CategoryResource toResource(Category entity) {
        CategoryResource resource = createResourceWithId(entity.getId(), entity);

        if(productService.hasProductAssociated(entity)) {
            resource.add(ControllerLinkBuilder
                    .linkTo(ControllerLinkBuilder
                            .methodOn(ProductCategoryController.class)
                            .retrieveAllProducts(entity.getId(), null))
                    .withRel("products"));
        }
        return resource;
    }
}

