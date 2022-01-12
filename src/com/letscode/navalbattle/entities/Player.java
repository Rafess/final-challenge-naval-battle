package com.letscode.navalbattle.entities;

import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    public String name;
    public String[][] board;

    public Player (String name, int[] boardSize) {
        String[][] initialBoard = Board.generateBoard(boardSize[0], boardSize[1]);
        this.name = name;
        this.board = initialBoard;
    }

    public String attack(){
        System.out.printf("%s, where are you shooting?\n", this.name);
        return scanner.nextLine().toUpperCase();
    }

    public String placeShip(){
        System.out.println("Where do you place it?\n");
        return scanner.nextLine().toUpperCase();
    }

    public boolean isAlive(){
        return !Board.checkFullBoard(this.board, "*");
    }

}
