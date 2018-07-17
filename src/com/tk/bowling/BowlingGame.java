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
            if (isStrike(roll)) {
                score += rolls[roll];
                score += rolls[roll + 1];
                score += rolls[roll + 2];
                roll++;
            } else if (isSpare(roll)) {
                score += rolls[roll] + rolls[roll + 1] + rolls[roll + 2];
                roll += 2;
            } else {
                score += rolls[roll] + rolls[roll + 1];
                roll += 2;
            }

        }
        return score;
    }

    private boolean isSpare(int roll) {
        return rolls[roll] + rolls[roll + 1] == 10;
    }

    private boolean isStrike(int roll) {
        return rolls[roll] == 10;
    }


}
