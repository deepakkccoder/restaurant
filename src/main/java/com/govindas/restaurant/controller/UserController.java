package com.govindas.restaurant.controller;

import com.govindas.restaurant.model.User;
import com.govindas.restaurant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/govindas")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> findAll(){
        return  userService.getAll();
    }
    @GetMapping("/user/{id}")
    public User findById(@PathParam("id") int id){
        return  userService.getById(id);
    }
    @GetMapping("/user/role/{role}")
    public  List<User> findByRole(@PathParam("role")String role){
        return  userService.getUserByRole(role);
    }
    @GetMapping("/user/phone/{phone}")
    public User findByPhone(@PathParam("phone")String phone){
        return  userService.getUserByPhone(phone);
    }
    @PostMapping("/user")
    public User save(@RequestBody User user){
        return  userService.save(user);
    }
    @PutMapping("/user/{id}")
    public User update(@RequestBody User user, @PathParam("id") int id){
        User updateUser = user;
        return  userService.save(updateUser);
    }
    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable("id")Integer id){
        userService.delete(id);
    }


}
