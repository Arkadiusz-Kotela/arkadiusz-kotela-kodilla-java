package com.kodilla.rps;

//Processes class Game implementing game logic
class GameProcessor {
    private Game game;
    private Computer computer;
    private Human human;
    private RuleMaker ruleMaker;


    GameProcessor(Game game, Computer computer, Human human, RuleMaker ruleMaker) {
        this.game = game;
        this.computer = computer;
        this.human = human;
        this.ruleMaker = ruleMaker;
    }

    void run() {
        boolean end = false;

        while (!end) {

            ruleMaker.gameScores(game, human, computer);

            if (!(computer.getPoints() <= game.getActualWinsCounter() && human.getPoints() <= game.getActualWinsCounter())) {
                return;
            }
        }
    }

}
