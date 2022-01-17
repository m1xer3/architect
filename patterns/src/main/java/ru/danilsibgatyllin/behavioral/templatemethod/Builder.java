package ru.danilsibgatyllin.behavioral.templatemethod;

public abstract class Builder {

    public final void build(){
        this.test();
        this.lint();
        this.assemble();
        this.deploy();
    }

    abstract public void test();
    abstract public void lint();
    abstract public void assemble();
    abstract public void deploy();
}
