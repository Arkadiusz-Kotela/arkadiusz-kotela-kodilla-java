package com.kodilla.rps;

import static com.kodilla.rps.CommandAndControl.displayInfo;

//Processes class Game implementing game logic
public class GameProcessor {
    private Game game;
    private Computer computer;
    private Human human;

    public GameProcessor(Game game, Computer computer, Human human) {
        this.game = game;
        this.computer = computer;
        this.human = human;
    }

    public void run() {
        boolean end = false;
        while (!end) {
            if (!(computer.getPoints() <= game.getActualWinsCounter()
                    && human.getPoints() <= game.getActualWinsCounter())){
                displayInfo("Good Bye!!!");
                return;
            }
        }
    }

}
