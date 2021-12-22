package ru.danilsibgatyllin.structural.decorator;

public class SimpleCoffee implements CoffeeMake {
    @Override
    public Float getCost() {
        return 10f;
    }

    @Override
    public String getDescription() {
        return "Simple coffee";
    }
}
