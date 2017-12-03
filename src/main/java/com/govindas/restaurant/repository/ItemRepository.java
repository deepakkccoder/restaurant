package com.govindas.restaurant.repository;

import com.govindas.restaurant.model.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {

    @Query("SELECT item from Item item where item.category.name =:name")
    List<Item> findByCategory(@Param("name") String name);


}
