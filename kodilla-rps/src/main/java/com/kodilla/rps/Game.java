package com.kodilla.rps;

//Game logic to be processed by class GameProcessor
public class Game {
    private int actualWinsCounter;
    private int[][] compareMoveTable = {
            //
            { 0, 1, -1},
            { -1, 0, 1},
            {1, -1,  0}
    };

    public Game(int actualWinsCounter) {
        this.actualWinsCounter = actualWinsCounter;
    }

    public int getActualWinsCounter() {
        return actualWinsCounter;
    }

    //whoWin method establishing who win using method getMove();
    public int whoWin(int humanMove, int computerMove) {
        return compareMoveTable[humanMove][computerMove];
    }
}
