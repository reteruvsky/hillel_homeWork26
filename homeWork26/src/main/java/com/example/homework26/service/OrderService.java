package com.example.homework26.service;

import com.example.homework26.entity.Order;

import java.util.List;

public interface OrderService {
    public Order getById(Long id);

    public List<Order> getAll();
}
