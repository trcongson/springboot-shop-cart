package com.codegym.springbootshopcart.repository;

import com.codegym.springbootshopcart.model.Quantity;
import org.springframework.data.repository.CrudRepository;

public interface QuantityRepository extends CrudRepository <Quantity, Integer> {
}
