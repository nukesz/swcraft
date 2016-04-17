package org.swcraft.java8.lambda;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionInterfaces {

    public static void main(String[] args) {
        Function<String, Integer> stringToInt = x -> Integer.valueOf(x);

        Consumer<String> printer = x -> System.out.println(x);

        Predicate<Integer> isBiggerThanTen = x -> x > 10;

        Supplier<String> generateWord = () -> "Lambda";

        UnaryOperator<Integer> incrementer = x -> x++;

        BinaryOperator<Integer> multiply = (x, y) -> x * y;
    }

}
