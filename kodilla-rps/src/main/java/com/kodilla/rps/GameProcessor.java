package com.kodilla.rps;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.stream.Stream;

//Processes class Game implementing game logic
class GameProcessor {
    private Game game;
    private Computer computer;
    private Human human;
    private int roundCounter = 0;
    private static final String SETTINGS_FILE_PATH = "GameSettings";

    GameProcessor(Game game, Computer computer, Human human) {
        this.game = game;
        this.computer = computer;
        this.human = human;
    }

    void run() {

        //displaying welcome menu
        Menu.runInitialMenu();

        //loop while running method gameScore until number of wins reached requested by player
        while (true) {
            if (settingReader()) {

                RuleMaker.gameScores(game, human, computer);
                roundCounter++;

                //cheat ratio set using modulo: %2 -> 1/2, %3 -> 1/3, etc.
                if (roundCounter % 2 == 0) {
                    System.out.println("CHEATED ROUND");
                    CheatProcessor.cheatGameScores(game, human, computer);
                }
            } else {
                RuleMaker.gameScores(game, human, computer);
            }

            //conditions compering number of wins with number of requested wins by player to complete the game
            if (!(computer.getPoints() <= game.getActualWinsCounter() && human.getPoints() <= game.getActualWinsCounter())) {

                //condition checking if runGameSummaryMenu return request to terminate game or request new game
                if (!Menu.runGameSummaryMenu()) {
                    //if terminate:
                    return;
                    //if new game requested
                } else {
                    //calling initial menu
                    Menu.runInitialMenu();
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

    private boolean settingReader() {
        StringBuilder sb = new StringBuilder();

        ClassLoader classLoader = getClass().getClassLoader();

        File file = new File(Objects.requireNonNull(classLoader.getResource(SETTINGS_FILE_PATH)).getFile());

        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {
            fileLines.forEach(sb::append);
        } catch (IOException e) {
            System.out.println("Error");
        }
        return sb.toString().contains("CheatingMode=ON");
    }
}






