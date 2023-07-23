package com.anand.moviesearch.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TMDBMovie {


    boolean adult;
    String backdrop_path;
    List<Integer> genre_ids;
    int id;
    String original_language;
    String original_title;
    String overview;
    float popularity;
    String poster_path;
    String release_date;
    String title;
    boolean video;
    int vote_average;
    int vote_count;
    
}
