package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge sc = new SecondChallenge();
        try {
            System.out.println(sc.probablyIWillThrowException(1.5, 1.5));
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        } finally {
            System.out.println("End of the programme.");
        }
    }
}