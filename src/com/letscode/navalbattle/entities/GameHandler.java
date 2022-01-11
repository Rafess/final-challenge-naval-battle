package com.letscode.navalbattle.entities;

import java.util.Scanner;

public class GameHandler {

    public static String[] dictionary() {
        return new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    }

    public boolean checkStart (String[][] board, int numberOfShips){
        Board boardHandler = new Board();
        int boardRows = (board.length - 2)/2;
        int boardColumns = (board[0].length - 2)/2;
        int counter = 0;
        String fieldCode = "";
        for (int i = 0; i < boardRows; i++) {
            for (int j = 0; j < boardColumns; j++) {
                fieldCode = String.format("%s%s", dictionary()[i], String.valueOf(j));
                if (boardHandler.getBoardField(fieldCode, board) == "N"){
                    counter++;
                }
            }
        }
        if (counter == numberOfShips){
            return true;
        } else return false;
    };

    public static int[] convertFieldCodeToFieldNumber(String fieldCode, String[][] board){
        int boardColumns = (board[0].length - 2)/2;
        String rowCode = fieldCode.substring(0,1);
        int colCode = Integer.parseInt(fieldCode.substring(1,fieldCode.length()));
        int index = 0;
        for (int i = 0; i < dictionary().length; i++) {
            if(dictionary()[i].equals(rowCode)){
                index = i;
            }
        }
        if(colCode > (boardColumns -1) || index > (board.length - 1)){
            return new int[]{board.length +1, boardColumns + 1, 0};
        };
        int numericFieldCode = index * boardColumns + colCode;
        int rowPosition = numericFieldCode/boardColumns;
        int colPosition = numericFieldCode - (rowPosition * boardColumns);
        return new int[]{rowPosition, colPosition,numericFieldCode};
    }

}
