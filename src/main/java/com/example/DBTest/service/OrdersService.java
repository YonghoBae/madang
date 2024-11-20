package com.example.DBTest.service;

import com.example.DBTest.entity.OrdersEntity;
import com.example.DBTest.repository.OrdersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrdersService {
    private final OrdersRepository ordersRepository;

    public List<OrdersEntity> findAllOrders() {
        return ordersRepository.findAll();
    }

    public OrdersEntity findOrderById(Integer id) {
        return ordersRepository.findById(id).orElseThrow();
    }

    public void saveOrder(OrdersEntity order) {
        ordersRepository.save(order);
    }

    public void deleteOrder(Integer id) {
        ordersRepository.deleteById(id);
    }
}
