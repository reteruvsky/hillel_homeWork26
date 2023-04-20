package com.example.homework26.service.impl;

import com.example.homework26.entity.Order;
import com.example.homework26.repository.OrderRepository;
import com.example.homework26.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;


    @Override
    public Order getById(Long id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public List<Order> getAll() {
        return (List<Order>) orderRepository.findAll();
    }
}
