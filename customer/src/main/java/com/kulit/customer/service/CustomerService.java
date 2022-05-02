package com.kulit.customer.service;

import com.kulit.customer.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CustomerService {
     List<Customer> findAll();
    Optional<Customer> findById( long id);
    void deleteById(long id);
     Customer saveCustomer(Customer customer);
     Customer updateCustomer( Customer customer, long id);


}
