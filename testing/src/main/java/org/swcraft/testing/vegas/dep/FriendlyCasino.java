package org.swcraft.testing.vegas.dep;

import java.math.BigDecimal;

public class FriendlyCasino {

    public static final BigDecimal BONUS = new BigDecimal("6.6");

    private final Roulette roulette;

    public FriendlyCasino(Roulette roulette) {
        this.roulette = roulette;
    }

    public BigDecimal playRoulette(BigDecimal amount, int numberToBet) {
        BigDecimal result = roulette.bet(amount, numberToBet);
        if (result.compareTo(BigDecimal.ZERO) > 0) {
            result = result.add(BONUS);
        }
        return result;
    }
}
