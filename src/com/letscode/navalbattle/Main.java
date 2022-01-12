package com.letscode.navalbattle;
import com.letscode.navalbattle.entities.AI;
import com.letscode.navalbattle.entities.Board;
import com.letscode.navalbattle.entities.GameHandler;
import com.letscode.navalbattle.entities.Player;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Player[] players = GameHandler.runIntro();
        if (players == null){
            return;
        }
        GameHandler.checkStart(players);
        Player lastStanding = GameHandler.startGame(players);
        GameHandler.endGame(lastStanding, players);
    }
}