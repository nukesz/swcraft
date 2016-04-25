package org.swcraft.java8.defaultmethod;

public interface Parent {

    public String getMessage();

    public default String welcome() {
        return "Parent says: " + getMessage() + "!";
    }
}
