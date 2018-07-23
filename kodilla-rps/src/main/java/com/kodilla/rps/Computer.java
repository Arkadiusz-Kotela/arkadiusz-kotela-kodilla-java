package com.kodilla.rps;

import java.util.Random;

public class Computer extends Player{
    private Random random = new Random();


    public Computer() {
        super("Computer");
    }

    @Override
    public int getMove() {
        return random.nextInt(3);
    }
}
