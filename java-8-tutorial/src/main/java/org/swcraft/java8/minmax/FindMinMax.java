package org.swcraft.java8.minmax;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import org.swcraft.java8.data.Movie;
import org.swcraft.java8.data.SampleData;

public class FindMinMax {
    
    public static void main(String[] args) {
        // Find the longest movie, before java 8..
        List<Movie> movies = new ArrayList<Movie>(SampleData.starWarsMovies);
        Movie longestMovie = movies.isEmpty() ? null : movies.get(0); // To avoid exceptions if the list is empty..
        for (Movie movie : movies) {
            if (movie.getDuration() > longestMovie.getDuration()) {
                longestMovie = movie;
            }
        }
        System.out.println(longestMovie);
        
        // With java 8
        Movie longestMovieWithMax = movies.stream().max(Comparator.comparing(movie -> movie.getDuration())).get();
        System.out.println(longestMovieWithMax);
        
        // Find the earliest movie, before java 8... (copy past?) 
        Movie earliestMovie = movies.isEmpty() ? null : movies.get(0); // To avoid exceptions if the list is empty..
        for (Movie movie : movies) {
            if (movie.getReleaseYear() < earliestMovie.getReleaseYear()) {
                earliestMovie = movie;
            }
        }
        System.out.println(earliestMovie);
        
        Movie earliestMovieWithMin = movies.stream().min(Comparator.comparing(movie -> movie.getReleaseYear())).get();
        System.out.println(earliestMovieWithMin);
        
        // What about empty list? No more NullPointerException!
        List<Movie> emptyMovies = new ArrayList<>();
        Optional<Movie> maybe = emptyMovies.stream().min(Comparator.comparing(movie -> movie.getReleaseYear()));
        System.out.println(maybe.isPresent());
        System.out.println(maybe.get());
    }
}
