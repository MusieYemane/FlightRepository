package com.kulit.customer.service;

import com.kulit.customer.model.Customer;
import com.kulit.customer.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImp implements CustomerService{
    @Autowired
 private CustomerRepo customerRepo;

    public List<Customer> findAll() {
       return customerRepo.findAll();
    }

    @Override
    public Optional<Customer> findById(long id) {
        return customerRepo.findById(id);
    }

    @Override
    public void deleteById(long id) {
        customerRepo.deleteById(id);

    }


    @Override
    public Customer saveCustomer(Customer customer) {
        Customer customer1 = customerRepo.save(customer);
        return customer1;
    }

    @Override
    public Customer updateCustomer(Customer customer, long id) {
        customer.setId(id);

        return customerRepo.save(customer);
    }


}
