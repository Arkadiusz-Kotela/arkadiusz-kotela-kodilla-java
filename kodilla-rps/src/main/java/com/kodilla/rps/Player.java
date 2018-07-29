package com.kodilla.rps;

public abstract class Player {
    private final String name;
    private int points = 0;

    Player(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void incrementPoints() {
        points++;
    }

    int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public abstract int getMove();

}
