package com.kodilla.rps;

import java.util.Scanner;

public class CommandAndControl {
    private static final Scanner SC = new Scanner(System.in);

    public static String getPlayerName() {
        System.out.print("Enter your name please: ");
        return SC.nextLine();
    }

    public static int getNumberOfWinsToCompleteGame() {
        System.out.print("Enter number of wins to complete the game (1-100): ");
        int number = SC.nextInt();

        while (number <= 0 || number > 100) {
            System.out.println("Invalid entry. Please enter value between 1 -100");
            number = SC.nextInt();
        }
        return number - 1;
    }

    public static void displayInfo(String info) {
        System.out.println(info);
    }

}
