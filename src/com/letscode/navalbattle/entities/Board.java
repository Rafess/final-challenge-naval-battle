package com.letscode.navalbattle.entities;

import java.util.Objects;

public class Board {

    final static String[] dictionary = GameHandler.dictionary();

    public static String[][] generateBoard(int rows, int columns){
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

    public static String getBoardField(String fieldCode, String[][] board){
        int[] numberCode = GameHandler.convertFieldCodeToFieldNumber(fieldCode, board);
        return board[2 * numberCode[0] + 2][2 * numberCode[1] + 2];
    }

    public static void setBoardField(String fieldCode, String[][] board, String checkMark){
        int[] numberCode = GameHandler.convertFieldCodeToFieldNumber(fieldCode, board);
        try {
            board[2 * numberCode[0] + 2][2 * numberCode[1] + 2] = checkMark;
        } catch (Exception e){
            System.out.println("Campo fora do tabuleiro" + "\n" +
                                "Por favor, insira um campo válido.");
        }
    }

    public static void printBoard(String[][] board){
        for (String[] row : board) {
            for (String position : row) {
                System.out.print(position);
            }
            System.out.println();
        }
    }

    private static int[] getTrueSize (String[][] board){
        int boardRows = (board.length - 2)/2;
        int boardColumns = (board[0].length - 2)/2;
        return new int[]{boardRows, boardColumns};
    }

    public static int getBoardCapacity (String[][] board){
        return (int) Math.sqrt(getTrueSize(board)[0] * getTrueSize(board)[1]);
    }

    public static boolean checkFullBoard (String[][] board, String value){
        int boardRows = getTrueSize(board)[0];
        int boardColumns = getTrueSize(board)[1];
        int counter = 0;
        String fieldCode;
        for (int i = 0; i < boardRows; i++) {
            for (int j = 0; j < boardColumns; j++) {
                fieldCode = String.format("%s%s", dictionary[i], j);
                if (Objects.equals(Board.getBoardField(fieldCode, board), value)){
                    counter++;
                }
            }
        }
        int maxOccurrence = getBoardCapacity(board);
        return counter == maxOccurrence;
    };

//    private static int printHeader(Player player){
//        int nameLength = player.name.length();
//        int boardLength = player.board[0].length;
//        int extraSpace = (Math.max(nameLength, boardLength) - Math.min(nameLength, boardLength))/2;
//        for (int i = 0; i < extraSpace; i++) {
//            System.out.println("-");
//        }
//        System.out.printf(" %s ", player.name);
//        for (int i = 0; i < extraSpace; i++) {
//            System.out.println("-");
//        }
//        return extraSpace;
//    }

//    public static void reviewAllBoards(Player[] players){
//        for (int i = 0; i < players.length; i++) {
//            printHeader(players[i]);
//            System.out.println("      ");
////            for (int j = 0; j < ; j++) {
////
////            }
//
//        }
//    }

}