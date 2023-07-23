package com.anand.moviesearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anand.moviesearch.model.Movie;
import com.anand.moviesearch.service.MovieService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api/search")
public class MovieController {

	@Autowired
	MovieService movieService;
	
	@GetMapping("/movie/{movieName}")
	public ResponseEntity<List<Movie>> getMovieInfoByMovieName(@PathVariable("movieName") String movieName){
		return new ResponseEntity<List<Movie>>(movieService.getMovieInfo(movieName),HttpStatus.OK);
		
	}
}
