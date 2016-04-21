package org.swcraft.java8.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BetterTogether {

    public static void main(String[] args) {
        List<Integer> listA = Arrays.asList(1, 2, 3);
        List<Integer> listB = Arrays.asList(3, 4, 5);
        List<List<Integer>> combined = Arrays.asList(listA, listB);
        System.out.println(combined);
        
        List<Integer> flatList = combined.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println(flatList);
    }
}
