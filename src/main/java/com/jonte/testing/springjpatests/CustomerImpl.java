package com.jonte.testing.springjpatests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class CustomerImpl {

    @Autowired
    CustomerRepository customerRepository;

    @Bean
    public Customer create(){
        Customer customer = new Customer();
        customer.setFirstName("TEST");
        customer.setLastName("MER TEST");
        customer.setEmail("ÄnnuMerA@a.se");
        customerRepository.save(customer);
        return customer;
    }

    @Bean
    public static Customer deleteCustomer (CustomerRepository customerRepository) {
        //customerRepository.deleteById(2);
        return null;
    }

    @Bean
    public static List<Customer> getAllCustomers(CustomerRepository customerRepository) {
        List<Customer> customerList;

        customerList = customerRepository.findAll();
        return customerList;
    }

}
