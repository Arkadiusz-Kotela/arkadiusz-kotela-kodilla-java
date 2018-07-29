package com.kodilla.rps;

import java.util.Scanner;

class Menu {
    private Human human;
    private Computer computer;
    private Scanner SC = new Scanner(System.in);

    Menu(Human human, Computer computer) {
        this.human = human;
        this.computer = computer;
    }

    void runInitialMenu() {
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

    boolean runGameSummaryMenu() {
        do {
            System.out.println();
            if (human.getPoints() > computer.getPoints()){
                System.out.println(human.getName() + " WON: " + human.getPoints() + " to " + computer.getPoints());
            }else {
                System.out.println(computer.getName() + " WON: " + computer.getPoints() + " to " + human.getPoints());
            }
            System.out.println();
            System.out.println("Current game ahs been completed");
            System.out.println("What do you want to do now?");
            System.out.println("Choose x - end of the game or n - new game.");
            String choice = SC.next();
            switch (choice) {
                case "x":
                    System.out.println("Do you want to exit?");
                    if (SC.next().toLowerCase().equals("y")) {
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





