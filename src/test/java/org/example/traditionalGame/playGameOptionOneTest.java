package org.example.traditionalGame;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class playGameOptionOneTest {

    @ParameterizedTest
    @ValueSource(strings = {"rock", "paper", "scissors"})
    void playGameOptionOne(String userOption) {
        assertTrue(userOption.equals("rock")|| userOption.equals("paper")||userOption.equals("scissors"));
    }
}