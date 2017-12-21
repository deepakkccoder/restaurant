package com.govindas.restaurant.repository;

import com.govindas.restaurant.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    @Query("SELECT u from User u where u.phoneNumber = :phone")
    User findByPhoneNumber(@Param("phone")String phone);

    @Query("SELECT u from User u where u.account.username =:username and u.account.password =:password")
    User findByAccount(@Param("username")String username, @Param("password")String password);

    @Query("SELECT  u from User u where u.firstName  = :firstName")
    List<User> findAllByFirstName(@Param("firstName") String firstName);

    @Query("SELECT u from User u where u.account.role =:role")
    List<User> findByRole(@Param("role")String role);
}
