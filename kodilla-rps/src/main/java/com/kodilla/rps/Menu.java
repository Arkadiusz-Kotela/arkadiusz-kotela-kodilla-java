package com.kodilla.rps;

import java.util.Scanner;

class Menu {
    private static Human human;
    private static Computer computer;
    private static  final Scanner SC = new Scanner(System.in);

    Menu(Human human, Computer computer) {
        Menu.human = human;
        Menu.computer = computer;
    }

    static void runInitialMenu() {
        System.out.println("Game menu:");
        System.out.println("===================");
        System.out.println("Available options:");
        System.out.println("x - end of the game");
        System.out.println("n - new game");
        System.out.println("===================");
        System.out.println("Game instructions:");
        System.out.println("1 - ROCK move");
        System.out.println("2 - PAPER move");
        System.out.println("3 - SCISSORS");
        System.out.println("===================");
        System.out.println();
    }

    static boolean runGameSummaryMenu() {
        //loop do{}while returning boolean to be used when condition in class GameProcessor return value "true"
        do {
            System.out.println();

            //printing out the winner of the game
            try {
                if (human.getPoints() > computer.getPoints()) {
                    System.out.println(human.getName() + " WON: " + human.getPoints() + " to " + computer.getPoints());
                } else {
                    System.out.println(computer.getName() + " WON: " + computer.getPoints() + " to " + human.getPoints());
                }
            }catch (NullPointerException e){
                System.out.println();
            }

            //printing out options' menu
            System.out.println("Current game has been completed");
            System.out.println("What do you want to do now?");
            System.out.println("Choose x - end of the game or n - new game.");
            String choice = SC.next();

            //option choice between game termination and ne game
            switch (choice) {
                case "x":
                    System.out.println("Do you want to exit (y/n)?");
                    if (SC.next().toLowerCase().equals("y")) {
                        System.out.println("Thank you for playing. Bye, bye ...");
                        System.exit(1);
                    }
                    break;
                case "n":
                    return true;
                default:
                    System.out.println("Invalid option: choose x - end of the game or n - new game.");

            }
        }while (true);
    }
}





