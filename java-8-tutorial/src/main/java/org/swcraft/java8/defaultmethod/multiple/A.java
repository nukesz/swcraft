package org.swcraft.java8.defaultmethod.multiple;

public interface A {

    public default void method() {
        System.out.println("A::method called");
    }
}
