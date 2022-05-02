package com.kulit.customer.controller;

import com.kulit.customer.model.Customer;
import com.kulit.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public List<Customer> findAll() {
        return customerService.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Customer> findById(@PathVariable("id") long id){
        return customerService.findById(id);
    }
    @PostMapping("/add")
    public Customer saveCustomer(
           @RequestBody Customer customer)
    {

        return customerService.saveCustomer(customer);
    }
    @PutMapping("/{id}")
    public Customer updateCustomer(@RequestBody Customer customer,
                     @PathVariable("id") Long id)
    {

        return customerService.updateCustomer(
                customer, id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") long id) {
        customerService.deleteById(id);

        System.out.println("Customer successfully deleted");

    }

}
