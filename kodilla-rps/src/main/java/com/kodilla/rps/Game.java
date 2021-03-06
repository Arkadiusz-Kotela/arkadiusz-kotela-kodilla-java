package com.kodilla.rps;

//Game logic to be processed by class GameProcessor
class Game {
    private int actualWinsCounter;
    private int[][] moveCompareArray = {
            //
            { 0, -1, 1},
            { 1, 0, -1},
            {-1, 1,  0}
    };

    Game(int actualWinsCounter) {
        this.actualWinsCounter = actualWinsCounter;
    }


    int getActualWinsCounter() {
        return actualWinsCounter;
    }

    int[][] getMoveCompareArray() {
        return moveCompareArray;
    }
    void setActualWinsCounter(int actualWinsCounter) {
        this.actualWinsCounter = actualWinsCounter;
    }

    //whoWin method establishing who win using method getMove();
    int whoWin(int humanMove, int computerMove) {
        return moveCompareArray[humanMove][computerMove];
    }
}
