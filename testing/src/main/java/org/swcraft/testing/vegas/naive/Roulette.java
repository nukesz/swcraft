package org.swcraft.testing.vegas.naive;

import java.math.BigDecimal;
import java.util.Random;

public class Roulette {

    private static final int MAX_NUMBER = 37;
    private static final BigDecimal SINGLE_HIT_MULTIPLICAND = new BigDecimal("35");

    public BigDecimal bet(BigDecimal amount, int number) {
        Random randomGenerator = new Random();
        int rolled = randomGenerator.nextInt(MAX_NUMBER);
        if (rolled == number) {
            return amount.multiply(SINGLE_HIT_MULTIPLICAND);
        } else {
            return BigDecimal.ZERO;
        }
    }

}
