package com.example.homework26.repository;

import com.example.homework26.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface OrderRepository extends CrudRepository<Order, Long> {
}
