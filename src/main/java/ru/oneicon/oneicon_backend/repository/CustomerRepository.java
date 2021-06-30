package ru.oneicon.oneicon_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.oneicon.oneicon_backend.entity.Customer;

import java.util.Optional;

@Repository
@Transactional
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> getCustomerByLastName(String lastName);

    Optional<Customer> getCustomerByEmail(String email);
}
