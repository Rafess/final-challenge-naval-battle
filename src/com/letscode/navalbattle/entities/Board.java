package com.letscode.navalbattle.entities;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Board {

    GameHandler gameHandler = new GameHandler();
    final String[] dictionary = gameHandler.dictionary();

    public String[][] generateBoard(int rows, int columns){
        int trueRows = (rows*2) + 2;
        int trueColumns = (columns*2) + 2;

        String[][] board = new String[trueRows][trueColumns];

        board[0][0] = " ";

        for (int j = 1; j < trueColumns; j++) {
            if(j % 2 == 0){
                board[0][j] = String.valueOf((j - 2)/2);
            } else {
                board[0][j] = "|";
            }
        };

        for (int i = 1; i < trueRows; i++) {
            for (int j = 0; j < trueColumns; j++) {
                if(i % 2 == 0){
                    if(j == 0){
                        board[i][j] = dictionary[(i-1)/2];
                    } else if(j % 2 == 0){
                        board[i][j] = " ";
                    } else {
                        board[i][j] = "|";
                    }
                } else {
                    board[i][j] = "-";
                }
            }
        }
        return board;
    }

    public String getBoardField(String fieldCode, String[][] board){
        int[] numberCode = gameHandler.convertFieldCodeToFieldNumber(fieldCode, board);
        return board[2 * numberCode[0] + 2][2 * numberCode[1] + 2];
    }

    public void setBoardField(String fieldCode, String[][] board, String checkMark){
        int[] numberCode = gameHandler.convertFieldCodeToFieldNumber(fieldCode, board);
        try {
            board[2 * numberCode[0] + 2][2 * numberCode[1] + 2] = checkMark;
        } catch (Exception e){
            System.out.println("Campo fora do tabuleiro" + "\n" +
                                "Por favor, insira um campo válido.");
        }
    }

    public void printBoard(String[][] board){
        for (String[] row : board) {
            for (String position : row) {
                System.out.print(position);
            }
            System.out.println();
        }
    }
}
