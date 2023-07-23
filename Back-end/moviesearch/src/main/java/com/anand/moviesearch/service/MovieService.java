package com.anand.moviesearch.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.anand.moviesearch.model.Movie;
import com.anand.moviesearch.model.TMDBMovie;
import com.anand.moviesearch.model.TMDBResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class MovieService {

	public List<Movie> getMovieInfo(String movieName){

		String url = "https://api.themoviedb.org/3/search/movie?query="+movieName+"&api_key=92e1b1b3f767a895719dc19758359f64";
		RestTemplate restTemplate = new RestTemplate();
        String movieResponse = restTemplate.getForObject(url, String.class);
        System.out.println(movieResponse);
        ObjectMapper objectMapper = new ObjectMapper();
        TMDBResponse movies = null;
        try {
			movies = objectMapper.readValue(movieResponse, TMDBResponse.class);
		} catch (JsonProcessingException e) {
			System.out.println("Got exceptions: "+e.getMessage());
			e.printStackTrace();
		}
        
        System.out.println(movies.getPage());
        List<Movie> movieList = new ArrayList<>();
        for(TMDBMovie responseMoive: movies.getResults()) {
        	Movie movie = new Movie();
        	movie.setMovieTitle(responseMoive.getTitle());
        	movie.setMovieReleaseDate(responseMoive.getRelease_date());
        	movie.setMovieRating(responseMoive.getVote_average());
        	movie.setMovieOverview(responseMoive.getOverview());
        	
        	movieList.add(movie);
        }
        
        return movieList;
		
	}
}
