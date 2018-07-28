package com.kodilla.rps;

//Processes class Game implementing game logic
class GameProcessor {
    private Game game;
    private Computer computer;
    private Human human;
    private RuleMaker ruleMaker;
    private Menu menu;

    GameProcessor(Game game, Computer computer, Human human, RuleMaker ruleMaker, Menu menu) {
        this.game = game;
        this.computer = computer;
        this.human = human;
        this.ruleMaker = ruleMaker;
        this.menu = menu;
    }

    void run() {
        menu.runInitialMenu();

        while (true) {
            RuleMaker.gameScores(game, human, computer);
            if (!(computer.getPoints() <= game.getActualWinsCounter() && human.getPoints() <= game.getActualWinsCounter())) {
                return;
            }
        }
    }
}






