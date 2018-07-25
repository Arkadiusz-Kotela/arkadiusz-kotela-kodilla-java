package com.kodilla.rps;

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

            int winner = game.whoWin(human.getMove(), computer.getMove());

            if (winner == 1) {
                System.out.println(human.getName() + " points: " + human.getPoints());
                System.out.println("AI points: " + computer.getPoints());
                System.out.println(human.getName() + " WON.");
                human.incrementPoints();
                System.out.println(human.getName() + " points: " + human.getPoints());
                System.out.println("AI points: " + computer.getPoints());
                System.out.println();
            } else if (winner == -1) {
                System.out.println(human.getName() + " points: " + human.getPoints());
                System.out.println("AI points: " + computer.getPoints());
                System.out.println("AI WON.");
                computer.incrementPoints();
                System.out.println(human.getName() + " points: " + human.getPoints());
                System.out.println("AI points: " + computer.getPoints());
                System.out.println();
            } else {
                System.out.println(human.getName() + " points: " + human.getPoints());
                System.out.println("AI points: " + computer.getPoints());
                System.out.println("TIE");
                System.out.println(human.getName() + " points: " + human.getPoints());
                System.out.println("AI points: " + computer.getPoints());
                System.out.println();
            }

            if (!(computer.getPoints() <= game.getActualWinsCounter() && human.getPoints() <= game.getActualWinsCounter())) { ;
                return;
            }
        }
    }

}
