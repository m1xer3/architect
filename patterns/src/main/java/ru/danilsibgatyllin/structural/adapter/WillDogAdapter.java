package ru.danilsibgatyllin.structural.adapter;

public class WillDogAdapter implements Lion {

    private WillDog dog;

    public WillDogAdapter(WillDog dog){
        this.dog=dog;
    }

    @Override
    public void roar() {
        this.dog.bark();
    }
}
