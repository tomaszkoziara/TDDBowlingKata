package com.tk.bowling;

public class BowlingGame {

    private int[] rolls = new int[23];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll] = pins;
        currentRoll++;
    }

    public int score() {
        int score = 0;
        int roll = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (rolls[roll] == 10) {
                score += rolls[roll];
                roll++;
            } else {
                score += rolls[roll] + rolls[roll + 1];
                roll += 2;
            }

        }
        return score;
    }

}
