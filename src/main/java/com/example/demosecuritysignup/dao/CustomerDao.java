package com.example.demosecuritysignup.dao;

import com.example.demosecuritysignup.ds.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerDao extends JpaRepository<Customer, String > {

    Optional<Customer> findCustomerByUsername (String username);
}
