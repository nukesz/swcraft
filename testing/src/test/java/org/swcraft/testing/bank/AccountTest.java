package org.swcraft.testing.bank;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class AccountTest {

    private Account account;

    @Before
    public void setUp() throws Exception {
        account = new Account();
    }

    @Test
    public void createNewAccount() throws Exception {
        assertThat(account.getBalance(), is(equalTo(BigDecimal.ZERO)));
    }

    @Test
    public void addMoneyToTheAccount() throws Exception {
        account.add(BigDecimal.ONE);
        assertThat(account.getBalance(), is(equalTo((BigDecimal.ONE))));
    }

    @Test
    public void withdrawMoneyFromTheAccount() throws Exception {
        account.add(BigDecimal.TEN);
        account.withdraw(BigDecimal.ONE);
        BigDecimal expected = new BigDecimal(9.0);
        assertThat(account.getBalance(), is(equalTo((expected))));
    }
}