package com.kodilla.rps;

import static com.kodilla.rps.CommandAndControl.getPlayerName;

public class Human extends Player {


    public Human(String name) {
        super(name);
    }

    @Override
    public int getMove() {
        return 0;
    }
}
