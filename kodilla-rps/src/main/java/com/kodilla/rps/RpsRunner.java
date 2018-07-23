package com.kodilla.rps;

import static com.kodilla.rps.CommandAndControl.getNumberOfWinsToCompleteGame;
import static com.kodilla.rps.CommandAndControl.getPlayerName;
import static sun.misc.PostVMInitHook.run;

public class RpsRunner {
    public static void main(String[] args) {
        /*
         * 1. Retrieving player's name.
         * 2. Retrieving number of wins to complete the game.
         * 3. Create Computer & Human objects.
         * 4. Create Game object.
         * 5. Create GameProcessor object.
         * 6. run()
         */

        // 1 + 3
        Human human = new Human(getPlayerName());
        // 2.
        getNumberOfWinsToCompleteGame();
        // 3.
        Computer computer = new Computer();
        // 4.
        Game game = new Game(0);
        // 5.
        GameProcessor gp = new GameProcessor(game, computer, human);
        // 6.
        gp.run();

    }
}