package com.jonte.testing.springjpatests;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class CustomerImpl {

    @Bean
    public static Customer saveCustomer (CustomerRepository customerRepository){
        Customer hej = new Customer("Jonte", "W", "j@W.se");
        customerRepository.save(hej);
        Customer hejaa = new Customer( "ASD", "BDF", "a@b.se");
        customerRepository.save(hejaa);
        Customer heja = new Customer("Jonte4", "Pell2", "j@p.se");
        customerRepository.save(heja);
        return null;
    }

    @Bean
    public static Customer deleteCustomer (CustomerRepository customerRepository) {
        customerRepository.deleteById(1);
        return null;
    }

    @Bean
    public static List<Customer> getAllCustomers(CustomerRepository customerRepository) {
        List<Customer> customerList;

        customerList = customerRepository.findAll();
        return customerList;
    }

}
