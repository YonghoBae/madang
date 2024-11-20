package com.example.DBTest.controller;

import com.example.DBTest.entity.CustomerEntity;
import com.example.DBTest.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public List<CustomerEntity> getAllCustomers() {
        return customerService.findAllCustomers();
    }

    @GetMapping("/{id}")
    public CustomerEntity getCustomer(@PathVariable Integer id) {
        return customerService.findCustomerById(id);
    }

    @PostMapping
    public ResponseEntity<String> createCustomer(@RequestBody CustomerEntity customer) {
        customerService.saveCustomer(customer);
        return ResponseEntity.ok("Customer created successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable Integer id) {
        customerService.deleteCustomer(id);
        return ResponseEntity.ok("Customer deleted successfully");
    }
}
