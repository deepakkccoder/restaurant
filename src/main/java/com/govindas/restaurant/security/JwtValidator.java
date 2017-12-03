package com.govindas.restaurant.security;

import com.govindas.restaurant.model.Role;
import com.govindas.restaurant.model.User;
import com.govindas.restaurant.service.UserService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JwtValidator {

    @Autowired
    private UserService userService;
    private String  secret= "govindas";
    public User validate(String token) {
        User user =null;
        try {
            Jws<Claims> jws = Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token);

            user = userService.getById((Integer) jws.getBody().get("userId"));
        }catch (Exception e){
            System.out.print(e);
        }
        return user;

    }
}
