package ru.danilsibgatyllin.structural.decorator;

public class MilkCoffee implements CoffeeMake {

    private CoffeeMake coffeeMake;

    public MilkCoffee(CoffeeMake coffeeMake) {
        this.coffeeMake = coffeeMake;
    }

    @Override
    public Float getCost() {
        return this.coffeeMake.getCost()+15f;
    }

    @Override
    public String getDescription() {
        return coffeeMake.getDescription()+" milk";
    }


}
