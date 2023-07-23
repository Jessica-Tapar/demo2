package com.demo.demo2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.demo2.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, String>{

    //User findbyUsername(String username);
    
}
