package org.swcraft.java8.streams;

import java.util.Iterator;
import java.util.List;

import org.swcraft.java8.data.SampleData;

public class ImperativePositiveNumberCounter {

    private static int getCountOfPositiveNumbers(List<Integer> list) {
        int count = 0;
        for (Integer number : list) {
            if (number > 0) {
                count++;
            }
        }
        return count;
    }

    private static int getCountOfPositiveNumbersWithIterator(List<Integer> list) {
        int count = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number > 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getCountOfPositiveNumbers(SampleData.numbers));
        System.out.println(getCountOfPositiveNumbersWithIterator(SampleData.numbers));
    }

}
