package org.swcraft.testing.vegas.dep;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FriendlyCasinoTest {

    private Roulette mockRoulette;
    private FriendlyCasino cut;

    @Before
    public void setUp() throws Exception {
        mockRoulette = mock(Roulette.class);
        cut = new FriendlyCasino(mockRoulette);
    }

    @Test
    public void returnZeroIfLosing() throws Exception {
        when(mockRoulette.bet(anyObject(), anyInt())).thenReturn(BigDecimal.ZERO);
        BigDecimal result = cut.playRoulette(BigDecimal.ONE, 5);
        assertThat(result, is(equalTo(BigDecimal.ZERO)));
    }

    @Test
    public void returnProfitWithBonus() throws Exception {
        BigDecimal profit = BigDecimal.TEN;
        when(mockRoulette.bet(anyObject(), anyInt())).thenReturn(profit);
        BigDecimal increasedProfit = profit.add(FriendlyCasino.BONUS);
        BigDecimal actualResult = cut.playRoulette(BigDecimal.ONE, 5);
        assertThat(actualResult, is(equalTo(increasedProfit)));
    }

}