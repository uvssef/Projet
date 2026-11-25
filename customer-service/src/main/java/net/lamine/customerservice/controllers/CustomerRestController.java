package net.lamine.customerservice.controllers;

import net.lamine.customerservice.entites.Customer;
import net.lamine.customerservice.repository.CustomerRepository;
import net.lamine.customerservice.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CustomerRestController {
    private CustomerService customerService;

    public CustomerRestController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public List<Customer> getAllConstumers(){
        return customerService.getAllConstumers();
    }
    @GetMapping("/customers/{id}")

    public Customer FindCustomerById(@PathVariable  Long id){
        return customerService.FindCustomerById(id);
    }
    @PostMapping("/customers")

    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }
}
