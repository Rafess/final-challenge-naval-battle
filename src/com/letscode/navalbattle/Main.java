package com.letscode.navalbattle;

import com.sun.source.tree.WhileLoopTree;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] board =
                {
                        {"|", " ", "|", "0", "|", "1", "|", "2", "|", "3", "|", "4", "|", "5", "|", "6", "|", "7", "|", "8", "|", "9", "|"},
                        {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"|", "A", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|"},
                        {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"|", "B", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|"},
                        {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"|", "C", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|"},
                        {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"|", "D", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|"},
                        {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"|", "E", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|"},
                        {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"|", "F", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|"},
                        {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"|", "G", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|"},
                        {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"|", "H", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|"},
                        {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"|", "I", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|"},
                        {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
                        {"|", "J", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|", " ", "|"},
                        {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}
                };

        for (String[] row : board) {
            for (String position : row) {
                System.out.print(position);
            }
            System.out.println();
        }

        Scanner scan = new Scanner(System.in);
        String[] selectedPositions = new String[5];
        for (int i = 0; i < selectedPositions.length; i++) {
            System.out.print("Insira as posições dos 5 navios: ");
            selectedPositions[i] = scan.nextLine();
            String option = selectedPositions[i];
            switch (option) {
                case "A0":
                    board[2][3] = "N";
                    break;
                case "A1":
                    board[2][5] = "N";
                    break;
                case "A2":
                    board[2][7] = "N";
                    break;
                case "A3":
                    board[2][9] = "N";
                    break;
                case "A4":
                    board[2][11] = "N";
                    break;
                case "A5":
                    board[2][13] = "N";
                    break;
                case "A6":
                    board[2][15] = "N";
                    break;
                case "A7":
                    board[2][17] = "N";
                    break;
                case "A8":
                    board[2][19] = "N";
                    break;
                case "A9":
                    board[2][21] = "N";
                    break;
                case "B0":
                    board[3][3] = "N";
                    break;
                case "B1":
                    board[4][5] = "N";
                    break;
                case "B2":
                    board[4][7] = "N";
                    break;
                case "B3":
                    board[4][9] = "N";
                    break;
                case "B4":
                    board[4][11] = "N";
                    break;
                case "B5":
                    board[4][13] = "N";
                    break;
                case "B6":
                    board[4][15] = "N";
                    break;
                case "B7":
                    board[4][17] = "N";
                    break;
                case "B8":
                    board[4][19] = "N";
                    break;
                case "B9":
                    board[4][21] = "N";
                    break;
                case "C0":
                    board[6][3] = "N";
                    break;
                case "C1":
                    board[6][5] = "N";
                    break;
                case "C2":
                    board[6][7] = "N";
                    break;
                case "C3":
                    board[6][9] = "N";
                    break;
                case "C4":
                    board[6][11] = "N";
                    break;
                case "C5":
                    board[6][13] = "N";
                    break;
                case "C6":
                    board[6][15] = "N";
                    break;
                case "C7":
                    board[6][17] = "N";
                    break;
                case "C8":
                    board[6][19] = "N";
                    break;
                case "C9":
                    board[6][21] = "N";
                    break;
                case "D0":
                    board[8][3] = "N";
                    break;
                    case "D1":
                    board[8][5] = "N";
                    break;
                    case "D2":
                    board[8][7] = "N";
                    break;
                    case "D3":
                    board[8][9] = "N";
                    break;
                    case "D4":
                    board[8][11] = "N";
                    break;
                    case "D5":
                    board[8][13] = "N";
                    break;
                    case "D6":
                    board[8][15] = "N";
                    break;
                    case "D7":
                    board[8][17] = "N";
                    break;
                    case "D8":
                    board[8][19] = "N";
                    break;
                case "D9":
                    board[8][21] = "N";
                    break;
                case "E0":
                    board[10][3] = "N";
                    break;
                case "E1":
                    board[10][5] = "N";
                    break;
                case "E2":
                    board[10][7] = "N";
                    break;
                case "E3":
                    board[10][9] = "N";
                    break;
                case "E4":
                    board[10][11] = "N";
                    break;
                case "E5":
                    board[10][13] = "N";
                    break;
                case "E6":
                    board[10][15] = "N";
                    break;
                case "E7":
                    board[10][17] = "N";
                    break;
                case "E8":
                    board[10][19] = "N";
                    break;
                case "E9":
                    board[10][21] = "N";
                    break;
                case "F0":
                    board[12][3] = "N";
                    break;
                case "F1":
                    board[12][5] = "N";
                    break;
                case "F2":
                    board[12][7] = "N";
                    break;
                case "F3":
                    board[12][9] = "N";
                    break;
                case "F4":
                    board[12][11] = "N";
                    break;
                case "F5":
                    board[12][13] = "N";
                    break;
                case "F6":
                    board[12][15] = "N";
                    break;
                case "F7":
                    board[12][17] = "N";
                    break;
                case "F8":
                    board[12][19] = "N";
                    break;
                case "F9":
                    board[12][21] = "N";
                    break;
                case "G0":
                    board[14][3] = "N";
                    break;
                case "G1":
                    board[14][5] = "N";
                    break;
                case "G2":
                    board[14][7] = "N";
                    break;
                case "G3":
                    board[14][9] = "N";
                    break;
                case "G4":
                    board[14][11] = "N";
                    break;
                case "G5":
                    board[14][13] = "N";
                    break;
                case "G6":
                    board[14][15] = "N";
                    break;
                case "G7":
                    board[14][17] = "N";
                    break;
                case "G8":
                    board[14][19] = "N";
                    break;
                case "G9":
                    board[14][21] = "N";
                    break;
                case "H0":
                    board[16][3] = "N";
                    break;
                case "H1":
                    board[16][5] = "N";
                    break;
                case "H2":
                    board[16][7] = "N";
                    break;
                case "H3":
                    board[16][9] = "N";
                    break;
                case "H4":
                    board[16][11] = "N";
                    break;
                case "H5":
                    board[16][13] = "N";
                    break;
                case "H6":
                    board[16][15] = "N";
                    break;
                case "H7":
                    board[16][17] = "N";
                    break;
                case "H8":
                    board[16][19] = "N";
                    break;
                case "H9":
                    board[16][21] = "N";
                    break;
                case "I0":
                    board[18][3] = "N";
                    break;
                case "I1":
                    board[18][5] = "N";
                    break;
                case "I2":
                    board[18][7] = "N";
                    break;
                case "I3":
                    board[18][9] = "N";
                    break;
                case "I4":
                    board[18][11] = "N";
                    break;
                case "I5":
                    board[18][13] = "N";
                    break;
                case "I6":
                    board[18][15] = "N";
                    break;
                case "I7":
                    board[18][17] = "N";
                    break;
                case "I8":
                    board[18][19] = "N";
                    break;
                case "I9":
                    board[18][21] = "N";
                    break;
                case "J0":
                    board[20][3] = "N";
                    break;
                case "J1":
                    board[20][5] = "N";
                    break;
                case "J2":
                    board[20][7] = "N";
                    break;
                case "J3":
                    board[20][9] = "N";
                    break;
                case "J4":
                    board[20][11] = "N";
                    break;
                case "J5":
                    board[20][13] = "N";
                    break;
                case "J6":
                    board[20][15] = "N";
                    break;
                case "J7":
                    board[20][17] = "N";
                    break;
                case "J8":
                    board[20][19] = "N";
                    break;
                case "J9":
                    board[20][21] = "N";
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
        }
    }
}
