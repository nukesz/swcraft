package org.swcraft.springframework.core.configuration.xml;

import java.util.List;

public class SimpleMovieLister {

    // the SimpleMovieLister has a dependency on a MovieFinder
    private MovieFinder movieFinder;

    // a constructor so that the Spring container can inject a MovieFinder
    public SimpleMovieLister(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public void listAll() {
        List<Movie> movies = movieFinder.findAll();
        movies.forEach(System.out::println);
    }
}
