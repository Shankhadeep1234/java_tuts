package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePostion = claculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePostion);

        highScorePostion = claculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePostion);

        highScorePostion = claculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePostion);

        highScorePostion = claculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePostion);

        highScorePostion = claculateHighScorePosition(1000);
        displayHighScorePosition("Billy", highScorePostion);

        highScorePostion = claculateHighScorePosition(500);
        displayHighScorePosition("John", highScorePostion);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get position " + highScorePosition + " on the high score table");
    }

    public static int claculateHighScorePosition(int playerScore) {
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

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;

    }

}
