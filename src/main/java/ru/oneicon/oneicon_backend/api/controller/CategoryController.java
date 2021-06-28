package ru.oneicon.oneicon_backend.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.oneicon.oneicon_backend.entity.Category;
import ru.oneicon.oneicon_backend.entity.Product;
import ru.oneicon.oneicon_backend.entity.ProductCategory;
import ru.oneicon.oneicon_backend.exception.NotFoundException;
import ru.oneicon.oneicon_backend.service.CategoryService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {


    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping(path="/all")
    public List<Category> getAllCategories() {
        // Getting all categories in application
        return categoryService.getAllCategories();
    }

    @GetMapping(path="/{id}")
    public Category getCategoryById(@PathVariable("id") Long id) {
        // Getting the requiring category, or throwing exception if not found
        return categoryService.getCategoryById(id);
    }

    @PostMapping
    public void createCategory(@RequestBody Category category) {
        // Creating a new category in the application
        categoryService.addCategory(category);
    }

    @PutMapping(path="/{id}")
    public Category editCategory(@RequestBody Category category) {
        // Updating a category in the application
        return categoryService.updateCategory(category);
    }

    @DeleteMapping(path="/{id}")
    public void removeCategory(@PathVariable("id") Long id) {
        // Deleting a category from the application
        categoryService.deleteCategory(id);
    }

    @GetMapping(path = "{id}/products")
    public List<Product> getProductsByCategoryId(@PathVariable("id") Long categoryId) {
        Category category = categoryService.getCategoryById(categoryId);
        return category.getProductCategory().stream()
                .map(ProductCategory::getProduct)
                .collect(Collectors.toList());
    }
}
