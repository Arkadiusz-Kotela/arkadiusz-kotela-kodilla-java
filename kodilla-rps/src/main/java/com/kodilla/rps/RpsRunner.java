package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {

        Human human = new Human(RuleMaker.getPlayerName());
        Computer computer = new Computer();
        RuleMaker ruleMaker = new RuleMaker();
        Game game = new Game(RuleMaker.getNumberOfWinsToCompleteGame());
        Menu menu = new Menu();
        GameProcessor gp = new GameProcessor(game, computer, human, ruleMaker, menu);
        gp.run();

    }
}
