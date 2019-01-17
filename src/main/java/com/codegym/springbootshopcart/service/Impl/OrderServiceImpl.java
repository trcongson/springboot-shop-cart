package com.codegym.springbootshopcart.service.Impl;

import com.codegym.springbootshopcart.model.Order;
import com.codegym.springbootshopcart.repository.OrderRepository;
import com.codegym.springbootshopcart.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Iterable<Order> findAll() {
        return this.orderRepository.findAll();
    }

    @Override
    public Order findById(Integer id) {
        return this.orderRepository.findById(id).get();
    }

    @Override
    public void save(Order order) {
        this.orderRepository.save(order);
    }

    @Override
    public void delete(Integer id) {
        this.orderRepository.deleteById(id);
    }
}
