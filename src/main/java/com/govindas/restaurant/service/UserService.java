package com.govindas.restaurant.service;


import com.govindas.restaurant.model.Role;
import com.govindas.restaurant.model.User;
import java.util.List;

public interface UserService {
    public List<User> getAll();
    public User getById(int id);
    public User getUserByPhone(String phone);
    public List<User> getUserByName(String name);
    public List<User> getUserByRole(String role);
    public User save(User user);
    public void delete(int id);
    public User findByAccount(String username, String password);
}
