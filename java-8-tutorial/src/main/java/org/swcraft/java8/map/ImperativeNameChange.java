package org.swcraft.java8.map;

import java.util.ArrayList;
import java.util.List;

import org.swcraft.java8.data.SampleData;

public class ImperativeNameChange {

    public static void main(String[] args) {
        // Convert names to lowercase
        List<String> convertedNames = new ArrayList<>();
        for (String name : SampleData.names) {
            String lowerCaseName = name.toLowerCase();
            convertedNames.add(lowerCaseName);
        }
        System.out.println(convertedNames);
    }
}
