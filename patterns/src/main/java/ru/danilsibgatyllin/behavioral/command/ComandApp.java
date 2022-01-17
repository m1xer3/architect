package ru.danilsibgatyllin.behavioral.command;

public class ComandApp {
    public static void main(String[] args) {

        Bulb bulb = new Bulb();
        Command turnOn = new TurnOn(bulb);
        Command turnOff = new TurnOff(bulb);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.submit(turnOn);
        remoteControl.submit(turnOff);

    }
}
