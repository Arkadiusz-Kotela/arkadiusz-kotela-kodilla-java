package com.kodilla.rps;

import java.util.Scanner;

class RuleMaker {
    private static final Scanner SC = new Scanner(System.in);

    static String getPlayerName() {
        System.out.print("Enter your name please: ");
        return SC.nextLine();
    }

    static int getNumberOfWinsToCompleteGame() {
        System.out.println("Enter number of wins to complete the game (1-100): ");
        int number = enteredValueChecker();

        while (number <= 0 || number > 100) {
            System.out.println("Invalid entry. Please enter value between 1 -100");
            number = SC.nextInt();
        }
        return number - 1;
    }

    //static method evaluating entered values making sure they are integers
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

    // method designed to play one round rps
    static void gameScores(Game game, Human human, Computer computer) {
        int humanMove = human.getMove();
        int computerMove = computer.getMove();

        // displaying names of the human moves
        switch (humanMove) {
            case 0:
                System.out.println(human.getName() + " played ROCK.");
                break;
            case 1:
                System.out.println(human.getName() + " played PAPER.");
                break;
            case 2:
                System.out.println(human.getName() + " played SCISSORS.");
        }

        // displaying names of the computer moves
        switch (computerMove) {
            case 0:
                System.out.printf("%s played ROCK.%n", computer.getName());
                break;
            case 1:
                System.out.println(computer.getName() + " played PAPER.");
                break;
            case 2:
                System.out.println(computer.getName() + " played SCISSORS.");
        }

        /*establishing winner by returning int value of class Game
         *field movesCompereArray values
         *under [humanMove][computerMove] index
         */
        int winner = game.whoWin(humanMove, computerMove);

        //displaying round winner
        if (winner == 1) {
            System.out.println();
            System.out.println(human.getName() + " WON.");
            System.out.println();
            System.out.println("Before round:");
            System.out.println(human.getName() + " points: " + human.getPoints());
            System.out.println("AI points: " + computer.getPoints());
            System.out.println();
            human.incrementPoints();
            System.out.println("After round:");
            System.out.println(human.getName() + " points: " + human.getPoints());
            System.out.println("AI points: " + computer.getPoints());
            System.out.println("------------------------");
            System.out.println();
        } else if (winner == -1) {
            System.out.println();
            System.out.println("AI WON.");
            System.out.println();
            System.out.println("Before round:");
            System.out.println(human.getName() + " points: " + human.getPoints());
            System.out.println("AI points: " + computer.getPoints());
            System.out.println();
            computer.incrementPoints();
            System.out.println("After round:");
            System.out.println(human.getName() + " points: " + human.getPoints());
            System.out.println("AI points: " + computer.getPoints());
            System.out.println("------------------------");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("TIE");
            System.out.println();
            System.out.println("Before round:");
            System.out.println(human.getName() + " points: " + human.getPoints());
            System.out.println("AI points: " + computer.getPoints());
            System.out.println();
            System.out.println("After round:");
            System.out.println(human.getName() + " points: " + human.getPoints());
            System.out.println("AI points: " + computer.getPoints());
            System.out.println("------------------------");
            System.out.println();
        }
    }

}