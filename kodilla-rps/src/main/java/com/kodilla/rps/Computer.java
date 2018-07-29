package com.kodilla.rps;

import java.util.Random;

public class Computer extends Player {
    private Random random = new Random();

    Computer() {
        super("AI");
    }

    @Override
    public int getMove() {
        return random.nextInt(3);
    }
}
