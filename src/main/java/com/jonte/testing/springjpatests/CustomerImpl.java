package com.jonte.testing.springjpatests;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerImpl {

    @Bean
    public static Customer saveCustomer (CustomerRepository customerRepository){
        Customer hej = new Customer(1L, "Jonte");
        customerRepository.save(hej);
        return hej;
    }
}
