package ru.danilsibgatyllin.behavioral.templatemethod;

public class AndroidBuilder extends Builder {

    @Override
    public void test() {
        System.out.println("Running android test");
    }

    @Override
    public void lint() {
        System.out.println("Running android lint");
    }

    @Override
    public void assemble() {
        System.out.println("Running android assemble");
    }

    @Override
    public void deploy() {
        System.out.println("Running android deploy");
    }
}
