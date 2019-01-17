package com.codegym.springbootshopcart.repository;

import com.codegym.springbootshopcart.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}
