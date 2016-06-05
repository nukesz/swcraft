package org.swcraft.testing.bank;

import java.math.BigDecimal;

public class Account {


    private BigDecimal balance = BigDecimal.ZERO;


    public BigDecimal getBalance() {
        return balance;
    }

    public void add(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
    }
}
