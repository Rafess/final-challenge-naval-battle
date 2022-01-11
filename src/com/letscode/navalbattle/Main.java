package com.letscode.navalbattle;
import com.letscode.navalbattle.entities.AI;
import com.letscode.navalbattle.entities.Board;
import com.letscode.navalbattle.entities.GameHandler;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Board gameBoard = new Board();
        GameHandler gameHandler = new GameHandler();
        Scanner scan = new Scanner(System.in);

        String[][] board = gameBoard.generateBoard(3, 3);
        String[][] boardAI = gameBoard.generateBoard(3, 3);
        int numberOfShips = 2;

        AI.placeShips(boardAI, numberOfShips);
        gameBoard.printBoard(board);

        while (!gameHandler.checkStart(board, numberOfShips)) {
            System.out.print("Insira os navios no tabuleiro: ");
            String field = scan.nextLine().toUpperCase();
            gameBoard.setBoardField(field, board, "N");
            gameBoard.printBoard(board);
        }
        String[][] playerBoard = board.clone();

        System.out.println("--------- A BATALHA COMEÇOU!!!! -------------");
        do {
            System.out.println("------- SEU TURNO -----------");
            System.out.print("Onde deseja atacar? ");
            String attack = scan.nextLine().toUpperCase();
            switch (attack) {
                case "A0":
                    if (Objects.equals(boardAI[2][3], "N")) {
                        board[2][3] = "*";
                        boardAI[2][3] = "X";
                    } else if (Objects.equals(board[2][3], "N")) {
                        board[2][3] = "n";
                        boardAI[2][3] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[2][3] = "-";
                        boardAI[2][3] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "A1":
                    if (Objects.equals(boardAI[2][5], "N")) {
                        board[2][5] = "*";
                        boardAI[2][5] = "X";
                    } else if (Objects.equals(board[2][5], "N")) {
                        board[2][5] = "n";
                        boardAI[2][5] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[2][5] = "-";
                        boardAI[2][5] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "A2":
                    if (Objects.equals(boardAI[2][7], "N")) {
                        board[2][7] = "*";
                        boardAI[2][7] = "X";
                    } else if (Objects.equals(board[2][7], "N")) {
                        board[2][7] = "n";
                        boardAI[2][7] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[2][7] = "-";
                        boardAI[2][7] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "A3":
                    if (Objects.equals(boardAI[2][9], "N")) {
                        board[2][9] = "*";
                        boardAI[2][9] = "X";
                    } else if (Objects.equals(board[2][9], "N")) {
                        board[2][9] = "n";
                        boardAI[2][9] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[2][9] = "-";
                        boardAI[2][9] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "A4":
                    if (Objects.equals(boardAI[2][11], "N")) {
                        board[2][11] = "*";
                        boardAI[2][11] = "X";
                    } else if (Objects.equals(board[2][11], "N")) {
                        board[2][11] = "n";
                        boardAI[2][11] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[2][11] = "-";
                        boardAI[2][11] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "A5":
                    if (Objects.equals(boardAI[2][13], "N")) {
                        board[2][13] = "*";
                        boardAI[2][13] = "X";
                    } else if (Objects.equals(board[2][13], "N")) {
                        board[2][13] = "n";
                        boardAI[2][13] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[2][13] = "-";
                        boardAI[2][13] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "A6":
                    if (Objects.equals(boardAI[2][15], "N")) {
                        board[2][15] = "*";
                        boardAI[2][15] = "X";
                    } else if (Objects.equals(board[2][15], "N")) {
                        board[2][15] = "n";
                        boardAI[2][15] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[2][15] = "-";
                        boardAI[2][15] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "A7":
                    if (Objects.equals(boardAI[2][17], "N")) {
                        board[2][17] = "*";
                        boardAI[2][17] = "X";
                    } else if (Objects.equals(board[2][17], "N")) {
                        board[2][17] = "n";
                        boardAI[2][17] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[2][17] = "-";
                        boardAI[2][17] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "A8":
                    if (Objects.equals(boardAI[2][19], "N")) {
                        board[2][19] = "*";
                        boardAI[2][19] = "X";
                    } else if (Objects.equals(board[2][19], "N")) {
                        board[2][19] = "n";
                        boardAI[2][19] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[2][19] = "-";
                        boardAI[2][19] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "A9":
                    if (Objects.equals(boardAI[2][21], "N")) {
                        board[2][21] = "*";
                        boardAI[2][21] = "X";
                    } else if (Objects.equals(board[2][21], "N")) {
                        board[2][21] = "n";
                        boardAI[2][21] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[2][21] = "-";
                        boardAI[2][21] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "B0":
                    if (Objects.equals(boardAI[4][3], "N")) {
                        board[4][3] = "*";
                        boardAI[4][3] = "X";
                    } else if (Objects.equals(board[4][3], "N")) {
                        board[4][3] = "n";
                        boardAI[4][3] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[4][3] = "-";
                        boardAI[4][3] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "B1":
                    if (Objects.equals(boardAI[4][5], "N")) {
                        board[4][5] = "*";
                        boardAI[4][5] = "X";
                    } else if (Objects.equals(board[4][5], "N")) {
                        board[4][5] = "n";
                        boardAI[4][5] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[4][5] = "-";
                        boardAI[4][5] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "B2":
                    if (Objects.equals(boardAI[4][7], "N")) {
                        board[4][7] = "*";
                        boardAI[4][7] = "X";
                    } else if (Objects.equals(board[4][7], "N")) {
                        board[4][7] = "n";
                        boardAI[4][7] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[4][7] = "-";
                        boardAI[4][7] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "B3":
                    if (Objects.equals(boardAI[4][9], "N")) {
                        board[4][9] = "*";
                        boardAI[4][9] = "X";
                    } else if (Objects.equals(board[4][9], "N")) {
                        board[4][9] = "n";
                        boardAI[4][9] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[4][9] = "-";
                        boardAI[4][9] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "B4":
                    if (Objects.equals(boardAI[4][11], "N")) {
                        board[4][11] = "*";
                        boardAI[4][11] = "X";
                    } else if (Objects.equals(board[4][11], "N")) {
                        board[4][11] = "n";
                        boardAI[4][11] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[4][11] = "-";
                        boardAI[4][11] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "B5":
                    if (Objects.equals(boardAI[4][13], "N")) {
                        board[4][13] = "*";
                        boardAI[4][13] = "X";
                    } else if (Objects.equals(board[4][13], "N")) {
                        board[4][13] = "n";
                        boardAI[4][13] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[4][13] = "-";
                        boardAI[4][13] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "B6":
                    if (Objects.equals(boardAI[4][15], "N")) {
                        board[4][15] = "*";
                        boardAI[4][15] = "X";
                    } else if (Objects.equals(board[4][15], "N")) {
                        board[4][15] = "n";
                        boardAI[4][15] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[4][15] = "-";
                        boardAI[4][15] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "B7":
                    if (Objects.equals(boardAI[4][17], "N")) {
                        board[4][17] = "*";
                        boardAI[4][17] = "X";
                    } else if (Objects.equals(board[4][17], "N")) {
                        board[4][17] = "n";
                        boardAI[4][17] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[4][17] = "-";
                        boardAI[4][17] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "B8":
                    if (Objects.equals(boardAI[4][19], "N")) {
                        board[4][19] = "*";
                        boardAI[4][19] = "X";
                    } else if (Objects.equals(board[4][19], "N")) {
                        board[4][19] = "n";
                        boardAI[4][19] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[4][19] = "-";
                        boardAI[4][19] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "B9":
                    if (Objects.equals(boardAI[4][21], "N")) {
                        board[4][21] = "*";
                        boardAI[4][21] = "N";
                    } else if (Objects.equals(board[4][21], "N")) {
                        board[4][21] = "n";
                        boardAI[4][21] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[4][21] = "-";
                        boardAI[4][21] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "C0":
                    if (Objects.equals(boardAI[6][3], "N")) {
                        board[6][3] = "*";
                        boardAI[6][3] = "X";
                    } else if (Objects.equals(board[6][3], "N")) {
                        board[6][3] = "n";
                        boardAI[6][3] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[6][3] = "-";
                        boardAI[6][3] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "C1":
                    if (Objects.equals(boardAI[6][5], "N")) {
                        board[6][5] = "*";
                        boardAI[6][5] = "X";
                    } else if (Objects.equals(board[6][5], "N")) {
                        board[6][5] = "n";
                        boardAI[6][5] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[6][5] = "-";
                        boardAI[6][5] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "C2":
                    if (Objects.equals(boardAI[6][7], "N")) {
                        board[6][7] = "*";
                        boardAI[6][7] = "X";
                    } else if (Objects.equals(board[6][7], "N")) {
                        board[6][7] = "n";
                        boardAI[6][7] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[6][7] = "-";
                        boardAI[6][7] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "C3":
                    if (Objects.equals(boardAI[6][9], "N")) {
                        board[6][9] = "*";
                        boardAI[6][9] = "X";
                    } else if (Objects.equals(board[6][9], "N")) {
                        board[6][9] = "n";
                        boardAI[6][9] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[6][9] = "-";
                        boardAI[6][9] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "C4":
                    if (Objects.equals(boardAI[6][11], "N")) {
                        board[6][11] = "*";
                        boardAI[6][11] = "X";
                    } else if (Objects.equals(board[6][11], "N")) {
                        board[6][11] = "n";
                        boardAI[6][11] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[6][11] = "-";
                        boardAI[6][11] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "C5":
                    if (Objects.equals(boardAI[6][13], "N")) {
                        board[6][13] = "*";
                        boardAI[6][13] = "X";
                    } else if (Objects.equals(board[6][13], "N")) {
                        board[6][13] = "n";
                        boardAI[6][13] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[6][13] = "-";
                        boardAI[6][13] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "C6":
                    if (Objects.equals(boardAI[6][15], "N")) {
                        board[6][15] = "*";
                        boardAI[6][15] = "X";
                    } else if (Objects.equals(board[6][15], "N")) {
                        board[6][15] = "n";
                        boardAI[6][15] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[6][15] = "-";
                        boardAI[6][15] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "C7":
                    if (Objects.equals(boardAI[6][17], "N")) {
                        board[6][17] = "*";
                        boardAI[6][17] = "X";
                    } else if (Objects.equals(board[6][17], "N")) {
                        board[6][17] = "n";
                        boardAI[6][17] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[6][17] = "-";
                        boardAI[6][17] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "C8":
                    if (Objects.equals(boardAI[6][19], "N")) {
                        board[6][19] = "*";
                        boardAI[6][19] = "X";
                    } else if (Objects.equals(board[6][19], "N")) {
                        board[6][19] = "n";
                        boardAI[6][19] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[6][19] = "-";
                        boardAI[6][19] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "C9":
                    if (Objects.equals(boardAI[6][21], "N")) {
                        board[6][21] = "*";
                        boardAI[6][21] = "X";
                    } else if (Objects.equals(board[6][21], "N")) {
                        board[6][21] = "n";
                        boardAI[6][21] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[6][21] = "-";
                        boardAI[6][21] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "D0":
                    if (Objects.equals(boardAI[8][3], "N")) {
                        board[8][3] = "*";
                        boardAI[8][3] = "X";
                    } else if (Objects.equals(board[8][3], "N")) {
                        board[8][3] = "n";
                        boardAI[8][3] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[8][3] = "-";
                        boardAI[8][3] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "D1":
                    if (Objects.equals(boardAI[8][5], "N")) {
                        board[8][5] = "*";
                        boardAI[8][5] = "X";
                    } else if (Objects.equals(board[8][5], "N")) {
                        board[8][5] = "n";
                        boardAI[8][5] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[8][5] = "-";
                        boardAI[8][5] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "D2":
                    if (Objects.equals(boardAI[8][7], "N")) {
                        board[8][7] = "*";
                        boardAI[8][7] = "X";
                    } else if (Objects.equals(board[8][7], "N")) {
                        board[8][7] = "n";
                        boardAI[8][7] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[8][7] = "-";
                        boardAI[8][7] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "D3":
                    if (Objects.equals(boardAI[8][9], "N")) {
                        board[8][9] = "*";
                        boardAI[8][9] = "X";
                    } else if (Objects.equals(board[8][9], "N")) {
                        board[8][9] = "n";
                        boardAI[8][9] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[8][9] = "-";
                        boardAI[8][9] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "D4":
                    if (Objects.equals(boardAI[8][11], "N")) {
                        board[8][11] = "*";
                        boardAI[8][11] = "X";
                    } else if (Objects.equals(board[8][11], "N")) {
                        board[8][11] = "n";
                        boardAI[8][11] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[8][11] = "-";
                        boardAI[8][11] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "D5":
                    if (Objects.equals(boardAI[8][13], "N")) {
                        board[8][13] = "*";
                        boardAI[8][13] = "X";
                    } else if (Objects.equals(board[8][13], "N")) {
                        board[8][13] = "n";
                        boardAI[8][13] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[8][13] = "-";
                        boardAI[8][13] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "D6":
                    if (Objects.equals(boardAI[8][15], "N")) {
                        board[8][15] = "*";
                        boardAI[8][15] = "X";
                    } else if (Objects.equals(board[8][15], "N")) {
                        board[8][15] = "n";
                        boardAI[8][15] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[8][15] = "-";
                        boardAI[8][15] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "D7":
                    if (Objects.equals(boardAI[8][17], "N")) {
                        board[8][17] = "*";
                        boardAI[8][17] = "X";
                    } else if (Objects.equals(board[8][17], "N")) {
                        board[8][17] = "n";
                        boardAI[8][17] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[8][17] = "-";
                        boardAI[8][17] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "D8":
                    if (Objects.equals(boardAI[8][19], "N")) {
                        board[8][19] = "*";
                        boardAI[8][19] = "X";
                    } else if (Objects.equals(board[8][19], "N")) {
                        board[8][19] = "n";
                        boardAI[8][19] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[8][19] = "-";
                        boardAI[8][19] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "D9":
                    if (Objects.equals(boardAI[8][21], "N")) {
                        board[8][21] = "*";
                        boardAI[8][21] = "X";
                    } else if (Objects.equals(board[8][21], "N")) {
                        board[8][21] = "n";
                        boardAI[8][21] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[8][21] = "-";
                        boardAI[8][21] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "E0":
                    if (Objects.equals(boardAI[10][3], "N")) {
                        board[10][3] = "*";
                        boardAI[10][3] = "X";
                    } else if (Objects.equals(board[10][3], "N")) {
                        board[10][3] = "n";
                        boardAI[10][3] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[10][3] = "-";
                        boardAI[10][3] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "E1":
                    if (Objects.equals(boardAI[10][5], "N")) {
                        board[10][5] = "*";
                        boardAI[10][5] = "X";
                    } else if (Objects.equals(board[10][5], "N")) {
                        board[10][5] = "n";
                        boardAI[10][5] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[10][5] = "-";
                        boardAI[10][5] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "E2":
                    if (Objects.equals(boardAI[10][7], "N")) {
                        board[10][7] = "*";
                        boardAI[10][7] = "X";
                    } else if (Objects.equals(board[10][7], "N")) {
                        board[10][7] = "n";
                        boardAI[10][7] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[10][7] = "-";
                        boardAI[10][7] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "E3":
                    if (Objects.equals(boardAI[10][9], "N")) {
                        board[10][9] = "*";
                        boardAI[10][9] = "X";
                    } else if (Objects.equals(board[10][9], "N")) {
                        board[10][9] = "n";
                        boardAI[10][9] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[10][9] = "-";
                        boardAI[10][9] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "E4":
                    if (Objects.equals(boardAI[10][11], "N")) {
                        board[10][11] = "*";
                        boardAI[10][11] = "X";
                    } else if (Objects.equals(board[10][11], "N")) {
                        board[10][11] = "n";
                        boardAI[10][11] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[10][11] = "-";
                        boardAI[10][11] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "E5":
                    if (Objects.equals(boardAI[10][13], "N")) {
                        board[10][13] = "*";
                        boardAI[10][13] = "X";
                    } else if (Objects.equals(board[10][13], "N")) {
                        board[10][13] = "n";
                        boardAI[10][13] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[10][13] = "-";
                        boardAI[10][13] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "E6":
                    if (Objects.equals(boardAI[10][15], "N")) {
                        board[10][15] = "*";
                        boardAI[10][15] = "X";
                    } else if (Objects.equals(board[10][15], "N")) {
                        board[10][15] = "n";
                        boardAI[10][15] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[10][15] = "-";
                        boardAI[10][15] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "E7":
                    if (Objects.equals(boardAI[10][17], "N")) {
                        board[10][17] = "*";
                        boardAI[10][17] = "X";
                    } else if (Objects.equals(board[10][17], "N")) {
                        board[10][17] = "n";
                        boardAI[10][17] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[10][17] = "-";
                        boardAI[10][17] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "E8":
                    if (Objects.equals(boardAI[10][19], "N")) {
                        board[10][19] = "*";
                        boardAI[10][19] = "X";
                    } else if (Objects.equals(board[10][19], "N")) {
                        board[10][19] = "n";
                        boardAI[10][19] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[10][19] = "-";
                        boardAI[10][19] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "E9":
                    if (Objects.equals(boardAI[10][21], "N")) {
                        board[10][21] = "*";
                        boardAI[10][21] = "X";
                    } else if (Objects.equals(board[10][21], "N")) {
                        board[10][21] = "n";
                        boardAI[10][21] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[10][21] = "-";
                        boardAI[10][21] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "F0":
                    if (Objects.equals(boardAI[12][3], "N")) {
                        board[12][3] = "*";
                        boardAI[12][3] = "X";
                    } else if (Objects.equals(board[12][3], "N")) {
                        board[12][3] = "n";
                        boardAI[12][3] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[12][3] = "-";
                        boardAI[12][3] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "F1":
                    if (Objects.equals(boardAI[12][5], "N")) {
                        board[12][5] = "*";
                        boardAI[12][5] = "X";
                    } else if (Objects.equals(board[12][5], "N")) {
                        board[12][5] = "n";
                        boardAI[12][5] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[12][5] = "-";
                        boardAI[12][5] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "F2":
                    if (Objects.equals(boardAI[12][7], "N")) {
                        board[12][7] = "*";
                        boardAI[12][7] = "X";
                    } else if (Objects.equals(board[12][7], "N")) {
                        board[12][7] = "n";
                        boardAI[12][7] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[12][7] = "-";
                        boardAI[12][7] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "F3":
                    if (Objects.equals(boardAI[12][9], "N")) {
                        board[12][9] = "*";
                        boardAI[12][9] = "X";
                    } else if (Objects.equals(board[12][9], "N")) {
                        board[12][9] = "n";
                        boardAI[12][9] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[12][9] = "-";
                        boardAI[12][9] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "F4":
                    if (Objects.equals(boardAI[12][11], "N")) {
                        board[12][11] = "*";
                        boardAI[12][11] = "X";
                    } else if (Objects.equals(board[12][11], "N")) {
                        board[12][11] = "n";
                        boardAI[12][11] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[12][11] = "-";
                        boardAI[12][11] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "F5":
                    if (Objects.equals(boardAI[12][13], "N")) {
                        board[12][13] = "*";
                        boardAI[12][13] = "X";
                    } else if (Objects.equals(board[12][13], "N")) {
                        board[12][13] = "n";
                        boardAI[12][13] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[12][13] = "-";
                        boardAI[12][13] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "F6":
                    if (Objects.equals(boardAI[12][15], "N")) {
                        board[12][15] = "*";
                        boardAI[12][15] = "X";
                    } else if (Objects.equals(board[12][15], "N")) {
                        board[12][15] = "n";
                        boardAI[12][15] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[12][15] = "-";
                        boardAI[12][15] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "F7":
                    if (Objects.equals(boardAI[12][17], "N")) {
                        board[12][17] = "*";
                        boardAI[12][17] = "X";
                    } else if (Objects.equals(board[12][17], "N")) {
                        board[12][17] = "n";
                        boardAI[12][17] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[12][17] = "-";
                        boardAI[12][17] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "F8":
                    if (Objects.equals(boardAI[12][19], "N")) {
                        board[12][19] = "*";
                        boardAI[12][19] = "X";
                    } else if (Objects.equals(board[12][19], "N")) {
                        board[12][19] = "n";
                        boardAI[12][19] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[12][19] = "-";
                        boardAI[12][19] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "F9":
                    if (Objects.equals(boardAI[12][21], "N")) {
                        board[12][21] = "*";
                        boardAI[12][21] = "X";
                    } else if (Objects.equals(board[12][21], "N")) {
                        board[12][21] = "n";
                        boardAI[12][21] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[12][21] = "-";
                        boardAI[12][21] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "G0":
                    if (Objects.equals(boardAI[14][3], "N")) {
                        board[14][3] = "*";
                        boardAI[14][3] = "X";
                    } else if (Objects.equals(board[14][3], "N")) {
                        board[14][3] = "n";
                        boardAI[14][3] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[14][3] = "-";
                        boardAI[14][3] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "G1":
                    if (Objects.equals(boardAI[14][5], "N")) {
                        board[14][5] = "*";
                        boardAI[14][5] = "X";
                    } else if (Objects.equals(board[14][5], "N")) {
                        board[14][5] = "n";
                        boardAI[14][5] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[14][5] = "-";
                        boardAI[14][5] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "G2":
                    if (Objects.equals(boardAI[14][7], "N")) {
                        board[14][7] = "*";
                        boardAI[14][7] = "X";
                    } else if (Objects.equals(board[14][7], "N")) {
                        board[14][7] = "n";
                        boardAI[14][7] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[14][7] = "-";
                        boardAI[14][7] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "G3":
                    if (Objects.equals(boardAI[14][9], "N")) {
                        board[14][9] = "*";
                        boardAI[14][9] = "X";
                    } else if (Objects.equals(board[14][9], "N")) {
                        board[14][9] = "n";
                        boardAI[14][9] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[14][9] = "-";
                        boardAI[14][9] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "G4":
                    if (Objects.equals(boardAI[14][11], "N")) {
                        board[14][11] = "*";
                        boardAI[14][11] = "X";
                    } else if (Objects.equals(board[14][11], "N")) {
                        board[14][11] = "n";
                        boardAI[14][11] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[14][11] = "-";
                        boardAI[14][11] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "G5":
                    if (Objects.equals(boardAI[14][13], "N")) {
                        board[14][13] = "*";
                        boardAI[14][13] = "X";
                    } else if (Objects.equals(board[14][13], "N")) {
                        board[14][13] = "n";
                        boardAI[14][13] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[14][13] = "-";
                        boardAI[14][13] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "G6":
                    if (Objects.equals(boardAI[14][15], "N")) {
                        board[14][15] = "*";
                        boardAI[14][15] = "X";
                    } else if (Objects.equals(board[14][15], "N")) {
                        board[14][15] = "n";
                        boardAI[14][15] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[14][15] = "-";
                        boardAI[14][15] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "G7":
                    if (Objects.equals(boardAI[14][17], "N")) {
                        board[14][17] = "*";
                        boardAI[14][17] = "X";
                    } else if (Objects.equals(board[14][17], "N")) {
                        board[14][17] = "n";
                        boardAI[14][17] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[14][17] = "-";
                        boardAI[14][17] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "G8":
                    if (Objects.equals(boardAI[14][19], "N")) {
                        board[14][19] = "*";
                        boardAI[14][19] = "X";
                    } else if (Objects.equals(board[14][19], "N")) {
                        board[14][19] = "n";
                        boardAI[14][19] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[14][19] = "-";
                        boardAI[14][19] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "G9":
                    if (Objects.equals(boardAI[14][21], "N")) {
                        board[14][21] = "*";
                        boardAI[14][21] = "X";
                    } else if (Objects.equals(board[14][21], "N")) {
                        board[14][21] = "n";
                        boardAI[14][21] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[14][21] = "-";
                        boardAI[14][21] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "H0":
                    if (Objects.equals(boardAI[16][3], "N")) {
                        board[16][3] = "*";
                        boardAI[16][3] = "X";
                    } else if (Objects.equals(board[16][3], "N")) {
                        board[16][3] = "n";
                        boardAI[16][3] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[16][3] = "-";
                        boardAI[16][3] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "H1":
                    if (Objects.equals(boardAI[16][5], "N")) {
                        board[16][5] = "*";
                        boardAI[16][5] = "X";
                    } else if (Objects.equals(board[16][5], "N")) {
                        board[16][5] = "n";
                        boardAI[16][5] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[16][5] = "-";
                        boardAI[16][5] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "H2":
                    if (Objects.equals(boardAI[16][7], "N")) {
                        board[16][7] = "*";
                        boardAI[16][7] = "X";
                    } else if (Objects.equals(board[16][7], "N")) {
                        board[16][7] = "n";
                        boardAI[16][7] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[16][7] = "-";
                        boardAI[16][7] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "H3":
                    if (Objects.equals(boardAI[16][9], "N")) {
                        board[16][9] = "*";
                        boardAI[16][9] = "X";
                    } else if (Objects.equals(board[16][9], "N")) {
                        board[16][9] = "n";
                        boardAI[16][9] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[16][9] = "-";
                        boardAI[16][9] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "H4":
                    if (Objects.equals(boardAI[16][11], "N")) {
                        board[16][11] = "*";
                        boardAI[16][11] = "X";
                    } else if (Objects.equals(board[16][11], "N")) {
                        board[16][11] = "n";
                        boardAI[16][11] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[16][11] = "-";
                        boardAI[16][11] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "H5":
                    if (Objects.equals(boardAI[16][13], "N")) {
                        board[16][13] = "*";
                        boardAI[16][13] = "X";
                    } else if (Objects.equals(board[16][13], "N")) {
                        board[16][13] = "n";
                        boardAI[16][13] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[16][13] = "-";
                        boardAI[16][13] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "H6":
                    if (Objects.equals(boardAI[16][15], "N")) {
                        board[16][15] = "*";
                        boardAI[16][15] = "X";
                    } else if (Objects.equals(board[16][15], "N")) {
                        board[16][15] = "n";
                        boardAI[16][15] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[16][15] = "-";
                        boardAI[16][15] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "H7":
                    if (Objects.equals(boardAI[16][17], "N")) {
                        board[16][17] = "*";
                        boardAI[16][17] = "X";
                    } else if (Objects.equals(board[16][17], "N")) {
                        board[16][17] = "n";
                        boardAI[16][17] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[16][17] = "-";
                        boardAI[16][17] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "H8":
                    if (Objects.equals(boardAI[16][19], "N")) {
                        board[16][19] = "*";
                        boardAI[16][19] = "X";
                    } else if (Objects.equals(board[16][19], "N")) {
                        board[16][19] = "n";
                        boardAI[16][19] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[16][19] = "-";
                        boardAI[16][19] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "H9":
                    if (Objects.equals(boardAI[16][21], "N")) {
                        board[16][21] = "*";
                        boardAI[16][21] = "X";
                    } else if (Objects.equals(board[16][21], "N")) {
                        board[16][21] = "n";
                        boardAI[16][21] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[16][21] = "-";
                        boardAI[16][21] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "I0":
                    if (Objects.equals(boardAI[18][3], "N")) {
                        board[18][3] = "*";
                        boardAI[18][3] = "X";
                    } else if (Objects.equals(board[18][3], "N")) {
                        board[18][3] = "n";
                        boardAI[18][3] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[18][3] = "-";
                        boardAI[18][3] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "I1":
                    if (Objects.equals(boardAI[18][5], "N")) {
                        board[18][5] = "*";
                        boardAI[18][5] = "X";
                    } else if (Objects.equals(board[18][5], "N")) {
                        board[18][5] = "n";
                        boardAI[18][5] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[18][5] = "-";
                        boardAI[18][5] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "I2":
                    if (Objects.equals(boardAI[18][7], "N")) {
                        board[18][7] = "*";
                        boardAI[18][7] = "X";
                    } else if (Objects.equals(board[18][7], "N")) {
                        board[18][7] = "n";
                        boardAI[18][7] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[18][7] = "-";
                        boardAI[18][7] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "I3":
                    if (Objects.equals(boardAI[18][9], "N")) {
                        board[18][9] = "*";
                        boardAI[18][9] = "X";
                    } else if (Objects.equals(board[18][9], "N")) {
                        board[18][9] = "n";
                        boardAI[18][9] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[18][9] = "-";
                        boardAI[18][9] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "I4":
                    if (Objects.equals(boardAI[18][11], "N")) {
                        board[18][11] = "*";
                        boardAI[18][11] = "X";
                    } else if (Objects.equals(board[18][11], "N")) {
                        board[18][11] = "n";
                        boardAI[18][11] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[18][11] = "-";
                        boardAI[18][11] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "I5":
                    if (Objects.equals(boardAI[18][13], "N")) {
                        board[18][13] = "*";
                        boardAI[18][13] = "X";
                    } else if (Objects.equals(board[18][13], "N")) {
                        board[18][13] = "n";
                        boardAI[18][13] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[18][13] = "-";
                        boardAI[18][13] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "I6":
                    if (Objects.equals(boardAI[18][15], "N")) {
                        board[18][15] = "*";
                        boardAI[18][15] = "X";
                    } else if (Objects.equals(board[18][15], "N")) {
                        board[18][15] = "n";
                        boardAI[18][15] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[18][15] = "-";
                        boardAI[18][15] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "I7":
                    if (Objects.equals(boardAI[18][17], "N")) {
                        board[18][17] = "*";
                        boardAI[18][17] = "X";
                    } else if (Objects.equals(board[18][17], "N")) {
                        board[18][17] = "n";
                        boardAI[18][17] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[18][17] = "-";
                        boardAI[18][17] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "I8":
                    if (Objects.equals(boardAI[18][19], "N")) {
                        board[18][19] = "*";
                        boardAI[18][19] = "X";
                    } else if (Objects.equals(board[18][19], "N")) {
                        board[18][19] = "n";
                        boardAI[18][19] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[18][19] = "-";
                        boardAI[18][19] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "I9":
                    if (Objects.equals(boardAI[18][21], "N")) {
                        board[18][21] = "*";
                        boardAI[18][21] = "X";
                    } else if (Objects.equals(board[18][21], "N")) {
                        board[18][21] = "n";
                        boardAI[18][21] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[18][21] = "-";
                        boardAI[18][21] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "J0":
                    if (Objects.equals(boardAI[20][3], "N")) {
                        board[20][3] = "*";
                        boardAI[20][3] = "X";
                    } else if (Objects.equals(board[20][3], "N")) {
                        board[20][3] = "n";
                        boardAI[20][3] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[20][3] = "-";
                        boardAI[20][3] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "J1":
                    if (Objects.equals(boardAI[20][5], "N")) {
                        board[20][5] = "*";
                        boardAI[20][5] = "X";
                    } else if (Objects.equals(board[20][5], "N")) {
                        board[20][5] = "n";
                        boardAI[20][5] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[20][5] = "-";
                        boardAI[20][5] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "J2":
                    if (Objects.equals(boardAI[20][7], "N")) {
                        board[20][7] = "*";
                        boardAI[20][7] = "X";
                    } else if (Objects.equals(board[20][7], "N")) {
                        board[20][7] = "n";
                        boardAI[20][7] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[20][7] = "-";
                        boardAI[20][7] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "J3":
                    if (Objects.equals(boardAI[20][9], "N")) {
                        board[20][9] = "*";
                        boardAI[20][9] = "X";
                    } else if (Objects.equals(board[20][9], "N")) {
                        board[20][9] = "n";
                        boardAI[20][9] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[20][9] = "-";
                        boardAI[20][9] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "J4":
                    if (Objects.equals(boardAI[20][11], "N")) {
                        board[20][11] = "*";
                        boardAI[20][11] = "X";
                    } else if (Objects.equals(board[20][11], "N")) {
                        board[20][11] = "n";
                        boardAI[20][11] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[20][11] = "-";
                        boardAI[20][11] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "J5":
                    if (Objects.equals(boardAI[20][13], "N")) {
                        board[20][13] = "*";
                        boardAI[20][13] = "X";
                    } else if (Objects.equals(board[20][13], "N")) {
                        board[20][13] = "n";
                        boardAI[20][13] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[20][13] = "-";
                        boardAI[20][13] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "J6":
                    if (Objects.equals(boardAI[20][15], "N")) {
                        board[20][15] = "*";
                        boardAI[20][15] = "X";
                    } else if (Objects.equals(board[20][15], "N")) {
                        board[20][15] = "n";
                        boardAI[20][15] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[20][15] = "-";
                        boardAI[20][15] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "J7":
                    if (Objects.equals(boardAI[20][17], "N")) {
                        board[20][17] = "*";
                        boardAI[20][17] = "X";
                    } else if (Objects.equals(board[20][17], "N")) {
                        board[20][17] = "n";
                        boardAI[20][17] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[20][17] = "-";
                        boardAI[20][17] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "J8":
                    if (Objects.equals(boardAI[20][19], "N")) {
                        board[20][19] = "*";
                        boardAI[20][19] = "X";
                    } else if (Objects.equals(board[20][19], "N")) {
                        board[20][19] = "n";
                        boardAI[20][19] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    } else {
                        board[20][19] = "-";
                        boardAI[20][19] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                case "J9":
                    if (Objects.equals(boardAI[20][21], "N")) {
                        board[20][21] = "*";
                        boardAI[20][21] = "X";
                    } else if (Objects.equals(board[20][21], "N")) {
                        board[20][21] = "n";
                        boardAI[20][21] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }else {
                        board[20][21] = "-";
                        boardAI[20][21] = "-";
                        System.out.println("Nenhum navio encontrado, tente novamente");
                    }
                    break;
                default:
                    System.out.println("Por favor, insira um valor válido");
                    break;
            }
            for (String[] row : board) {
                for (String position : row) {
                    System.out.print(position);
                }
                System.out.println();
            }
            System.out.println("------- TURNO DO OPONENTE ---------");
            AI.handleAIAttack(playerBoard);
//            System.out.println(Arrays.deepToString(playerBoard));
            for (String[] row : boardAI) {
                for (String position : row) {
                    System.out.print(position);
                }
                System.out.println();
            }
        } while (contains(boardAI, "N") || contains(playerBoard, "N") || contains(playerBoard, "n"));

        System.out.println("-------FIM DE JOGO------");
        if (contains(boardAI, "N") && !contains(playerBoard, "N")) {
            System.out.println("Você Perdeu! Seus Navios foram destruídos!");
            showBothBoards(boardAI, playerBoard);
        } else if (contains(playerBoard, "N") && !contains(boardAI, "N")) {
            System.out.println("Você venceu! Os Navios inimigos foram derrotados!");
            showBothBoards(boardAI, playerBoard);
        }


    }

    private static void showBothBoards(String[][] boardAI, String[][] playerBoard) {
        System.out.println("Tabuleiro inimigo:");
        for (String[] rowAI : boardAI) {
            for (String positionAI : rowAI) {
                System.out.print(positionAI);
            }
            System.out.println();
        }
        System.out.println("Seu tabuleiro:");
        for (String[] row : playerBoard) {
            for (String position : row) {
                System.out.print(position);
            }
            System.out.println();
        }
    }

    public static boolean contains(String[][] array, String element) {
        boolean hasShip = false;
        for (int i = 2; i < 21; i++) {
            for (int j = 3; j < 22; j++) {
                if (Objects.equals(array[i][j], element)) {
                    hasShip = true;
                    break;
                }
            }

        }
       return hasShip;
    }
}
