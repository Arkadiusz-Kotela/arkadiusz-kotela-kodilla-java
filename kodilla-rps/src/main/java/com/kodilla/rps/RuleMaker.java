package com.kodilla.rps;

import java.util.Scanner;

class RuleMaker {
    private static final Scanner SC = new Scanner(System.in);

    static String getPlayerName() {
        System.out.print("Enter your name please: ");
        return SC.nextLine();
    }


    static int getNumberOfWinsToCompleteGame() {
        System.out.print("Enter number of wins to complete the game (1-100): ");
        int number = enteredValueChecker();


        while (number <= 0 || number > 100) {
            System.out.println("Invalid entry. Please enter value between 1 -100");
            number = SC.nextInt();
        }

        return number - 1;
    }

    static int enteredValueChecker() {
        boolean end = false;
        int value = 0;
        do {
            if (!SC.hasNextInt()) {
                System.out.print("Non numeric value. An integer please: ");
                SC.next();
            } else {
                value = SC.nextInt();
                end = true;
            }
        } while (!end);

        return value;
    }


    void gameScores(Game game, Human human, Computer computer) {
        int winner = game.whoWin(human.getMove(), computer.getMove());

        if (winner == 1) {
            System.out.println("Before round:");
            System.out.println(human.getName() + " points: " + human.getPoints());
            System.out.println("AI points: " + computer.getPoints());
            System.out.println(human.getName() + " WON.");
            human.incrementPoints();
            System.out.println("After round:");
            System.out.println(human.getName() + " points: " + human.getPoints());
            System.out.println("AI points: " + computer.getPoints());
            System.out.println();
        } else if (winner == -1) {
            System.out.println("Before round:");
            System.out.println(human.getName() + " points: " + human.getPoints());
            System.out.println("AI points: " + computer.getPoints());
            System.out.println("AI WON.");
            computer.incrementPoints();
            System.out.println("After round:");
            System.out.println(human.getName() + " points: " + human.getPoints());
            System.out.println("AI points: " + computer.getPoints());
            System.out.println();
        } else {
            System.out.println("Before round:");
            System.out.println(human.getName() + " points: " + human.getPoints());
            System.out.println("AI points: " + computer.getPoints());
            System.out.println("TIE");
            System.out.println("After round:");
            System.out.println(human.getName() + " points: " + human.getPoints());
            System.out.println("AI points: " + computer.getPoints());
            System.out.println();
        }

    }
}
