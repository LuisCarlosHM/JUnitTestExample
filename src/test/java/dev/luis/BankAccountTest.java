package dev.luis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount("Luis", "Hernandez", 1000.00);
    }

    @Test
    void deposit() {
        double balance = account.deposit(200.00, true);
        Assertions.assertEquals(1200.00, balance, 0);
        Assertions.assertEquals(1200.00, account.getBalance(), 0);
    }

    @Test
    void withdraw() {
        double balance = account.withdraw(200.00, true);
        Assertions.assertEquals(800.00, balance, 0);
        Assertions.assertEquals(800.00, account.getBalance(), 0);
    }

    @Test
    void getBalance() {
        Assertions.assertEquals(1000.00, account.getBalance(), 0.01);
    }


}