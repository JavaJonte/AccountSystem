package com.jonte.testing.springjpatests.entitys;

import com.jonte.testing.springjpatests.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController // visar att det är en rest controller bean
@RequestMapping("/api/v1/customer")
public class CustomerController {

    // hämtar in Customerservice för att kunna använda dess metoder
    private final CustomerService customerService;
    // construktor för customerservice
    // @Autowired injektar "customerService" objektet in i "CustomerController" classen
    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List <Customer> getCustomer(){
        return customerService.getCustomers();
    }

    @PostMapping
    public void registerNewCustomer(@RequestBody Customer customer){
        customerService.addNewCustomer(customer);
    }
}