package com.jonte.testing.springjpatests.implementation;

import com.jonte.testing.springjpatests.interfaces.CustomerRepository;
import com.jonte.testing.springjpatests.entitys.Customer;
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
