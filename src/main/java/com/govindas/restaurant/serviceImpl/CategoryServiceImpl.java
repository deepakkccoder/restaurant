package com.govindas.restaurant.serviceImpl;

import com.govindas.restaurant.model.Category;
import com.govindas.restaurant.repository.CategoryRepository;
import com.govindas.restaurant.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<Category> getAll() {
        return (List<Category>) categoryRepository.findAll();
    }

    @Override
    public Category getById(int id) {
        return categoryRepository.findOne(id);
    }

    @Override
    public Category getByName(String name) {
        return categoryRepository.findAllByName(name);
    }

    @Override
    public void delete(Integer id) {
        categoryRepository.delete(id);

    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }
}
