package com.govindas.restaurant.repository;

import com.govindas.restaurant.model.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {

    @Query("SELECT c from Category c where c.name = :name")
    Category findAllByName(@Param("name")String name);

}
