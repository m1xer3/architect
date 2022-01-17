package ru.danilsibgatyllin.structural.proxy;

public class SecuredDoor {
    private DoorAction door;

    public SecuredDoor(DoorAction door) {
        this.door = door;
    }

    public void open(String password){
        if(auth(password)){
            door.open();
        }
        else System.out.println("Not correct password");
    }

    public void close(){
        door.close();
    }

    public boolean auth(String password){
        return "qwerty".equals(password);
    }
}
