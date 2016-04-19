package org.swcraft.java8.streams.lazy;

import org.swcraft.java8.data.SampleData;

public class LazyFilter {

    public static void main(String[] args) {
        SampleData.names
                  .stream()
                  .filter(name -> {
                      System.out.println(name);
                      return name.startsWith("G");
                  });
        // Output?
    }
}
