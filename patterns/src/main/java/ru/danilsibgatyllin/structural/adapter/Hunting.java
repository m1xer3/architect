package ru.danilsibgatyllin.structural.adapter;

public class Hunting {

    public static void main(String[] args) {
        Hunter hunter = new Hunter();
        Lion africanLion = new AfricanLion();
        Lion asianLion = new AsiaLion();
        WillDog dog =new WillDog();
        WillDogAdapter adapterDog = new WillDogAdapter(dog);

        hunter.hunt(africanLion);
        hunter.hunt(asianLion);
        hunter.hunt(adapterDog);
    }
}
