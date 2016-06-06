package org.swcraft.testing.vegas.dep;

import java.math.BigDecimal;

public class Casino {

    private final Roulette roulette;

    public Casino(Roulette roulette) {
        this.roulette = roulette;
    }

    public BigDecimal playRoulette(BigDecimal amount, int numberToBet) {
        return roulette.bet(amount, numberToBet);
    }
}
