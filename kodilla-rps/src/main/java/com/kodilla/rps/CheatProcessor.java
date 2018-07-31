package com.kodilla.rps;

class CheatProcessor {

    private static int cheatMove;

    private static int cheatMove(int [][] winsArray, int move) {

        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                if (winsArray[move][j] == -1) {
                    cheatMove = j;
                }
            }
        }
        return cheatMove;
    }

    // method designed to play one cheat round rps
    static void cheatGameScores(Game game, Human human, Computer computer) {
        int humanMove = human.getMove();
        int cheatMove = cheatMove(game.getMoveCompareArray(), humanMove);

        // displaying names of the human moves
        switch (humanMove) {
            case 0:
                System.out.println(human.getName() + " played ROCK.");
                break;
            case 1:
                System.out.println(human.getName() + " played PAPER.");
                break;
            case 2:
                System.out.println(human.getName() + " played SCISSORS.");
        }

        // displaying names of the computer moves
        switch (cheatMove) {
            case 0:
                System.out.printf("%s played ROCK.%n", computer.getName());
                break;
            case 1:
                System.out.println(computer.getName() + " played PAPER.");
                break;
            case 2:
                System.out.println(computer.getName() + " played SCISSORS.");
        }

        /*establishing winner by returning int value of class Game
         *field movesCompereArray values
         *under [humanMove][computerMove] index
         */
        int winner = game.whoWin(humanMove, cheatMove);

        //displaying round winner
        if (winner == 1) {
            System.out.println();
            System.out.println(human.getName() + " WON.");
            System.out.println();
            System.out.println("Before round:");
            System.out.println(human.getName() + " points: " + human.getPoints());
            System.out.println("AI points: " + computer.getPoints());
            System.out.println();
            human.incrementPoints();
            System.out.println("After round:");
            System.out.println(human.getName() + " points: " + human.getPoints());
            System.out.println("AI points: " + computer.getPoints());
            System.out.println("------------------------");
            System.out.println();
        } else if (winner == -1) {
            System.out.println();
            System.out.println("AI WON.");
            System.out.println();
            System.out.println("Before round:");
            System.out.println(human.getName() + " points: " + human.getPoints());
            System.out.println("AI points: " + computer.getPoints());
            System.out.println();
            computer.incrementPoints();
            System.out.println("After round:");
            System.out.println(human.getName() + " points: " + human.getPoints());
            System.out.println("AI points: " + computer.getPoints());
            System.out.println("------------------------");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("TIE");
            System.out.println();
            System.out.println("Before round:");
            System.out.println(human.getName() + " points: " + human.getPoints());
            System.out.println("AI points: " + computer.getPoints());
            System.out.println();
            System.out.println("After round:");
            System.out.println(human.getName() + " points: " + human.getPoints());
            System.out.println("AI points: " + computer.getPoints());
            System.out.println("------------------------");
            System.out.println();
        }
    }

}
