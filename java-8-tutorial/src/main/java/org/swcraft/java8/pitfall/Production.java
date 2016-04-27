package org.swcraft.java8.pitfall;

import java.util.ArrayList;
import java.util.List;

public class Production {

    private final List<String> features = new ArrayList<>();

    public Production() {
        features.add("Feature1");
        features.add("Feature2");
        features.add("Feature3");
        features.add("Bug");
        features.add("Feature4");
        features.add("Feature5");
    }

    // Run this method every week to make sure we don't have any bugs in the system.
    public void huntDownTheBugs() {
        for (String feature : features) {
            if ("Bug".equals(feature)) {
                System.out.println("Found one bug!");
                features.remove(feature);
            }
        }
    }

    public static void main(String[] args) {
        Production prod = new Production();
        prod.huntDownTheBugs();
    }
}
