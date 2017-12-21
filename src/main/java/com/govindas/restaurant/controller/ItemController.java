package com.govindas.restaurant.controller;

import com.govindas.restaurant.model.Item;
import com.govindas.restaurant.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/govindas")
public class ItemController {
    @Autowired
    private ItemService itemService;
    @GetMapping("/items")
    public List<Item> getAll(){
        return itemService.getAll();
    }

    @PostMapping("/item")
    public Item save(@RequestBody Item item){
        return  itemService.save(item);
    }
    @DeleteMapping("/item/{id}")
    public void delete(@PathVariable Integer id){
        itemService.delete(id);
    }
    @PutMapping("/item/{id}")
    public Item update(@RequestBody Item item, @PathVariable Integer id) {
        Item updatedItem = item;
        return  itemService.save(item);
    }


}
