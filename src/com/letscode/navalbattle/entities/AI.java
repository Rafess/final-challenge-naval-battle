package com.letscode.navalbattle.entities;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class AI {
    public static void playAI(String[] args) {
            }
    public static void handleAIAttack(String[][] playerBoard) {
        int[] attacks = new int[100];
        for (int a = 0; a < attacks.length; a++) {
            attacks[a] = a;
        }
        Random randomAttack = new Random();
        int randomIndex;
        int attackAI = 0;
        for (int i = 0; i < attacks.length; i++) {
            randomIndex = randomAttack.nextInt(attacks.length);
            attackAI = attacks[randomIndex];
            attacks[randomIndex] = attacks[i];
            attacks[i] = attackAI;
        }
        switch (attackAI) {
            case 0:
                if (Objects.equals(playerBoard[2][3], "N") || Objects.equals(playerBoard[2][3], "n")) {
                    playerBoard[2][3] = "*";
                } else {
                    playerBoard[2][3] = "-";
                }
                break;
            case 1:
                if (Objects.equals(playerBoard[2][5], "N")) {
                    playerBoard[2][5] = "*";
                } else {
                    playerBoard[2][5] = "-";
                }
                break;
            case 2:
                if (Objects.equals(playerBoard[2][7], "N")) {
                    playerBoard[2][7] = "*";
                } else {
                    playerBoard[2][7] = "-";
                }
                break;
            case 3:
                if (Objects.equals(playerBoard[2][9], "N")) {
                    playerBoard[2][9] = "*";
                } else {
                    playerBoard[2][9] = "-";
                }
                break;
            case 4:
                if (Objects.equals(playerBoard[2][11], "N")) {
                    playerBoard[2][11] = "*";
                } else {
                    playerBoard[2][11] = "-";
                }
                break;
            case 5:
                if (Objects.equals(playerBoard[2][13], "N")) {
                    playerBoard[2][13] = "*";
                } else {
                    playerBoard[2][13] = "-";
                }
                break;
            case 6:
                if (Objects.equals(playerBoard[2][15], "N")) {
                    playerBoard[2][15] = "*";
                } else {
                    playerBoard[2][15] = "-";
                }
                break;
            case 7:
                if (Objects.equals(playerBoard[2][17], "N")) {
                    playerBoard[2][17] = "*";
                } else {
                    playerBoard[2][17] = "-";
                }
                break;
            case 8:
                if (Objects.equals(playerBoard[2][19], "N")) {
                    playerBoard[2][19] = "*";
                } else {
                    playerBoard[2][19] = "-";
                }
                break;
            case 9:
                if (Objects.equals(playerBoard[2][21], "N")) {
                    playerBoard[2][21] = "*";
                } else {
                    playerBoard[2][21] = "-";
                }
                break;
            case 10:
                if (Objects.equals(playerBoard[4][3], "N")) {
                    playerBoard[4][3] = "*";
                } else {
                    playerBoard[4][3] = "-";
                }
                break;
            case 11:
                if (Objects.equals(playerBoard[4][5], "N")) {
                    playerBoard[4][5] = "*";
                } else {
                    playerBoard[4][5] = "-";
                }
                break;
            case 12:
                if (Objects.equals(playerBoard[4][7], "N")) {
                    playerBoard[4][7] = "*";
                } else {
                    playerBoard[4][7] = "-";
                }
                break;
            case 13:
                if (Objects.equals(playerBoard[4][9], "N")) {
                    playerBoard[4][9] = "*";
                } else {
                    playerBoard[4][9] = "-";
                }
                break;
            case 14:
                if (Objects.equals(playerBoard[4][11], "N")) {
                    playerBoard[4][11] = "*";
                } else {
                    playerBoard[4][11] = "-";
                }
                break;
            case 15:
                if (Objects.equals(playerBoard[4][13], "N")) {
                    playerBoard[4][13] = "*";
                } else {
                    playerBoard[4][13] = "-";
                }
                break;
            case 16:
                if (Objects.equals(playerBoard[4][15], "N")) {
                    playerBoard[4][15] = "*";
                } else {
                    playerBoard[4][15] = "-";
                }
                break;
            case 17:
                if (Objects.equals(playerBoard[4][17], "N")) {
                    playerBoard[4][17] = "*";
                } else {
                   playerBoard[4][17] = "-";
                }
                break;
            case 18:
                if (Objects.equals(playerBoard[4][19], "N")) {
                    playerBoard[4][19] = "*";
                } else {
                    playerBoard[4][19] = "-";
                }
                break;
            case 19:
                if (Objects.equals(playerBoard[4][21], "N")) {
                    playerBoard[4][21] = "N";
                } else {
                    playerBoard[4][21] = "-";
                }
                break;
            case 20:
                if (Objects.equals(playerBoard[6][3], "N")) {
                    playerBoard[6][3] = "*";
                } else {
                    playerBoard[6][3] = "-";
                }
                break;
            case 21:
                if (Objects.equals(playerBoard[6][5], "N")) {
                    playerBoard[6][5] = "*";
                } else {
                    playerBoard[6][5] = "-";
                }
                break;
            case 22:
                if (Objects.equals(playerBoard[6][7], "N")) {
                    playerBoard[6][7] = "*";
                } else {
                    playerBoard[6][7] = "-";
                }
                break;
            case 23:
                if (Objects.equals(playerBoard[6][9], "N")) {
                    playerBoard[6][9] = "*";
                } else {
                    playerBoard[6][9] = "-";
                }
                break;
            case 24:
                if (Objects.equals(playerBoard[6][11], "N")) {
                    playerBoard[6][11] = "*";
                } else {
                    playerBoard[6][11] = "-";
                }
                break;
            case 25:
                if (Objects.equals(playerBoard[6][13], "N")) {
                    playerBoard[6][13] = "*";
                } else {
                    playerBoard[6][13] = "-";
                }
                break;
            case 26:
                if (Objects.equals(playerBoard[6][15], "N")) {
                    playerBoard[6][15] = "*";
                } else {
                    playerBoard[6][15] = "-";
                }
                break;
            case 27:
                if (Objects.equals(playerBoard[6][17], "N")) {
                    playerBoard[6][17] = "*";
                } else {
                    playerBoard[6][17] = "-";
                }
                break;
            case 28:
                if (Objects.equals(playerBoard[6][19], "N")) {
                    playerBoard[6][19] = "*";
                } else {
                    playerBoard[6][19] = "-";
                }
                break;
            case 29:
                if (Objects.equals(playerBoard[6][21], "N")) {
                    playerBoard[6][21] = "*";
                } else {
                    playerBoard[6][21] = "-";
                }
                break;
            case 30:
                if (Objects.equals(playerBoard[8][3], "N")) {
                    playerBoard[8][3] = "*";
                } else {
                    playerBoard[8][3] = "-";
                }
                break;
            case 31:
                if (Objects.equals(playerBoard[8][5], "N")) {
                    playerBoard[8][5] = "*";
                } else {
                    playerBoard[8][5] = "-";
                }
                break;
            case 32:
                if (Objects.equals(playerBoard[8][7], "N")) {
                    playerBoard[8][7] = "*";
                } else {
                    playerBoard[8][7] = "-";
                }
                break;
            case 33:
                if (Objects.equals(playerBoard[8][9], "N")) {
                    playerBoard[8][9] = "*";
                } else {
                    playerBoard[8][9] = "-";
                }
                break;
            case 34:
                if (Objects.equals(playerBoard[8][11], "N")) {
                    playerBoard[8][11] = "*";
                } else {
                    playerBoard[8][11] = "-";
                }
                break;
            case 35:
                if (Objects.equals(playerBoard[8][13], "N")) {
                    playerBoard[8][13] = "*";
                } else {
                    playerBoard[8][13] = "-";
                }
                break;
            case 36:
                if (Objects.equals(playerBoard[8][15], "N")) {
                    playerBoard[8][15] = "*";
                } else {
                    playerBoard[8][15] = "-";
                }
                break;
            case 37:
                if (Objects.equals(playerBoard[8][17], "N")) {
                    playerBoard[8][17] = "*";
                } else {
                    playerBoard[8][17] = "-";
                }
                break;
            case 38:
                if (Objects.equals(playerBoard[8][19], "N")) {
                    playerBoard[8][19] = "*";
                } else {
                    playerBoard[8][19] = "-";
                }
                break;
            case 39:
                if (Objects.equals(playerBoard[8][21], "N")) {
                    playerBoard[8][21] = "*";
                } else {
                    playerBoard[8][21] = "-";
                }
                break;
            case 40:
                if (Objects.equals(playerBoard[10][3], "N")) {
                    playerBoard[10][3] = "*";
                } else {
                    playerBoard[10][3] = "-";
                }
                break;
            case 41:
                if (Objects.equals(playerBoard[10][5], "N")) {
                    playerBoard[10][5] = "*";
                } else {
                    playerBoard[10][5] = "-";
                }
                break;
            case 42:
                if (Objects.equals(playerBoard[10][7], "N")) {
                    playerBoard[10][7] = "*";
                } else {
                    playerBoard[10][7] = "-";
                }
                break;
            case 43:
                if (Objects.equals(playerBoard[10][9], "N")) {
                    playerBoard[10][9] = "*";
                } else {
                    playerBoard[10][9] = "-";
                }
                break;
            case 44:
                if (Objects.equals(playerBoard[10][11], "N")) {
                    playerBoard[10][11] = "*";
                } else {
                    playerBoard[10][11] = "-";
                }
                break;
            case 45:
                if (Objects.equals(playerBoard[10][13], "N")) {
                    playerBoard[10][13] = "*";
                } else {
                    playerBoard[10][13] = "-";
                }
                break;
            case 46:
                if (Objects.equals(playerBoard[10][15], "N")) {
                    playerBoard[10][15] = "*";
                } else {
                    playerBoard[10][15] = "-";
                }
                break;
            case 47:
                if (Objects.equals(playerBoard[10][17], "N")) {
                    playerBoard[10][17] = "*";
                } else {
                    playerBoard[10][17] = "-";
                }
                break;
            case 48:
                if (Objects.equals(playerBoard[10][19], "N")) {
                    playerBoard[10][19] = "*";
                } else {
                    playerBoard[10][19] = "-";
                }
                break;
            case 49:
                if (Objects.equals(playerBoard[10][21], "N")) {
                    playerBoard[10][21] = "*";
                } else {
                    playerBoard[10][21] = "-";
                }
                break;
            case 50:
                if (Objects.equals(playerBoard[12][3], "N")) {
                    playerBoard[12][3] = "*";
                } else {
                    playerBoard[12][3] = "-";
                }
                break;
            case 51:
                if (Objects.equals(playerBoard[12][5], "N")) {
                    playerBoard[12][5] = "*";
                } else {
                    playerBoard[12][5] = "-";
                }
                break;
            case 52:
                if (Objects.equals(playerBoard[12][7], "N")) {
                    playerBoard[12][7] = "*";
                } else {
                    playerBoard[12][7] = "-";
                }
                break;
            case 53:
                if (Objects.equals(playerBoard[12][9], "N")) {
                    playerBoard[12][9] = "*";
                } else {
                    playerBoard[12][9] = "-";
                }
                break;
            case 54:
                if (Objects.equals(playerBoard[12][11], "N")) {
                    playerBoard[12][11] = "*";
                } else {
                    playerBoard[12][11] = "-";
                }
                break;
            case 55:
                if (Objects.equals(playerBoard[12][13], "N")) {
                    playerBoard[12][13] = "*";
                } else {
                    playerBoard[12][13] = "-";
                }
                break;
            case 56:
                if (Objects.equals(playerBoard[12][15], "N")) {
                    playerBoard[12][15] = "*";
                } else {
                    playerBoard[12][15] = "-";
                }
                break;
            case 57:
                if (Objects.equals(playerBoard[12][17], "N")) {
                    playerBoard[12][17] = "*";
                } else {
                    playerBoard[12][17] = "-";
                }
                break;
            case 58:
                if (Objects.equals(playerBoard[12][19], "N")) {
                    playerBoard[12][19] = "*";
                } else {
                    playerBoard[12][19] = "-";
                }
                break;
            case 59:
                if (Objects.equals(playerBoard[12][21], "N")) {
                    playerBoard[12][21] = "*";
                } else {
                    playerBoard[12][21] = "-";
                }
                break;
            case 60:
                if (Objects.equals(playerBoard[14][3], "N")) {
                    playerBoard[14][3] = "*";
                } else {
                    playerBoard[14][3] = "-";
                }
                break;
            case 61:
                if (Objects.equals(playerBoard[14][5], "N")) {
                    playerBoard[14][5] = "*";
                } else {
                    playerBoard[14][5] = "-";
                }
                break;
            case 62:
                if (Objects.equals(playerBoard[14][7], "N")) {
                    playerBoard[14][7] = "*";
                } else {
                    playerBoard[14][7] = "-";
                }
                break;
            case 63:
                if (Objects.equals(playerBoard[14][9], "N")) {
                    playerBoard[14][9] = "*";
                } else {
                    playerBoard[14][9] = "-";
                }
                break;
            case 64:
                if (Objects.equals(playerBoard[14][11], "N")) {
                    playerBoard[14][11] = "*";
                } else {
                    playerBoard[14][11] = "-";
                }
                break;
            case 65:
                if (Objects.equals(playerBoard[14][13], "N")) {
                    playerBoard[14][13] = "*";
                } else {
                    playerBoard[14][13] = "-";
                }
                break;
            case 66:
                if (Objects.equals(playerBoard[14][15], "N")) {
                    playerBoard[14][15] = "*";
                } else {
                    playerBoard[14][15] = "-";
                }
                break;
            case 67:
                if (Objects.equals(playerBoard[14][17], "N")) {
                    playerBoard[14][17] = "*";
                } else {
                    playerBoard[14][17] = "-";
                }
                break;
            case 68:
                if (Objects.equals(playerBoard[14][19], "N")) {
                    playerBoard[14][19] = "*";
                } else {
                    playerBoard[14][19] = "-";
                }
                break;
            case 69:
                if (Objects.equals(playerBoard[14][21], "N")) {
                    playerBoard[14][21] = "*";
                } else {
                    playerBoard[14][21] = "-";
                }
                break;
            case 70:
                if (Objects.equals(playerBoard[16][3], "N")) {
                    playerBoard[16][3] = "*";
                } else {
                    playerBoard[16][3] = "-";
                }
                break;
            case 71:
                if (Objects.equals(playerBoard[16][5], "N")) {
                    playerBoard[16][5] = "*";
                } else {
                    playerBoard[16][5] = "-";
                }
                break;
            case 72:
                if (Objects.equals(playerBoard[16][7], "N")) {
                    playerBoard[16][7] = "*";
                } else {
                    playerBoard[16][7] = "-";
                }
                break;
            case 73:
                if (Objects.equals(playerBoard[16][9], "N")) {
                    playerBoard[16][9] = "*";
                } else {
                    playerBoard[16][9] = "-";
                }
                break;
            case 74:
                if (Objects.equals(playerBoard[16][11], "N")) {
                    playerBoard[16][11] = "*";
                } else {
                    playerBoard[16][11] = "-";
                }
                break;
            case 75:
                if (Objects.equals(playerBoard[16][13], "N")) {
                    playerBoard[16][13] = "*";
                } else {
                    playerBoard[16][13] = "-";
                }
                break;
            case 76:
                if (Objects.equals(playerBoard[16][15], "N")) {
                    playerBoard[16][15] = "*";
                } else {
                    playerBoard[16][15] = "-";
                }
                break;
            case 77:
                if (Objects.equals(playerBoard[16][17], "N")) {
                    playerBoard[16][17] = "*";
                } else {
                    playerBoard[16][17] = "-";
                }
                break;
            case 78:
                if (Objects.equals(playerBoard[16][19], "N")) {
                    playerBoard[16][19] = "*";
                } else {
                    playerBoard[16][19] = "-";
                }
                break;
            case 79:
                if (Objects.equals(playerBoard[16][21], "N")) {
                    playerBoard[16][21] = "*";
                } else {
                    playerBoard[16][21] = "-";
                }
                break;
            case 80:
                if (Objects.equals(playerBoard[18][3], "N")) {
                    playerBoard[18][3] = "*";
                } else {
                    playerBoard[18][3] = "-";
                }
                break;
            case 81:
                if (Objects.equals(playerBoard[18][5], "N")) {
                    playerBoard[18][5] = "*";
                } else {
                    playerBoard[18][5] = "-";
                }
                break;
            case 82:
                if (Objects.equals(playerBoard[18][7], "N")) {
                    playerBoard[18][7] = "*";
                } else {
                    playerBoard[18][7] = "-";
                }
                break;
            case 83:
                if (Objects.equals(playerBoard[18][9], "N")) {
                    playerBoard[18][9] = "*";
                } else {
                    playerBoard[18][9] = "-";
                }
                break;
            case 84:
                if (Objects.equals(playerBoard[18][11], "N")) {
                    playerBoard[18][11] = "*";
                } else {
                    playerBoard[18][11] = "-";
                }
                break;
            case 85:
                if (Objects.equals(playerBoard[18][13], "N")) {
                    playerBoard[18][13] = "*";
                } else {
                    playerBoard[18][13] = "-";
                }
                break;
            case 86:
                if (Objects.equals(playerBoard[18][15], "N")) {
                    playerBoard[18][15] = "*";
                } else {
                    playerBoard[18][15] = "-";
                }
                break;
            case 87:
                if (Objects.equals(playerBoard[18][17], "N")) {
                    playerBoard[18][17] = "*";
                } else {
                    playerBoard[18][17] = "-";
                }
                break;
            case 88:
                if (Objects.equals(playerBoard[18][19], "N")) {
                    playerBoard[18][19] = "*";
                } else {
                    playerBoard[18][19] = "-";
                }
                break;
            case 89:
                if (Objects.equals(playerBoard[18][21], "N")) {
                    playerBoard[18][21] = "*";
                } else {
                    playerBoard[18][21] = "-";
                }
                break;
            case 90:
                if (Objects.equals(playerBoard[20][3], "N")) {
                    playerBoard[20][3] = "*";
                } else {
                    playerBoard[20][3] = "-";
                }
                break;
            case 91:
                if (Objects.equals(playerBoard[20][5], "N")) {
                    playerBoard[20][5] = "*";
                } else {
                    playerBoard[20][5] = "-";
                }
                break;
            case 92:
                if (Objects.equals(playerBoard[20][7], "N")) {
                    playerBoard[20][7] = "*";
                } else {
                    playerBoard[20][7] = "-";
                }
                break;
            case 93:
                if (Objects.equals(playerBoard[20][9], "N")) {
                    playerBoard[20][9] = "*";
                } else {
                    playerBoard[20][9] = "-";
                }
                break;
            case 94:
                if (Objects.equals(playerBoard[20][11], "N")) {
                    playerBoard[20][11] = "*";
                } else {
                    playerBoard[20][11] = "-";
                }
                break;
            case 95:
                if (Objects.equals(playerBoard[20][13], "N")) {
                    playerBoard[20][13] = "*";
                } else {
                    playerBoard[20][13] = "-";
                }
                break;
            case 96:
                if (Objects.equals(playerBoard[20][15], "N")) {
                    playerBoard[20][15] = "*";
                } else {
                    playerBoard[20][15] = "-";
                }
                break;
            case 97:
                if (Objects.equals(playerBoard[20][17], "N")) {
                    playerBoard[20][17] = "*";
                } else {
                    playerBoard[20][17] = "-";
                }
                break;
            case 98:
                if (Objects.equals(playerBoard[20][19], "N")) {
                    playerBoard[20][19] = "*";
                } else {
                    playerBoard[20][19] = "-";
                }
                break;
            case 99:
                if (Objects.equals(playerBoard[20][21], "N")) {
                    playerBoard[20][21] = "*";
                } else {
                    playerBoard[20][21] = "-";
                }
                break;
        }
        System.out.println(attackAI);
    }
}


