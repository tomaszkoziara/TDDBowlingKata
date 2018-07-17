package com.tk.bowling.test;

import com.tk.bowling.BowlingGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    BowlingGame bowlingGame;

    @BeforeEach
    public void setUp() {
        bowlingGame = new BowlingGame();
    }

    @Test
    public void testAllMisses() {
        rollMany(0, 20);
        assertEquals(0, bowlingGame.score());
    }

    @Test
    public void testAllOnePin() {
        rollMany(1, 20);
        assertEquals(20, bowlingGame.score());
    }

    @Test
    public void testSpare() {
        bowlingGame.roll(5);
        bowlingGame.roll(5);
        bowlingGame.roll(3);
        rollMany(0, 17);
        assertEquals(16, bowlingGame.score());
    }

    @Test
    public void testStrike() {
        bowlingGame.roll(10);
        bowlingGame.roll(4);
        bowlingGame.roll(2);
        rollMany(0, 18);
        assertEquals(22, bowlingGame.score());
    }

    public void rollMany(int pins, int times) {
        for (int i = 0; i < times; i++) {
            bowlingGame.roll(pins);
        }
    }

}
