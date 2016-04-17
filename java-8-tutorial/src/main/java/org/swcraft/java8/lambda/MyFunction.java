package org.swcraft.java8.lambda;

@FunctionalInterface
public interface MyFunction<T, R> {

    T apply(R r);
}
