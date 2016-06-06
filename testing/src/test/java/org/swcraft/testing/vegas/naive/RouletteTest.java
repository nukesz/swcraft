package org.swcraft.testing.vegas.naive;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class RouletteTest {

    @Test
    public void createRoulette() throws Exception {
        Roulette roulette = new Roulette();
        assertNotNull(roulette);
    }

    @Test
    public void betSomeMoney() throws Exception {
        Roulette roulette = new Roulette();
        BigDecimal amountToBet = new BigDecimal("10");
        BigDecimal result = roulette.bet(amountToBet, 1);
        BigDecimal expectedWin = new BigDecimal("350");
        // either lose or win
        assertThat(result, either(is(equalTo(BigDecimal.ZERO))).or(is(equalTo(expectedWin))));
    }
}