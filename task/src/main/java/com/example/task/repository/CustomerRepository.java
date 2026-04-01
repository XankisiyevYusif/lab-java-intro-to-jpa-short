package com.example.task.repository;

import com.example.task.enums.CustomerStatus;
import com.example.task.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByCustomerStatus(CustomerStatus status);

    List<Customer> findByTotalCustomerMileageGreaterThan(Integer mileage);
}
