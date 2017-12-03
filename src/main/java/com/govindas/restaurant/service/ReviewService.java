package com.govindas.restaurant.service;

import com.govindas.restaurant.model.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewService extends CrudRepository<Review, Integer> {
}
