package ru.oneicon.oneicon_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.QueryLookupStrategy;
import org.springframework.stereotype.Repository;
import ru.oneicon.oneicon_backend.entity.Category;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
