package org.swcraft.java8.streams.filter;

import java.util.List;

import org.swcraft.java8.data.SampleData;

public class LambdaPositiveNumberCounter {

    private static long getCountOfPositiveNumbers(List<Integer> list) {
        return list.stream()
                   .filter(number -> number > 0)
                   .count();
    }

    public static void main(String[] args) {
        System.out.println(getCountOfPositiveNumbers(SampleData.numbers));
    }
}
