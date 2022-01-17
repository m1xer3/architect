package ru.danilsibgatyllin.behavioral.mediator;

public class ChatApp {
    public static void main(String[] args) {
        ChatRoomMediator mediator = new ChatRoom();

        User john = new User("John Doe",mediator);
        User jane = new User("Jane Doe",mediator);

        john.send("Hi there!");
        jane.send("Hey!");

    }
}
