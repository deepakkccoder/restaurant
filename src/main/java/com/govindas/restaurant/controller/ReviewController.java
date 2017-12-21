package com.govindas.restaurant.controller;

import com.govindas.restaurant.model.Review;
import com.govindas.restaurant.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/govindas")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;
    @GetMapping("/reviews")
    public List<Review> getAll(){
        return (List<Review>) reviewService.findAll();
    }
    @GetMapping("/reviews/category/{iName}")
    public List<Review> getByCategory(@PathVariable String iName){
        return reviewService.findByItemName(iName);
    }
}
