package com.kodilla.rps;

public class Human extends Player {

    Human(String name) {
        super(name);
    }

    @Override
    public int getMove() {
        System.out.println("Make your move: ");

        //verifying entered values if numeric
        int move = RuleMaker.enteredValueChecker();

        //loop while verifying move value is correct as per game requirements
        while (move < 1 || move > 3) {
            System.out.println("Invalid move. Please enter 1 - ROCK, 2 - PAPER or 3 - SCISSORS: ");

            //verifying entered values if numeric
            move = RuleMaker.enteredValueChecker();
        }
        //returning value of move -1 dut to adjustment to move value index [0] to [2] only
        return move - 1;
    }
}
