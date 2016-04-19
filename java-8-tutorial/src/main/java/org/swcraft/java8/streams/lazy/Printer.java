package org.swcraft.java8.streams.lazy;

import org.swcraft.java8.data.SampleData;

public class Printer {
    
    public static void main(String[] args) {
        SampleData.names.stream()
                        .filter(name -> {
                            System.out.println(name);
                            return name.startsWith("G");
                        })
                        .count();
        // Output?
        
        long count = SampleData.names.stream()
                        .filter(name -> name.startsWith("G"))
                        .count();
        System.out.println("count = " + count);
    }
}
