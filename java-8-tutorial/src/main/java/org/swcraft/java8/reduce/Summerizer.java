package org.swcraft.java8.reduce;

import java.util.Arrays;
import java.util.List;

import org.swcraft.java8.data.Movie;
import org.swcraft.java8.data.SampleData;

public class Summerizer {

    public static void main(String[] args) {
        // Sum the movies duration
        int sumOfMovies = 0;
        for (Movie movie: SampleData.starWarsMovies) {
            sumOfMovies += movie.getDuration();
        }
        System.out.println(sumOfMovies);
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // Sum the number from 1 to 5
        // Gauss (5 + 6) / 2
        int sumOfNumber = 0;
        for (Integer number : numbers) {
            sumOfNumber += number;
        }
        System.out.println(sumOfNumber);
        
        // Factorial of 5: 5 * 4 * 3 * 2 * 1
        int factorial = 1;
        for (int i = 5; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);

        // Building string
        StringBuilder builder = new StringBuilder();
        for (String name: SampleData.names) {
            builder.append(name);
        }
        System.out.println(builder.toString());
        
        // The pattern should be visible:
        // Object acc = init;
        // for (Object element: collection) { 
        //    acc = fold(acc, element);
        // }
    }
}
