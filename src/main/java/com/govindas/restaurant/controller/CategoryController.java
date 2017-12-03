package com.govindas.restaurant.controller;


import com.govindas.restaurant.model.Category;
import com.govindas.restaurant.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/govindas")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> getCategories(){
        return categoryService.getAll();
    }
    @GetMapping("/category/{id}")
    public Category getCategory(@PathParam("id")int id){
        return categoryService.getById(id);
    }

    @GetMapping("/category/name/{name}")
    public Category getCategory(@PathParam("name")String name){
        return categoryService.getByName(name);
    }
    @PostMapping("/category")
    public Category saveCategory(@RequestBody Category category){
        return categoryService.save(category);
    }
    @DeleteMapping("/category/{id}")
    public void delete(@PathParam("id") int id){
        categoryService.delete(id);

    }
    @PutMapping("/category/{id}")
    public Category edit(@RequestBody Category category, @PathParam("id")int id){
        Category updatedCategory = category;
        return categoryService.save(updatedCategory);

    }

}
