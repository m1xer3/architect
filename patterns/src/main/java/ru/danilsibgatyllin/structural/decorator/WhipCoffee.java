package ru.danilsibgatyllin.structural.decorator;

public class WhipCoffee implements CoffeeMake {
    private CoffeeMake coffeeMake;

    public WhipCoffee(CoffeeMake coffeeMake) {
        this.coffeeMake = coffeeMake;
    }

    @Override
    public Float getCost() {
        return coffeeMake.getCost()+23f;
    }

    @Override
    public String getDescription() {
        return coffeeMake.getDescription()+" whip";
    }
}
