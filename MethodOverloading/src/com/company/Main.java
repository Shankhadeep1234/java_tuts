package com.company;

public class Main {

    public static void main(String[] args) {
       int newScore = calculateScore("Raj", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score);
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name and no player score ");
        return 0;
    }

}
