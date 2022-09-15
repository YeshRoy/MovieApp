package com.example.movie.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.movie.entity.TheatreEntity;

@Repository
public interface TheatreEntityRepo extends JpaRepository<TheatreEntity, Integer> {

}
