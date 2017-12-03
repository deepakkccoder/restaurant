package com.govindas.restaurant.serviceImpl;

import com.govindas.restaurant.model.Item;
import com.govindas.restaurant.repository.ItemRepository;
import com.govindas.restaurant.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;
    @Override
    public List<Item> getAll() {
        return (List<Item>) itemRepository.findAll();
    }

    @Override
    public Item getById(int id) {
        return itemRepository.findOne(id);
    }

    @Override
    public List<Item> findByCategory(String cName) {
        return itemRepository.findByCategory(cName);
    }

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void delete(int id) {
        itemRepository.delete(id);
    }
}
