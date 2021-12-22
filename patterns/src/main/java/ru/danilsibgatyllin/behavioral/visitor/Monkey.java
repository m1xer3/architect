package ru.danilsibgatyllin.behavioral.visitor;

public class Monkey implements Animal {

    public void shout(){
        System.out.println("Ooh oo aa aa!");
    }

    @Override
    public void accept(AnimalOperation animalOperation) {
        animalOperation.visitMonkey(this);

    }
}
