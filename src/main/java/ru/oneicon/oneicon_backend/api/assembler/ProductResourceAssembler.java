package ru.oneicon.oneicon_backend.api.assembler;

import io.jsonwebtoken.lang.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;
import ru.oneicon.oneicon_backend.api.controller.ProductController;
import ru.oneicon.oneicon_backend.api.resource.ProductResource;
import ru.oneicon.oneicon_backend.entity.Product;

import ru.oneicon.oneicon_backend.entity.ProductCategory;

import java.util.stream.Collectors;


@Component
public class ProductResourceAssembler extends ResourceAssemblerSupport<Product, ProductResource> {

    private final CategoryResourceAssembler categoryResourceAssembler;

    @Autowired
    public ProductResourceAssembler(CategoryResourceAssembler categoryResourceAssembler) {
        super(ProductController.class, ProductResource.class);
        this.categoryResourceAssembler = categoryResourceAssembler;
    }

    @Override
    protected ProductResource instantiateResource(Product entity) {
        return new ProductResource(
                entity.getName(),
                entity.getDescription(),
                entity.getPrice(),
                entity.getImage(),
                entity.getImage2(),
                entity.getImage3(),
                !Collections.isEmpty(entity.getProductCategoryList()) ?
                        categoryResourceAssembler.toResources(entity.getProductCategoryList()
                        .stream()
                        .map(ProductCategory::getCategory)
                        .collect(Collectors.toList())) : null
                );
    }

    @Override
    public ProductResource toResource(Product entity) {
        return createResourceWithId(entity.getId(), entity);
    }
}
