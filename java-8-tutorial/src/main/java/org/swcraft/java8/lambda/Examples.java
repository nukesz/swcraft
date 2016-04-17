package org.swcraft.java8.lambda;

public class Examples {

    private static <T, R> void printResult(MyFunction<T, R> func, R param) {
        System.out.println(func.apply(param));
    }

    public static void main(String[] args) {
        final IntToStringConverter converter = new IntToStringConverter();
        printResult(converter, 5);

        // Multiplier anonymous class
        printResult(new MyFunction<Integer, Integer>() {
            @Override
            public Integer apply(Integer number) {
                return number * number;
            }
        }, 5);

        // Lambda expression, explicit types
        printResult((MyFunction<Integer, Integer>) (Integer x) -> x + x, 5);

        // Lambda expression, type inference
        printResult(x -> x * x, 5);
    }

}
