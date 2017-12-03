package com.govindas.restaurant.service;

import com.govindas.restaurant.model.Orders;

import java.util.List;

public interface OrderService {
    List<Orders> getAll();
    List<Orders> getByUserId(int id);
    Orders getById(int id);
    Orders save(Orders orders);
    void delete(int id);
}
