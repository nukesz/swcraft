package org.swcraft.java8.reduce;

import java.util.Arrays;
import java.util.List;

public class SummerizeWithReduce {
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sumOfNumber = numbers.stream().reduce(0, (acc, number) -> acc + number);
        System.out.println(sumOfNumber);
        
        int factorial = numbers.stream().reduce(1, (acc, number) -> acc * number);
        System.out.println(factorial);
    }
}
