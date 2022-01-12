package com.letscode.navalbattle.entities;

import java.util.*;

public class GameHandler {

    public static final Scanner scanner = new Scanner(System.in);

    public static String[] dictionary() {
        return new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    }

    public static Player[] runIntro(){
        System.out.println("Welcome to the Ultimate Battleship Battle!" + "\n" +
                            "How many fighters will be joining us today?" + "\n" +
                            "(Type the number of players)");
        int numberOfPlayers = -1;
        while(numberOfPlayers < 0) {
            try {
                numberOfPlayers = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Please, provide a number");
                numberOfPlayers = -1;
            }
        }
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
            String nameSuffix = "";
            if(arrayOfNames[i].length()>=2) {
                nameSuffix = arrayOfNames[i].substring(arrayOfNames[i].length() - 2);
            }
            if (nameSuffix.equals("AI")) {
                players[i] = new AI(arrayOfNames[i], boardSize);
            } else {
                players[i] = new Player(arrayOfNames[i], boardSize);
            }
        }
        if (numberOfPlayers == 1){
            players[1] = new AI(boardSize);
        }
        return players;
    }

    public static int[] difficultHandler(){
        int[] available = {1, 2, 3, 4};
        System.out.println("Now, select a difficulty:" + "\n" +
                "1 - Easy (3x3) | 2 - Medium (5x5) | 3 - Hard (10x10) | 4 - Custom Board Size");
        int selector = 0;
        try {
            selector = Integer.parseInt(scanner.nextLine());
        } catch (Exception e){
            selector = 0;
            while (selector > available[available.length - 1] || selector < available[0]) {
                System.out.println("Please, provide a number between 1~4");
                try {
                    selector = Integer.parseInt(scanner.nextLine());
                } catch (Exception exception){
                    selector = 0;
                }
            }
        }
        switch (selector) {
            case 1:
                return new int[]{3, 3};
            case 2:
                return new int[]{5, 5};
            case 3:
                return new int[]{10, 10};
            case 4:
                System.out.println("How many rows do you wish?");
                int rows = scanner.nextInt();
                System.out.println("And how many columns?");
                int columns = scanner.nextInt();
                return new int[]{rows, columns};
            default:
                break;
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
            while (!Board.checkFullBoard(players[i].board, "N") || counter > 0) {
                if(!(players[i] instanceof AI)) {
                    System.out.printf("%s, you have %d ship(s) left" + "\n", players[i].name, counter);
                }
                try {
                    String field = players[i].placeShip();
                    if(Board.getBoardField(field, players[i].board) != "N" &&
                        Board.setBoardField(field, players[i].board, "N")) {
                        counter--;
                    }
                if(!(players[i] instanceof AI)) {
                    Board.printBoard(players[i].board);
                }
                }catch (Exception e){
                continue;
                }
            }
            for (int j = 0; j < players[0].board.length * 2; j++) {
                System.out.println("\n");
            }
        }
    }

    public static boolean handleAttack(Player attacker, Player target){
        System.out.printf("%s is attacking %s" + "\n", attacker.name, target.name);
        String fieldTarget = attacker.attack();
        try {
            if (Board.getBoardField(fieldTarget, target.board) == "N") {
                Board.setBoardField(fieldTarget, target.board, "*");
                System.out.println("Target down!" + "\n--------------------");
                return true;
            } else if (Board.getBoardField(fieldTarget, target.board) == " ") {
                Board.setBoardField(fieldTarget, target.board, "-");
            }
            System.out.println("Shot missed" + "\n--------------------");
            return false;
        }catch (Exception e){
            return handleAttack(attacker, target);
        }
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
                                    System.out.printf("%s lays in the bottom of the sea.%n%n%n", players[j].name);
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
        if (!(winner instanceof AI)){
            System.out.printf("\n\n\n\n" + "As the cannons begin to cool, and waves drive the bodies ashore," + "\n" +
                                "may this day be graved into history." + "\n" +
                                "Rejoice, %s, for you have defeated all your enemies!" + "\n" +
                                "shall their blood paint the ocean red" + "\n" +
                                "and all their past treasures, keep your pockets fed!", winner.name);
        } else{
            System.out.printf("\n\n\n\n"+"As brave as they could be, no man nor woman could %s defeat!" + "\n" +
                                "For it is indeed, a killer machine!", winner.name);
        }
    }

}
