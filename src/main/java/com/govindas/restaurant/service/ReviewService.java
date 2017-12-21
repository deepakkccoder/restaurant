package com.govindas.restaurant.service;


import com.govindas.restaurant.model.Review;


import java.util.List;

public interface ReviewService {
    List<Review> findAll();
    Review findById(Integer id);
    Review save(Review review);
    void delete(Integer id);
    List<Review> findByItemName(String iName);


}
