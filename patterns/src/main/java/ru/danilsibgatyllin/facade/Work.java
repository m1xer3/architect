package ru.danilsibgatyllin.facade;

public class Work {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade(new Computer());
        computer.turnOn();
        computer.turnOff();
    }
}
