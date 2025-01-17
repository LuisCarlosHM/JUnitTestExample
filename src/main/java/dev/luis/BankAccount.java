package dev.luis;

public class BankAccount {

    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String firstName, String lastName, double balance) {
        this.balance = balance;
        this.lastName = lastName;
        this.firstName = firstName;
    }
    // The branch argument is true if the customer is performing the transaction
    // at a branch, with a teller.
    // It's false if the customer is performing the transaction at an ATM
    public double deposit(double amount, boolean branch){
        balance+= amount;
        return  balance;
    }

    public double withdraw(double amount, boolean branch){
        balance -= amount;
        return balance;
    }

    public double getBalance(){
        return balance;
    }
}
