package org.swcraft.testing.vegas.dep;

import java.math.BigDecimal;

public class CasinoExample {

    public static void main(String[] args) {
        // Specify the dependencies explicit
        NumberGenerator numberGenerator = new NumberGenerator();
        Roulette roulette = new Roulette(numberGenerator);
        Casino casino = new Casino(roulette);
        // User will bet...
        BigDecimal result = casino.playRoulette(BigDecimal.ONE, 5);
        System.out.println("result = " + result);

        // User will bet again...
        BigDecimal result2 = casino.playRoulette(BigDecimal.ONE, 3);
        System.out.println("result2 = " + result2);
    }
}
