package com.basepackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playerName = scan.nextLine();
        int playerScore = scan.nextInt();

        int position = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, position);

         scan = new Scanner(System.in);
         playerName = scan.nextLine();
         playerScore = scan.nextInt();

        position = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, position);

        scan = new Scanner(System.in);
        playerName = scan.nextLine();
        playerScore = scan.nextInt();

        position = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, position);

        scan = new Scanner(System.in);
        playerName = scan.nextLine();
        playerScore = scan.nextInt();

        position = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, position);

    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + "managed to get into position "
            + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }

    }


}
