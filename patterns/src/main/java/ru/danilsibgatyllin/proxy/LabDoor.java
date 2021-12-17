package ru.danilsibgatyllin.proxy;

public class LabDoor implements DoorAction {
    @Override
    public void open() {
        System.out.println("Lab door open");
    }

    @Override
    public void close() {
        System.out.println("Lab door close");
    }
}
