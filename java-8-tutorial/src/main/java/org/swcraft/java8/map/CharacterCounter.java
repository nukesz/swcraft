package org.swcraft.java8.map;

import java.util.List;
import java.util.stream.Collectors;

import org.swcraft.java8.data.SampleData;

public class CharacterCounter {

    public static void main(String[] args) {
        List<Integer> namesLength = SampleData.names.stream()
                .map(name -> name.length())
                .collect(Collectors.toList());
        System.out.println(namesLength);
    }
}
