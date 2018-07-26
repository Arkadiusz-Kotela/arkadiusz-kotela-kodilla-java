package com.kodilla.exception.nullpointer;

public class MessageSender {

    public void sendMessage(User user, String message) {
        System.out.println("Sending " + message + " to user: " + user.getName());
    }
}
