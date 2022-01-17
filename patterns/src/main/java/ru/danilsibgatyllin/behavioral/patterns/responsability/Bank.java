package ru.danilsibgatyllin.behavioral.patterns.responsability;

public class Bank extends Account {

    Float balance;

    public Bank(Float balance) {
        super(balance);
        this.balance=balance;
    }
}
