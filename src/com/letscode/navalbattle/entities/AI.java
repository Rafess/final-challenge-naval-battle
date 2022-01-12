package com.letscode.navalbattle.entities;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class AI extends Player{

    public AI (int[] boardSize){
        super("BattleAI", boardSize);
    }

    public AI (String name, int[] boardSize){
        super(name, boardSize);
    }

    private String generateRandomField(){
        int boardRows = (this.board.length - 2)/2;
        int boardColumns = (this.board[0].length - 2)/2;
        String[] dictionary = GameHandler.dictionary();
        Random rng = new Random();
        String rowCode = dictionary[rng.nextInt(boardRows)];
        int colCode = rng.nextInt(boardColumns);
        return rowCode + String.valueOf(colCode);
    }

    public String placeShip(){
        return this.generateRandomField();
    }

    public String attack(){
        return this.generateRandomField();
    }

}


