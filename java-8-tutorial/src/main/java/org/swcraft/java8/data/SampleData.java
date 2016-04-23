package org.swcraft.java8.data;

import java.util.Arrays;
import java.util.List;

public class SampleData {
    public static final List<Integer> numbers = Arrays.asList(1, 3, 2, -6, 7, -8, 4);
    
    public static final List<String> names = Arrays.asList("Robert", "Emma", "Steven", "Gordon", "Alisha", "John", "Garry");
    
    public static final List<Movie> starWarsMovies = Arrays.asList(
        new Movie("Star Wars: Episode I - The Phantom Menace", 136, 1999),
        new Movie("Star Wars: Episode II - Attack of the Clones", 142, 2002),
        new Movie("Star Wars: Episode III - Revenge of the Sith", 140,2005),
        new Movie("Star Wars: Episode IV - A New Hope", 121, 1977),
        new Movie("Star Wars: Episode V - The Empire Strikes Back", 124, 1980),
        new Movie("Star Wars: Episode VI - Return of the Jedi", 131, 1983),
        new Movie("Star Wars: Episode VII - The Force Awakens", 136, 2015)
    );
}
