package ru.danilsibgatyllin.behavioral.templatemethod;

public class IosBuilder extends Builder {
    @Override
    public void test() {
        System.out.println("Running ios test");
    }

    @Override
    public void lint() {
        System.out.println("Running ios lint");
    }

    @Override
    public void assemble() {
        System.out.println("Running ios assemble");
    }

    @Override
    public void deploy() {
        System.out.println("Running ios deploy");
    }
}
