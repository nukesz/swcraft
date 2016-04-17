package org.swcraft.java8.lambda;

public class IntToStringConverter implements MyFunction<String, Integer> {

    @Override
    public String apply(Integer number) {
        return String.valueOf(number);
    }

}
