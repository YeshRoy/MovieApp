package com.example.movie.service;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movie.entity.MovieTime;
import com.example.movie.repo.MovieRepo;

@Service
public class MovieServiceImp implements MovieService {
	
	@Autowired
	private MovieRepo repo;

	

	@Override
	public MovieTime addMovie(MovieTime movieTime) {
//		int length_of_random=6;
//        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
//        String specialCharacters = "@#$";
//        String numbers = "1234567890";
//        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
//        Random random = new Random();
//        char[] password = new char[length_of_random];
//
//
//
//       password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
//        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
//        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
//        password[3] = numbers.charAt(random.nextInt(numbers.length()));
//     
//        for(int i = 4; i< length_of_random ; i++) {
//           password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
//        }
//        
//        String pass=String.valueOf(password);
//        movieTime.setMovieId(pass);
//        
		return repo.save(movieTime);
	}

	@Override
	public MovieTime updateMovie(MovieTime movieTime, String id) {
		Optional<MovieTime> id2 = repo.findById(id);
		if(id2!=null) {
			
		}
		return null;
	}

	@Override
	public void deleteMovie(String id) {

	}

	@Override
	public MovieTime getMovieById(Long id) {
		return repo.findByMovieId(id).get();
	}

	

}
