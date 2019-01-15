package com.raghvendra;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Mark", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Shane", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Rita", position);
    }
    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name +" managed to get into " + position + " on the high score table.");
    }
    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if(score >= 1000) {
            position = 1;
        }
        else if(score >= 500) {
            position = 2;
        }
        else if(score >= 100) {
            position = 3;
        }
        return position;
    }
}
