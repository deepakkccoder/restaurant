package com.govindas.restaurant.service;


import com.govindas.restaurant.model.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> getAll();
    public Category getById(int id);
    public Category getByName(String name);
    public void delete(int id);
    public Category save(Category category);

}
