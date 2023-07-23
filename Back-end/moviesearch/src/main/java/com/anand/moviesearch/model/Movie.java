package com.anand.moviesearch.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Movie {

	private String movieTitle;
	private String movieReleaseDate;
	private String movieOverview;
	private long movieRating;
}
