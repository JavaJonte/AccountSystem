package com.jonte.testing.springjpatests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/customers")
    public String getAllCustomers() {
        return "<h1>HERE IS A LIST OF ALL CUSTOMERS</h1>";
    }

       @GetMapping("/customers/{id}")
        public String getOneCustomer(@PathVariable("id") int id) {

        return "One Customer Was Returned with id: " + id;
        }

        @PostMapping(path = "customers",
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity<Customer> create(@RequestBody Customer newCustomer) {
            Customer user = customerRepository.save(newCustomer);
                return new ResponseEntity<>(user, HttpStatus.CREATED);
            }
        }
