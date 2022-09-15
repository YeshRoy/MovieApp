package com.example.movie.service;

import com.example.movie.entity.MovieTime;

public interface MovieService {
	
	MovieTime getMovieById(Long id);
	
	MovieTime addMovie(MovieTime movieTime);
	
	MovieTime updateMovie(MovieTime movieTime, String id);
	
	void deleteMovie(String id);

}
