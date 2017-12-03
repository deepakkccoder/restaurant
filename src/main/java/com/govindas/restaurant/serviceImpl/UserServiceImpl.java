package com.govindas.restaurant.serviceImpl;

import com.govindas.restaurant.model.Role;
import com.govindas.restaurant.model.User;
import com.govindas.restaurant.repository.UserRepository;
import com.govindas.restaurant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User getById(int id) {
        return userRepository.findOne(id);
    }

    @Override
    public User getUserByPhone(String phone) {
        return userRepository.findByPhoneNumber(phone);
    }

    @Override
    public List<User> getUserByName(String name) {
        return userRepository.findAllByFirstName(name
        );
    }

    @Override
    public List<User> getUserByRole(String role) {
        return userRepository.findByRole(role);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(int id) {
        userRepository.delete(id);
    }

    @Override
    public User findByAccount(String username, String password) {
        return userRepository.findByAccount(username, password);
    }
}
