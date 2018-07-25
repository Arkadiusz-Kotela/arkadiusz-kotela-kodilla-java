package com.kodilla.exception.test;

public class SecondChallenge {

    public String probablyIWillThrowException(double x, double y) {

        try {
            if (x >= 2 || x < 1 || y == 1.5) {
                throw new ExceptionHandling();
            }
        } catch (ExceptionHandling e) {
            System.out.println("Huston we have a problem! Error: " + e);
        }
        return "Done!";
    }
}

