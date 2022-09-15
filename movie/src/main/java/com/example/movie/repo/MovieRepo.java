package com.example.movie.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.movie.entity.MovieTime;

public interface MovieRepo extends JpaRepository<MovieTime, String> {

	Optional<MovieTime> findByMovieId(Long id);

}
