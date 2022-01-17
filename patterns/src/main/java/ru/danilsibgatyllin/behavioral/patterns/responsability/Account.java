package ru.danilsibgatyllin.behavioral.patterns.responsability;

public class Account {

    Account successor;
    Float balance;

    public Account(Float balance) {
        this.balance = balance;
    }

    public void setNext(Account account){
        this.successor = account;
    }

    public boolean canPay(Float amount){
        return this.balance>=amount;
    }

    public void pay(Float amountToPay){
        if (this.canPay(amountToPay)){
            this.balance =  this.balance-amountToPay;
            System.out.println("Paid "+amountToPay + " using " + this.getClass().getName());
        }
        else if (this.successor.canPay(amountToPay)){
            this.successor.pay(amountToPay);
        }
        else {
            throw new IllegalArgumentException("No of account have enough balance");
        }
    }

}
