package org.swcraft.testing.vegas.naive;

import java.math.BigDecimal;

public class CasinoExample {

    public static void main(String[] args) {
        Casino casino = new Casino();
        // System will bet...
        BigDecimal result = casino.playRoulette(BigDecimal.ONE, 5);
        System.out.println("result = " + result);

        // System will bet again...
        BigDecimal result2 = casino.playRoulette(BigDecimal.ONE, 3);
        System.out.println("result2 = " + result2);
    }
}
