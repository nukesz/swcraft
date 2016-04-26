package org.swcraft.java8.methodref;

import java.util.List;
import static java.util.stream.Collectors.toList;
import org.swcraft.java8.data.Movie;
import org.swcraft.java8.data.SampleData;

public class StarWarsTitles {
    
    public static void main(String[] args) {
        List<String> titles = SampleData.starWarsMovies.stream()
                .map(movie -> movie.getTitle())
                .collect(toList());
        System.out.println(titles);
        
        List<String> titlesWithMethodRef = SampleData.starWarsMovies.stream()
                .map(Movie::getTitle)
                .collect(toList());
        System.out.println(titlesWithMethodRef);
        
        SampleData.starWarsMovies.stream()
                .map(Movie::getTitle)
                .forEach(System.out::print);
    }
}
