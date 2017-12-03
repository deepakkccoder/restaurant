package com.govindas.restaurant.repository;

import com.govindas.restaurant.model.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Integer> {
}
