package com.codegym.springbootshopcart.repository;

import com.codegym.springbootshopcart.model.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, Integer> {
}
