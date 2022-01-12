package com.letscode.navalbattle.entities;

public class ConsoleHandler {

    public final static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
        }
    }
}
