package com.letscode.navalbattle.entities;

public class Board {

    public String[][] generateBoard(int rows, int columns){
        int trueRows = (rows*2) + 2;
        int trueColumns = (columns*2) + 2;
        String[] dictionary = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                                "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
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

}
