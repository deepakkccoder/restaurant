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
    public Category getCategory(@PathVariable("id")int id){
        return categoryService.getById(id);
    }

    @GetMapping("/category/name/{name}")
    public Category getCategory(@PathVariable("name")String name){
        return categoryService.getByName(name);
    }
    @PostMapping("/category")
    public Category saveCategory(@RequestBody Category category){
        return categoryService.save(category);
    }
    @DeleteMapping("/category/{id}")
    public void delete(@PathVariable("id") Integer id){
        categoryService.delete(id);

    }
    @PutMapping("/category/{id}")
    public Category edit(@RequestBody Category category, @PathVariable("id")Integer id){
        Category updatedCategory = category;
        return categoryService.save(updatedCategory);

    }

}
