package com.govindas.restaurant.serviceImpl;

import com.govindas.restaurant.model.Review;
import com.govindas.restaurant.repository.ReviewRepository;
import com.govindas.restaurant.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;
    @Override
    public List<Review> findAll() {
        return (List<Review>) reviewRepository.findAll();
    }

    @Override
    public Review findById(Integer id) {
        return reviewRepository.findOne(id);
    }

    @Override
    public Review save(Review review) {
        return reviewRepository.save(review);

    }

    @Override
    public void delete(Integer id) {
        reviewRepository.delete(id);
    }

    @Override
    public List<Review> findByItemName(String iName) {
        return reviewRepository.findByItem(iName);
    }
}
