package com.kodilla.exception.nullpointer;

public class NullPointerExceptionHandling {
    public static void main(String[] args) {
        User user = null;

        MessageSender messageSender = new MessageSender();
        messageSender.sendMessage(user, "Hello!");
    }
}
