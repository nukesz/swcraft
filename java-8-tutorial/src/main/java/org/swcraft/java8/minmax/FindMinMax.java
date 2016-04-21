package org.swcraft.java8.minmax;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.swcraft.java8.data.Movie;

public class FindMinMax {
    
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Star Wars: Episode I - The Phantom Menace", 136, 1999));
        movies.add(new Movie("Star Wars: Episode II - Attack of the Clones", 142, 2002));
        movies.add(new Movie("Star Wars: Episode III - Revenge of the Sith", 140, 2005));
        movies.add(new Movie("Star Wars: Episode IV - A New Hope", 121, 1977));
        movies.add(new Movie("Star Wars: Episode V - The Empire Strikes Back", 124, 1980));
        movies.add(new Movie("Star Wars: Episode VI - Return of the Jedi", 131, 1983));
        movies.add(new Movie("Star Wars: Episode VII - The Force Awakens", 136, 2015));
        
        // Find the longest movie, before java 8..
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
        
        Movie earliestMovieWithMin = movies.stream().min(Comparator.comparing(movie -> movie.getDuration())).get();
        System.out.println(earliestMovieWithMin);
    }
}
