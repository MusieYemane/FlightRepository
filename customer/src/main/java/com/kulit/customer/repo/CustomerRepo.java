package com.kulit.customer.repo;

import com.kulit.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long> {
    @Query("select c from Customer c where c.name = :name and c.id = :id")
    Customer updateCustomer(@Param("name")Customer customer,  @Param("id") long id);

}
