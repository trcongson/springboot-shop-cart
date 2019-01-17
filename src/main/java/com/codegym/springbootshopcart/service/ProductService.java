package com.codegym.springbootshopcart.service;

import com.codegym.springbootshopcart.model.Product;

public interface ProductService {
     Iterable<Product> findAll();
     Product findById(int id);
     void save(Product product);
     void delete(Integer id);
}
