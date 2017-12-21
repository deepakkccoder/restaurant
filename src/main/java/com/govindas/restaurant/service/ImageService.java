package com.govindas.restaurant.service;

import com.govindas.restaurant.model.Image;

import java.util.List;

public interface ImageService {
    Image save(Image image);
    void delete(Integer id);
    List<Image> getAll();




}
