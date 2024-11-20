package com.example.DBTest.controller;

import com.example.DBTest.entity.OrdersEntity;
import com.example.DBTest.service.OrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrdersController {
    private final OrdersService ordersService;

    @GetMapping
    public List<OrdersEntity> getAllOrders() {
        return ordersService.findAllOrders();
    }

    @GetMapping("/{id}")
    public OrdersEntity getOrder(@PathVariable Integer id) {
        return ordersService.findOrderById(id);
    }

    @PostMapping
    public ResponseEntity<String> createOrder(@RequestBody OrdersEntity order) {
        ordersService.saveOrder(order);
        return ResponseEntity.ok("Order created successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteOrder(@PathVariable Integer id) {
        ordersService.deleteOrder(id);
        return ResponseEntity.ok("Order deleted successfully");
    }
}
