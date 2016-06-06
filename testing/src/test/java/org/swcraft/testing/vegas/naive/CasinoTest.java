package org.swcraft.testing.vegas.naive;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class CasinoTest {

    @Test
    public void createCasino() throws Exception {
        Casino casino = new Casino();
        assertNotNull(casino);
    }

    @Test
    public void betSomeMoney() throws Exception {
        Casino casino = new Casino();
        BigDecimal amountToBet = new BigDecimal("10");
        BigDecimal result = casino.playRoulette(amountToBet, 1);
        BigDecimal expectedWin = new BigDecimal("350");
        // either lose or win
        assertThat(result, either(is(equalTo(BigDecimal.ZERO))).or(is(equalTo(expectedWin))));
    }
}
