package ru.oneicon.oneicon_backend.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.oneicon.oneicon_backend.entity.Customer;
import ru.oneicon.oneicon_backend.exception.BadRequestException;
import ru.oneicon.oneicon_backend.exception.NotFoundException;
import ru.oneicon.oneicon_backend.repository.CustomerRepository;

import java.util.List;

@Service
@Slf4j
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        log.info("getAllCustomers was called");
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
        log.info("getCustomerById was called");
        return customerRepository.findById(id)
                .orElseThrow(() -> {
                    NotFoundException notFoundException = new NotFoundException("Customer with id " + id + " was not found");
                    log.error("error in getting customer {}", id, notFoundException);
                    return notFoundException;
                });
    }

    public Customer getCustomerByLastName(String lastName) {
        log.info("getCustomerByLastName was called");
        return customerRepository.getCustomerByLastName(lastName)
                .orElseThrow(() -> {
                    NotFoundException notFoundException = new NotFoundException("Customer with last name " + lastName + " was not found");
                    log.error("error in getting customer {}", lastName, notFoundException);
                    return notFoundException;
                });
    }

    public Customer getCustomerByEmail(String email) {
        log.info("getCustomerByEmail was called");
        return customerRepository.getCustomerByEmail(email)
                .orElseThrow(() -> {
                    NotFoundException notFoundException = new NotFoundException("Customer with email " + email + " was not found");
                    log.error("error in getting customer {}", email, notFoundException);
                    return notFoundException;
                });
    }

    public void addCustomer( Customer customer) {
        log.info("addCustomer was called");
        if(customer.getFirstName() == null)
            throw new BadRequestException("Customer first name must not be empty");
        if(customer.getLastName() == null)
            throw new BadRequestException("Customer last name must not be empty");
        //TODO: need to add validation
        if(customer.getEmail() == null)
            throw new BadRequestException("Customer email must not be empty");
        //TODO: need to add validation
        if(customer.getPassword() == null)
            throw new BadRequestException("Customer password must not be empty");
        customerRepository.save(customer);
    }

    public Customer updateCustomer (Customer customer) {
        log.info("updateCustomer was called");
        if(customer.getFirstName() == null)
            throw new BadRequestException("Customer first name must not be empty");
        if(customer.getLastName() == null)
            throw new BadRequestException("Customer last name must not be empty");
        //TODO: need to add validation
        if(customer.getEmail() == null)
            throw new BadRequestException("Customer email must not be empty");
        //TODO: need to add validation
        if(customer.getPassword() == null)
            throw new BadRequestException("Customer password must not be empty");
        return customerRepository.save(customer);
    }

}
