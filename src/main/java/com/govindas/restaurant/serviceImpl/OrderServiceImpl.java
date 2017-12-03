package com.govindas.restaurant.serviceImpl;

import com.govindas.restaurant.model.Orders;
import com.govindas.restaurant.repository.OrderRepository;
import com.govindas.restaurant.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    private OrderRepository orderRepository;
    @Override
    public List<Orders> getAll() {
        return (List<Orders>) orderRepository.findAll();
    }

    @Override
    public List<Orders> getByUserId(int id) {
        return  orderRepository.findAllByUserId(id);
    }

    @Override
    public Orders getById(int id) {
        return orderRepository.findOne(id);

    }

    @Override
    public Orders save(Orders orders) {
        return orderRepository.save(orders);
    }

    @Override
    public void delete(int id) {
        orderRepository.delete(id);

    }
}
