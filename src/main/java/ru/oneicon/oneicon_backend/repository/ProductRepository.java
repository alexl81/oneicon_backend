package ru.oneicon.oneicon_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.oneicon.oneicon_backend.entity.Product;



@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product, Long> {

}
