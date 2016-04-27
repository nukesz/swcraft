package org.swcraft.java8.parallel;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class NotSoFast {

    public static void main(String[] args) {
        System.out.println("Number of processors: " + Runtime.getRuntime().availableProcessors());
        int maxValue = 100;
        long result = IntStream.range(0, maxValue)
                //.parallel()
                .map(NotSoFast::notOptimalIncrementer)
                .sum();

        System.out.println("result = " + result);
    }

    public static int notOptimalIncrementer(int x) {
        try {
            System.out.println(Thread.currentThread().getId() + ": " + x);
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        } catch (InterruptedException ex) {
        }
        return x;
    }
}
