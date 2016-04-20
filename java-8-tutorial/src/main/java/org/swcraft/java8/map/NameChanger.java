package org.swcraft.java8.map;

import java.util.List;
import java.util.stream.Collectors;

import org.swcraft.java8.data.SampleData;

public class NameChanger {

    public static void main(String[] args) {
        List<String> convertedNames = SampleData.names.stream()
                .map(name -> name.toLowerCase())
                .collect(Collectors.toList());
        System.out.println(convertedNames);
    }
}
