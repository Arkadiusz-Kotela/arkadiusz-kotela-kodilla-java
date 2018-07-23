package com.kodilla.rps;

public abstract class Player {
    private final String name;
    private int points = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void incrementPoints() {
        points++;
    }

    public int getPoints() {
        return points;
    }

    public abstract int getMove();

}
