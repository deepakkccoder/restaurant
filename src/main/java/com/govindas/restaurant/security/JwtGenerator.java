package com.govindas.restaurant.security;

import com.govindas.restaurant.model.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

@Component
public class JwtGenerator {
    public String generate(User user){

        String jws = Jwts.builder()
                .setSubject(user.getAccount().getUsername())
                .claim("userId", user.getId())
                .claim("role", user.getAccount().getRole())
                .signWith(SignatureAlgorithm.HS512, "govindas")
                .compact();

        return jws;


    }
}
