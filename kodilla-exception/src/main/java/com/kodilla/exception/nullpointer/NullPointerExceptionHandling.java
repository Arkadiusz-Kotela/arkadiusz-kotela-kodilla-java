package com.kodilla.exception.nullpointer;

public class NullPointerExceptionHandling {
    public static void main(String[] args) {
        User user = null;

        MessageSender messageSender = new MessageSender();
        try {
            messageSender.sendMessage(user, "Hello!");
        } catch (MessageNotSentException e) {
            System.out.println("Message is not sent, " +
            "but programme is still running very well");
        }
        System.out.println("Processing other logic.");
    }
}
