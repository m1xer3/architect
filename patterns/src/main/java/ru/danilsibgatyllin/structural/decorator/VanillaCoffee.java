package ru.danilsibgatyllin.structural.decorator;

public class VanillaCoffee implements CoffeeMake {
    private CoffeeMake coffeeMake;

    public VanillaCoffee(CoffeeMake coffeeMake) {
        this.coffeeMake = coffeeMake;
    }


    @Override
    public Float getCost() {
        return coffeeMake.getCost()+15;
    }

    @Override
    public String getDescription() {
        return coffeeMake.getDescription() + " vanilla";
    }
}
