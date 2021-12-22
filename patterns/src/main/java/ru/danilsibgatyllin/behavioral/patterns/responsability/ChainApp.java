package ru.danilsibgatyllin.behavioral.patterns.responsability;

public class ChainApp {

    public static void main(String[] args) {
        Account bank = new Bank(100f);
        Account paypal = new Paypal(200f);
        Account bitcoin = new Bitcoint(300f);


        bank.setNext(paypal);
        paypal.setNext(bitcoin);

        bank.pay(200f);

    }
}
