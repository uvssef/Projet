package net.lamine.customerservice.service;

import net.lamine.customerservice.entites.Customer;
import net.lamine.customerservice.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllConstumers(){
        return customerRepository.findAll();
    }

    public Customer FindCustomerById(Long id){
        return customerRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Customer not Found "));
    }

    public Customer saveCustomer(Customer customer){
       return customerRepository.save(customer);
    }
}
