package ru.danilsibgatyllin.proxy;

public class EntreRoom {


    public static void main(String[] args) {
        SecuredDoor door = new SecuredDoor(new LabDoor());
        door.open("dot");
        door.open("qwerty");
        door.close();
    }




}
