package com.kodilla.patterns.builder.checkers;

import java.util.Arrays;

public final class Board {
    public static final int MIN_INDEX = 0;
    public static final int MAX_INDEX = 9;
    Figure[][] board = new Figure[10][];

    public Board() {
        for (int i = 0; i < 10; i++) {
            board[i] = new Figure[10];
        }
    }

    public Figure getFigure(int x, int y) {
        return board[x][y];
    }

    public void setFigure(Figure figure, int x, int y) {
        board[x][y] = figure;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = MIN_INDEX; i < MAX_INDEX; i++) {
            result.append("|");
            for (int j = MIN_INDEX; j < MAX_INDEX; j++) {
                if (board[i][j] == null) {
                    result.append(" ");
                } else {
                    result.append(board[i][j].getColor().equals(Figure.BLACK) ? "b" : "w");
                    result.append(board[i][j] instanceof Pawn ? "P" : "Q");
                }
                result.append("|");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
