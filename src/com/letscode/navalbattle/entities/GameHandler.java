package com.letscode.navalbattle.entities;

import java.util.*;

public class GameHandler {

    private static final Scanner scanner = new Scanner(System.in);

    public static String[] dictionary() {
        return new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    }

    public static Player[] runIntro(){
        System.out.println("Welcome to the Ultimate Battleship Battle!" + "\n" +
                            "How many fighters will be joining us today?" + "\n" +
                            "(Type the number of players)");
        int numberOfPlayers = Integer.parseInt(scanner.nextLine());
        Player[] players = new Player[Math.max(2, numberOfPlayers)];
        String[] arrayOfNames = new String[numberOfPlayers];
        if (numberOfPlayers == 1){
            System.out.println("And, may I ask your name?");
            arrayOfNames[0] = scanner.nextLine();
        } else if (numberOfPlayers > 1){
            System.out.println("Alright then, say your names, one at a time");
            for (int i = 0; i < numberOfPlayers; i++) {
                arrayOfNames[i] = scanner.nextLine();
            }
        } else {
            System.out.println("Oh, so you gave up already?");
            return null;
        }

        int[] boardSize = difficultHandler();

        for (int i = 0; i < numberOfPlayers; i++) {
            players[i] = new Player(arrayOfNames[i],boardSize);
        }
        if (numberOfPlayers == 1){
            players[1] = new AI(boardSize);
        }
        return players;
    }

    public static int[] difficultHandler(){
        int[] available = {1,2,3,4};
        System.out.println("Now, select a difficulty:" + "\n" +
                            "1 - Easy (3x3) | 2 - Medium (5x5) | 3 - Hard (10x10) | 4 - Custom Board Size" );
        int selector = Integer.parseInt(scanner.nextLine());
        while (selector > 4 || selector < 1){
            System.out.println("Please, provide a number between 1~4");
            selector = scanner.nextInt();
        }
        switch (selector){
            case 1:
                return new int[]{3, 3};
            case 2:
                return new int[]{5,5};
            case 3:
                return new int[]{10,10};
            case 4:
                System.out.println("How many rows do you wish?");
                int rows = scanner.nextInt();
                System.out.println("And how many columns?");
                int columns = scanner.nextInt();
                return new int[]{rows, columns};
        }
        return new int[0];
    }

    public static void checkStart(Player[] players) {
        for (int i = 0; i < players.length; i++) {
            int counter = Board.getBoardCapacity(players[0].board);
            if (!(players[i] instanceof AI)) {
                System.out.printf("\n\n\n" + "%s, it's time to distribute your ships!" + "\n", players[i].name);
                Board.printBoard(players[i].board);
            }
            while (!Board.checkFullBoard(players[i].board, "N") && counter > 0) {
                if(!(players[i] instanceof AI)) {
                    System.out.printf("%s, you have %d ship(s) left" + "\n", players[i].name, counter);
                }
                Board.setBoardField(players[i].placeShip(), players[i].board, "N");
                counter--;
                if(!(players[i] instanceof AI)) {
                    Board.printBoard(players[i].board);
                }
            }
            for (int j = 0; j < players[0].board.length * 2; j++) {
                System.out.println("\n");
            }
        }
    }

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

    public static boolean handleAttack(Player attacker, Player target){
        System.out.printf("%s is attacking %s" + "\n", attacker.name, target.name);
        String fieldTarget = attacker.attack();
        if (Board.getBoardField(fieldTarget, target.board) == "N"){
            Board.setBoardField(fieldTarget, target.board, "*");
            System.out.println("Target down!" + "\n--------------------");
            return true;
        } else if(Board.getBoardField(fieldTarget, target.board) == " "){
            Board.setBoardField(fieldTarget, target.board, "-");
        }
        System.out.println("Shot missed" + "\n--------------------");
        return false;
    }

    public static Player startGame(Player[] players){
        int alive = players.length;
        System.out.println("Let it rain fire! Battle start!" + "\n\n");
        Player lastStanding = null;
        while (alive > 1){
            for (int i = 0; i < players.length; i++) {
                if (players[i].isAlive()){
                    for (int j = 0; j < players.length; j++) {
                        if (j != i && players[j].isAlive()) {
                            boolean shot = handleAttack(players[i], players[j]);
                            if (shot){
                                if (!players[j].isAlive()){
                                    System.out.printf("%s lays in the bottom of the sea.%n", players[j].name);
                                    alive--;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < players.length; i++) {
            if (players[i].isAlive()){
                lastStanding = players[i];
            }
        }
        return lastStanding;
    }

    public static void endGame(Player winner, Player[] players){

    }

}
