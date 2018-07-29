package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {

        Human human = new Human(RuleMaker.getPlayerName());
        Computer computer = new Computer();
        Game game = new Game(RuleMaker.getNumberOfWinsToCompleteGame());
        Menu menu = new Menu(human, computer);
        GameProcessor gp = new GameProcessor(game, computer, human, menu);
        gp.run();

    }
}
