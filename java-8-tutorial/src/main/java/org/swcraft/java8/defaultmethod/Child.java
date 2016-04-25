package org.swcraft.java8.defaultmethod;

public interface Child extends Parent {

    @Override
    public default String welcome() {
        return "Child says: " + getMessage() + "!";
    }
}
