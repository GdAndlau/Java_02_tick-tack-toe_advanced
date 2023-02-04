package org.example.commomMethods;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class computerPicksOptionTest {

    @ParameterizedTest
    @ValueSource(strings = "abc")
    void computerPicksOption(String computerOption) {
        assertTrue(computerOption.getClass().equals(String.class));
    }
}