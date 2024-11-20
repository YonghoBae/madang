package com.example.DBTest.service;

import com.example.DBTest.entity.CustomerEntity;
import com.example.DBTest.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public List<CustomerEntity> findAllCustomers() {
        return customerRepository.findAll();
    }

    public CustomerEntity findCustomerById(Integer id) {
        return customerRepository.findById(id).orElseThrow();
    }

    public void saveCustomer(CustomerEntity customer) {
        customerRepository.save(customer);
    }

    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }
}
