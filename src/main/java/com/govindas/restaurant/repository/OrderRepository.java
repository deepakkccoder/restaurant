package com.govindas.restaurant.repository;

import com.govindas.restaurant.model.Orders;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Orders, Integer> {

    @Query("SELECT order from Orders order where order.user.id = :id")
    List<Orders> findAllByUserId(int id);
}
