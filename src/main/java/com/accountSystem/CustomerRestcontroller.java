package com.accountSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
// börjar skriva cruden här länka till service
@RestController  // visar att det är en rest controller bean
@RequestMapping("/customersJSON")
public class CustomerRestcontroller {

    // hämtar in Customerservice för att kunna använda dess metoder
    private final CustomerService customerService;

    // construktor för customerservice
    // @Autowired injektar "customerService" objektet in i "CustomerController" classen
    @Autowired
    public CustomerRestcontroller(CustomerService customerService) {
        this.customerService = customerService;
    }


    // CRUD
    @GetMapping
    public List getCustomer(Customer customer) {
        List customerList = customerService.getCustomers();
        return customerList;
    }

}