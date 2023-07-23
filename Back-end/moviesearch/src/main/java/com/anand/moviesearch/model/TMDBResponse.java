package com.anand.moviesearch.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TMDBResponse {
	
	int page;
	List<TMDBMovie> results;
	int total_pages;
	int total_results;

}
