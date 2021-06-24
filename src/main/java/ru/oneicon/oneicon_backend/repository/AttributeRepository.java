package ru.oneicon.oneicon_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.oneicon.oneicon_backend.entity.Attribute;

@Repository
@Transactional
public interface AttributeRepository extends JpaRepository<Attribute, Long> {

}
