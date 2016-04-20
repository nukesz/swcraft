package org.swcraft.java8.streams.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateCollection {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> filtered = list.stream().filter(number -> number > 3).collect(Collectors.toList());
        System.out.println(filtered);
        
        // Create a stream on the fly
        Stream<Integer> stream = Stream.of(1, 2, 3);
        long count = stream.filter(number -> number > 2).count();
        System.out.println("count = " + count);
    }
}
