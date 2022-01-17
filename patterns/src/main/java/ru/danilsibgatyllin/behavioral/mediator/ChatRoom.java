package ru.danilsibgatyllin.behavioral.mediator;

import java.time.LocalDateTime;

public class ChatRoom implements ChatRoomMediator {
    @Override
    public void showMessage(User user, String message) {
        LocalDateTime time = LocalDateTime.now();
        String sender = user.getName();
        System.out.println(time + " - Sender: " + sender + " - Message : "+message);
    }
}
