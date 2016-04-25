package org.swcraft.java8.defaultmethod.multiple;

public class C implements A, B {

    @Override
    public void method() {
        A.super.method();
        // or/and B.super.method();
    }
}
