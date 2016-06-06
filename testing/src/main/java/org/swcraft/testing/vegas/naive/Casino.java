package org.swcraft.testing.vegas.naive;

import java.math.BigDecimal;

public class Casino {

    private final Roulette roulette;

    public Casino() {
        roulette = new Roulette();
    }

    public BigDecimal playRoulette(BigDecimal amount, int numberToBet) {
        return roulette.bet(amount, numberToBet);
    }
}
