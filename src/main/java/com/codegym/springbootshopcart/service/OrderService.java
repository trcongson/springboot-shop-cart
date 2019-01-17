package com.codegym.springbootshopcart.service;

import com.codegym.springbootshopcart.model.Order;

public interface OrderService {
    Iterable<Order> findAll();

    Order findById(Integer id);

    void save(Order order);

    void delete(Integer id);
}
