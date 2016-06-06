package org.swcraft.testing.vegas.dep;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class RouletteTest {

    private Roulette cut; // cut == class under test

    @Before
    public void setUp() throws Exception {
        NumberGenerator mockNumberGenerator = new NumberGenerator() {
            @Override
            int generate(int maxBound) {
                return 0;
            }
        };
        cut = new Roulette(mockNumberGenerator);
    }

    @Test
    public void betOnTheLosingNumber() throws Exception {
        BigDecimal amountToBet = new BigDecimal("10");
        BigDecimal result = cut.bet(amountToBet, 1);
        assertThat(result, is(equalTo(BigDecimal.ZERO)));
    }

    @Test
    public void betOnTheWinningNumber() throws Exception {
        BigDecimal amountToBet = new BigDecimal("10");
        BigDecimal result = cut.bet(amountToBet, 0);
        BigDecimal expectedWin = new BigDecimal("350");
        assertThat(result, is(equalTo(expectedWin)));
    }
}