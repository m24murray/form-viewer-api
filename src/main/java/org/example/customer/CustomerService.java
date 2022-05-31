package org.example.customer;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void save(){
        Customer customer = Customer.builder()
                .firstName(RandomStringUtils.randomAlphabetic(10))
                .lastName(RandomStringUtils.randomAlphabetic(10))
                .build();
        customerRepository.save(customer);
    }

    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}
