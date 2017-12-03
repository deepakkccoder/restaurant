package com.govindas.restaurant.controller;

import com.govindas.restaurant.model.User;
import com.govindas.restaurant.security.JwtGenerator;
import com.govindas.restaurant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/token")
public class TokenController {

    @Autowired
    private UserService userService;

    private JwtGenerator jwtGenerator;
    public TokenController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping
    public String generate(@RequestBody  User user) {
        User user1 = userService.findByAccount(user.getAccount().getUsername(), user.getAccount().getPassword());
        return jwtGenerator.generate(user1);

    }
}
