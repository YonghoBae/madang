package com.example.DBTest.service;

import com.example.DBTest.entity.VwOrdersEntity;
import com.example.DBTest.repository.VwOrdersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VwOrdersService {
    private final VwOrdersRepository vwOrdersRepository;

    public List<VwOrdersEntity> findAllOrders() {
        return vwOrdersRepository.findAll();
    }

    public VwOrdersEntity findOrderById(Integer id) {
        return vwOrdersRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("Order not found with ID: " + id));
    }

    public void saveOrder(VwOrdersEntity order) {
        vwOrdersRepository.save(order);
    }

    public void updateOrder(VwOrdersEntity updatedOrder) {
        VwOrdersEntity existingOrder = vwOrdersRepository.findById(updatedOrder.getOrderId())
                .orElseThrow(() -> new IllegalArgumentException("Order not found with ID: " + updatedOrder.getOrderId()));
        existingOrder.setCustId(updatedOrder.getCustId());
        existingOrder.setName(updatedOrder.getName());
        existingOrder.setBookId(updatedOrder.getBookId());
        existingOrder.setBookName(updatedOrder.getBookName());
        existingOrder.setSalePrice(updatedOrder.getSalePrice());
        existingOrder.setOrderDate(updatedOrder.getOrderDate());
        vwOrdersRepository.save(existingOrder);
    }

    public void deleteOrder(Integer id) {
        vwOrdersRepository.deleteById(id);
    }
}
