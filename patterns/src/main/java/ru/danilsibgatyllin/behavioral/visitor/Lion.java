package ru.danilsibgatyllin.behavioral.visitor;

public class Lion implements Animal {

    public void roar(){
        System.out.println("Roaaar!");
    }

    @Override
    public void accept(AnimalOperation animalOperation) {
        animalOperation.visitLion(this);
    }
}
