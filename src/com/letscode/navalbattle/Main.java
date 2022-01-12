package com.letscode.navalbattle;
import com.letscode.navalbattle.entities.ConsoleHandler;
import com.letscode.navalbattle.entities.GameHandler;
import com.letscode.navalbattle.entities.Player;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ConsoleHandler.clearConsole();
        boolean replay = true;
        while (replay) {
            Player[] players = GameHandler.runIntro();
            if (players == null) {
                return;
            }
            GameHandler.checkStart(players);
            Player lastStanding = GameHandler.startGame(players);
            GameHandler.endGame(lastStanding, players);

            replay = playAgain();
        }
    }

    public static boolean playAgain(){
        Scanner scanner = GameHandler.scanner;
        String answer = scanner.nextLine();
        boolean check = false;
        while (!answer.equals("Y") && !answer.equals("N")){
            System.out.println("\n\n" + "Should you try again?");
            System.out.println("(Y) Yes | (N) No");
            answer = scanner.nextLine().toUpperCase();
            if (answer.equals("Y")){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                check = true;
            } else if (answer.equals("N")){
                System.out.println("Farewell then!");
                check = false;
            }
        }
        ConsoleHandler.clearConsole();
        return check;
    }
}