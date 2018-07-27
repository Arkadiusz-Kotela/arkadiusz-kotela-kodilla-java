package com.kodilla.rps;

import java.util.Scanner;

public class Human extends Player {

    Human(String name) {
        super(name);
    }

    @Override
    public int getMove() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Make your move: ");

        int move = RuleMaker.enteredValueChecker();

        while (move < 1 || move > 3) {
            System.out.println("Invalid move. Please enter 1 - ROCK, 2 - PAPER or 3 - SCISSORS: ");
            move = sc.nextInt();
        }
        switch (move) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
        }
        return move;
    }
}
