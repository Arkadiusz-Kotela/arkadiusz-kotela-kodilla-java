package com.kodilla.rps;

import java.util.Scanner;

public class CommandAndControl {
    private static final Scanner SC = new Scanner(System.in);

    public static String getPlayerName(){
        System.out.print("Enter your name please: ");
        return SC.nextLine();
    }

    public static int getNumberOfWinsToCompleteGame() {
        System.out.print("Enter number of wins to complete the game (1-100): ");
        //add loop verifying int and number of entered wins
        return SC.nextInt();
    }

    public static void displayInfo(String info) {
        System.out.println(info);
    }

}
