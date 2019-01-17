package com.codegym.springbootshopcart.service;

import com.codegym.springbootshopcart.model.Quantity;

public interface QuantityService {
    Iterable<Quantity> findAll();

    Quantity findById(Integer id);

    void save(Quantity quantity);

    void delete(Integer id);
}
