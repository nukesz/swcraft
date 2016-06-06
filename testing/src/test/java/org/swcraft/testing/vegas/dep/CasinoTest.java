package org.swcraft.testing.vegas.dep;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

public class CasinoTest {

    private Roulette mockRoulette;
    private Casino cut;

    @Before
    public void setUp() throws Exception {
        mockRoulette = mock(Roulette.class);
        cut = new Casino(mockRoulette);
    }

    @Test
    public void callRouletteTableBetMethod() throws Exception {
        cut.playRoulette(BigDecimal.ONE, 5);
        verify(mockRoulette).bet(BigDecimal.ONE, 5);
    }

    @Test
    public void playRouletteReturnsTheSameAmountAsBet() throws Exception {
        when(mockRoulette.bet(BigDecimal.ONE, 5)).thenReturn(BigDecimal.TEN);
        BigDecimal result = cut.playRoulette(BigDecimal.ONE, 5);
        assertThat(result, is(equalTo(BigDecimal.TEN)));
    }


}