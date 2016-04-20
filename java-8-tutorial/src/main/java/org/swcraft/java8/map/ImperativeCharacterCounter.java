package org.swcraft.java8.map;

import java.util.ArrayList;
import java.util.List;

import org.swcraft.java8.data.SampleData;

public class ImperativeCharacterCounter {

    public static void main(String[] args) {
        // Count the characters in each string
        // List<String> -> List<Integer>
        
        List<Integer> namesLength = new ArrayList<>();
        for (String name : SampleData.names) {
            namesLength.add(name.length());
        }
        System.out.println(namesLength);
    }
}
