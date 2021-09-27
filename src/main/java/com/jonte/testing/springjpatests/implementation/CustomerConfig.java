package com.jonte.testing.springjpatests.implementation;

import com.jonte.testing.springjpatests.entitys.Customer;
import com.jonte.testing.springjpatests.interfaces.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

// här hårdkodar vi bara databasen för att vi ska ha något att jobba med

@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            Customer Robban = new Customer("Robban","Robban@hotmail.com");
            Customer Rozzy = new Customer("Rozzy","Rozzy@hotmail.com");
            Customer Jonte = new Customer("Jonte","Jonte@hotmail.com");
            Customer Alex = new Customer("Alex","Alex@hotmail.com");

            customerRepository.saveAll(List.of(Robban,Rozzy,Jonte,Alex));


        };
    }
}
