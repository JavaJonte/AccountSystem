package com.jonte.testing.springjpatests.services;

import com.jonte.testing.springjpatests.entitys.Customer;
import com.jonte.testing.springjpatests.interfaces.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service // visar att den här klassen är en Spring Service Bean
public class CustomerService {


    private final CustomerRepository customerRepository;

    @Autowired // injektar customerRepository in i customerService construktorn
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @GetMapping
    public List<Customer> getCustomers(){

        return customerRepository.findAll();
    }











    public void addNewCustomer(Customer customer) {

        System.out.println(customer);
    }



    @GetMapping("/customers")
    public String getAllCustomers() {
        return "<h1>HERE IS A LIST OF ALL CUSTOMERS</h1>";

    }

    @GetMapping("/customers/{id}")
    public String getOneCustomer(@PathVariable("id") int id) {
        return "One Customer Was Returned with id: " + id;
    }



}
