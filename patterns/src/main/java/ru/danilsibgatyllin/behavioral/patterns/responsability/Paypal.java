package ru.danilsibgatyllin.behavioral.patterns.responsability;

public class Paypal extends Account {
    Float balance;

    public Paypal(Float balance) {
        super(balance);
        this.balance = balance;
    }

}
