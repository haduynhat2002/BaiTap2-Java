package com.example.baitap3.model;

import com.example.baitap3.entity.Product;

import java.util.List;

public interface UserModel {
    boolean save(Product product);
    boolean update(int id, Product productUpdate);
    boolean delete(int id);
    List<Product> findAll();
    Product findById(int id);
}
