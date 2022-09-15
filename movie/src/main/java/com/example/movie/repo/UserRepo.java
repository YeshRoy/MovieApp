package com.example.movie.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.movie.entity.User;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}