package org.swcraft.testing.vegas.dep;

import java.math.BigDecimal;

public class Roulette {

    private static final int MAX_NUMBER = 37;
    private static final BigDecimal SINGLE_HIT_MULTIPLICAND = new BigDecimal("35");
    private final NumberGenerator generator;

    public Roulette(NumberGenerator generator) {
        this.generator = generator;
    }

    public BigDecimal bet(BigDecimal amount, int number) {
        if (generator.generate(MAX_NUMBER) == number) {
            return amount.multiply(SINGLE_HIT_MULTIPLICAND);
        } else {
            return BigDecimal.ZERO;
        }
    }

}
