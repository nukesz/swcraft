package org.swcraft.springframework.core.configuration.xml;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieFinder {

    private List<Movie> movies = new ArrayList<>();

    public MovieFinder() {
        System.out.println("Calling constructor");
    }

    public void init() {
        System.out.println("Initializing MovieFinder class");
        movies.addAll(Arrays.asList(new Movie("The Godfather"), new Movie("The Dark Knight "),
                new Movie("Pulp Fiction")));
    }

    public void destroy() {
        System.out.println("Closing MovieFinder class");
    }


    public List<Movie> findAll() {
        return movies;
    }
}
