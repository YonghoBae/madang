package com.example.DBTest.controller;

import com.example.DBTest.entity.VwOrdersEntity;
import com.example.DBTest.service.VwOrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vw-orders")
@RequiredArgsConstructor
public class VwOrdersController {
    private final VwOrdersService vwOrdersService;

    @GetMapping
    public List<VwOrdersEntity> getAllOrders() {
        return vwOrdersService.findAllOrders();
    }

    @GetMapping("/{id}")
    public VwOrdersEntity getOrder(@PathVariable Integer id) {
        return vwOrdersService.findOrderById(id);
    }

    @PostMapping
    public ResponseEntity<String> createOrder(@RequestBody VwOrdersEntity order) {
        vwOrdersService.saveOrder(order);
        return ResponseEntity.ok("Order created successfully");
    }

    @PutMapping
    public ResponseEntity<String> updateOrder(@RequestBody VwOrdersEntity updatedOrder) {
        vwOrdersService.updateOrder(updatedOrder);
        return ResponseEntity.ok("Order updated successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteOrder(@PathVariable Integer id) {
        vwOrdersService.deleteOrder(id);
        return ResponseEntity.ok("Order deleted successfully");
    }
}
