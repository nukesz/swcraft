package org.swcraft.java8.defaultmethod.multiple;

public interface B {

    public default void method() {
        System.out.println("B::method called");
    }
}
