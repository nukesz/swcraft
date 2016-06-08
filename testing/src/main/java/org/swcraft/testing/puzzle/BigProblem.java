package org.swcraft.testing.puzzle;

import java.math.BigInteger;

public class BigProblem {

    public static void main(String[] args) {
        BigInteger fourThousand = new BigInteger("4000");
        BigInteger fortyThousand = new BigInteger("40000");
        BigInteger fourHundredThousand = new BigInteger("400000");
        BigInteger fourBillion = new BigInteger("4000000000");

        BigInteger total = BigInteger.ZERO;
        total.add(fourThousand);
        total.add(fortyThousand);
        total.add(fourHundredThousand);
        total.add(fourBillion);
        System.out.println(total);
    }
}
