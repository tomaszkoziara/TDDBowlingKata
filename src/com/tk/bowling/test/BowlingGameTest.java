package com.tk.bowling.test;

import com.tk.bowling.BowlingGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {

    @Test
    public void testAllMisses() {
        BowlingGame bowlingGame = new BowlingGame();
        for (int i = 0; i < 20; i++) {
            bowlingGame.roll(0);
        }
        assertEquals(0, bowlingGame.score());
    }

}
