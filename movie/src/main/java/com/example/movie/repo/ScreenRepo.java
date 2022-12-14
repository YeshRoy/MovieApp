package com.example.movie.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.movie.entity.ScreenDetails;

@Repository
public interface ScreenRepo extends JpaRepository<ScreenDetails, Integer> {

}
