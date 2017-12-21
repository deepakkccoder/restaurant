package com.govindas.restaurant.repository;

import com.govindas.restaurant.model.Review;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Integer> {
    @Query("SELECT review from Review review where review.item.name =:name")
    List<Review> findByItem(@Param("name") String name);
}
