package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {

        Human human = new Human(RuleMaker.getPlayerName());
        Computer computer = new Computer();
        Game game = new Game(RuleMaker.getNumberOfWinsToCompleteGame());
        GameProcessor gp = new GameProcessor(game, computer, human);
        gp.run();

    }
}
