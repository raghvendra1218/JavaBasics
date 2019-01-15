package com.raghvendra;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int highScore = calculator(true, 800,5,100);
        System.out.println("Your final score was: " + highScore);

        highScore = calculator(true,10000, 8, 200);
        System.out.println("Your final score was: " + highScore);
    }
    public static int calculator(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
//            System.out.println("Your final score was: " + finalScore);
            return finalScore;
        }
        return -1;
    }
}
