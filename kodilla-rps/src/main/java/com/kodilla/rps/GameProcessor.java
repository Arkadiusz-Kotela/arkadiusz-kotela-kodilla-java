package com.kodilla.rps;

//Processes class Game implementing game logic
class GameProcessor {
    private Game game;
    private Computer computer;
    private Human human;
    private Menu menu;

    GameProcessor(Game game, Computer computer, Human human, Menu menu) {
        this.game = game;
        this.computer = computer;
        this.human = human;
        this.menu = menu;
    }

    void run() {
        //displaying welcome menu
        menu.runInitialMenu();

        //loop while running method gameScore until number of wins reached requested by player
        while (true) {
            RuleMaker.gameScores(game, human, computer);

            //conditions compering number of wins with number of requested wins by player to complete the game
            if (!(computer.getPoints() <= game.getActualWinsCounter() && human.getPoints() <= game.getActualWinsCounter())) {

                //condition checking if runGameSummaryMenu return request to terminate game or request new game
                if(!menu.runGameSummaryMenu()) {
                    //if terminate:
                    return;
                //if new game requested
                } else {
                    //calling initial menu
                    menu.runInitialMenu();
                    //zeroing points
                    computer.setPoints(0);
                    human.setPoints(0);
                    //setting new number of wins requested by player to complete the game
                    game.setActualWinsCounter(RuleMaker.getNumberOfWinsToCompleteGame());

                    RuleMaker.gameScores(game, human, computer);
                }
            }
        }
    }
}






