package org.swcraft.java8.streams.foreach;

import org.swcraft.java8.data.SampleData;

public class Printer {
    public static void main(String[] args) {
        SampleData.names.stream().forEach(name -> System.out.println(name));
    }
}
