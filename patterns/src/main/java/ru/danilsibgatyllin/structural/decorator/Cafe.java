package ru.danilsibgatyllin.structural.decorator;

public class Cafe {
    public static void main(String[] args) {
        CoffeeMake someCoffee = new SimpleCoffee();
        System.out.println(someCoffee.getCost() +"\n" + someCoffee.getDescription());

        someCoffee=new MilkCoffee(someCoffee);
        System.out.println(someCoffee.getCost() +"\n" + someCoffee.getDescription());

        someCoffee=new VanillaCoffee(someCoffee);
        System.out.println(someCoffee.getCost() +"\n" + someCoffee.getDescription());

    }
}
