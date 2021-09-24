package com.jonte.testing.springjpatests.services;

import com.jonte.testing.springjpatests.entitys.Customer;
import com.jonte.testing.springjpatests.interfaces.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    public void addNewCustomer(Customer customer){
        Optional<Customer> customerByEmail = customerRepository.findCustomerByEmail(customer.getEmail());
        if(customerByEmail.isPresent()){
            throw new IllegalStateException("email taken!");
        }
        else{
            customerRepository.save(customer);
        }
    }

    public void deleteCustomer(Long customerId) {
        boolean exist = customerRepository.existsById(customerId);
        if (!exist){
            throw new IllegalStateException("customer with id " + customerId + " does not exist");
        }
        else{
            customerRepository.deleteById(customerId);
        }
    }

    @Transactional // gör att vi inte behöver skriva en query i CustomerService till databasen
    public void updateCustomer(Long customerId, String name, String email) {
        // kollar om customer med det id finns  annars kastar vi ett exception
        Customer customer = customerRepository.findById(customerId).orElseThrow(() ->
                new IllegalStateException("customer with id " + customerId + " does not exist!"));

        // om namnet inte är null, är längre en noll och inte är likadant som innan. Så uppdatera namnet
        if(name != null
                && name.length() > 0
                && !Objects.equals(customer.getFirstName(),name)) {

            customer.setFirstName(name);
        }

        // om namnet inte är null, är längre en noll och inte är likadant som innan. Så uppdatera namnet
        if(email != null
                && name.length() > 0
                && !Objects.equals(customer.getEmail(),email)) {

            Optional<Customer> customerOptional = customerRepository.findCustomerByEmail(email);
            if(customerOptional.isPresent()){
                throw new IllegalStateException("email taken!");
            }
            customer.setEmail(email);
        }


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
