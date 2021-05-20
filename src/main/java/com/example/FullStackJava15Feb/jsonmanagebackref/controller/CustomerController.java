package com.example.FullStackJava15Feb.jsonmanagebackref.controller;

import com.example.FullStackJava15Feb.jsonmanagebackref.domain.Customer;
import com.example.FullStackJava15Feb.jsonmanagebackref.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping(value = "/saveCustomer")
    public String saveCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
        return "Customer saved successfully...";
    }

    @GetMapping(value = "/getcustomer")
    public List<Customer> getCustomer(){
        return customerRepository.findAll();
    }

}
