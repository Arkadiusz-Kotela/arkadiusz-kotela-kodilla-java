package com.kodilla.rps;

import java.util.Random;

public class Computer extends Player{
    private Random random = new Random();
    private int points = 0;


    public Computer() {
        super("Computer");
    }

    @Override
    public int getMove() {
        int move = random.nextInt(3);
            System.out.println("AI has chosen: " + (move + 1));
        return move;
    }
}
