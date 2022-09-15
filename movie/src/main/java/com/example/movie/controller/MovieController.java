package com.example.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.movie.entity.MovieTime;
import com.example.movie.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService service;
	
	@GetMapping("/movies/{movie_id}")
    public ResponseEntity<?> getMovieById(@PathVariable Long movie_id) {
        MovieTime movie = service.getMovieById(movie_id);
        return  new ResponseEntity(movie,HttpStatus.OK);
	}
	@PostMapping("/addmovies")
	public ResponseEntity<?> addMovie(@RequestBody MovieTime movieTime){
		MovieTime addMovie = service.addMovie(movieTime);
		return new ResponseEntity(addMovie,HttpStatus.OK);
	
	}
}
