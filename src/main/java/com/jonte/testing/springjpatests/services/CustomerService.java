package com.jonte.testing.springjpatests.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerService {

    @GetMapping("/customers")
    public String getAllCustomers() {
        return "<h1>HERE IS A LIST OF ALL CUSTOMERS</h1>";
    }



        @GetMapping("/customers/{id}")
        public String getOneCustomer(@PathVariable("id") int id) {

        return "One Customer Was Returned with id: " + id;
        }
}
