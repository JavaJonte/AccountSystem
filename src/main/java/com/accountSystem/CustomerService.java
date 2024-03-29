package com.accountSystem;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;



    @GetMapping
    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }




    public List<Customer> loadAllCustomers() {

        return (List<Customer>) customerRepository.findAll();
    }

    public Customer loadCustomerById(int id) {

        return customerRepository.findById(id).get();
    }

    public Customer saveCustomer(Customer customer) {

        customerRepository.save(customer);
        return loadCustomerById(customer.getId());
    }

    public void deleteCustomer(int id) {

        customerRepository.deleteById(id);
    }

    public Customer updateCustomer(Customer customer) {

        return customerRepository.save(customer);
    }




}