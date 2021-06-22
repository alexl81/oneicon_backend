package ru.oneicon.oneicon_backend.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.oneicon.oneicon_backend.entity.Category;
import ru.oneicon.oneicon_backend.exception.BadRequestException;
import ru.oneicon.oneicon_backend.exception.NotFoundException;
import ru.oneicon.oneicon_backend.repository.CategoryRepository;

import java.util.List;

@Service
@Slf4j
public class CategoryService {


    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {
        log.info("getAllCategories was called");
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long id) {
        log.info("getCategoryById was called");
        return categoryRepository.findById(id)
                .orElseThrow(() -> {
                    NotFoundException notFoundException = new NotFoundException("Category with id " + id + " was not found");
                    log.error("error in getting category {}", id, notFoundException);
                    return notFoundException;
                });
    }

    public void addCategory(Category category) {
        log.info("addCategory was called");
        if(category.getName() == null)
            throw new BadRequestException("Category name must not be empty");
        categoryRepository.save(category);
    }

    public Category updateCategory(Category category) {
        log.info("updateCategory was called");
        return categoryRepository.save(category);
    }

    public void deleteCategory(Long id) {
        log.info("deleteCategory was called");
        if(!categoryRepository.existsById(id)) {
            throw new NotFoundException("Category with id " + id + " does not exists");
        }
        categoryRepository.deleteById(id);
    }


}
