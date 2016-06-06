package org.swcraft.testing.vegas.dep;

import java.util.Random;

public class NumberGenerator {

    int generate(int maxBound) {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(maxBound);
    }
}
