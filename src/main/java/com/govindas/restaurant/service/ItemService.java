package com.govindas.restaurant.service;

import com.govindas.restaurant.model.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemService {
    List<Item> getAll();
    Item getById(int id);
    List<Item> findByCategory(String cName);
    Item save(Item item);
    void delete(int id);
}
