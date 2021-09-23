package com.jonte.testing.springjpatests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerService {


    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/customers")
    public String getAllCustomers() {

        return "<h1>HERE IS A LIST OF ALL CUSTOMERS</h1>" + CustomerImpl.getAllCustomers(customerRepository);
    }

    @GetMapping("/customers/{id}")
    public String getOneCustomer(@PathVariable("id") int id) {

        return "One Customer Was Returned with id: " + id + "\n"+customerRepository.getById(id);
    }


}
