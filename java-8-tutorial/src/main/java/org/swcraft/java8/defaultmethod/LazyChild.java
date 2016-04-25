package org.swcraft.java8.defaultmethod;

public class LazyChild implements Child {

    @Override
    public String getMessage() {
        return "I'm sleeping now";
    }

}
