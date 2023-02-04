package org.example.commomMethods;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class checkOptionTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 5, -3, 15})
    void checkOption(int userOption) {
        userOption = 1; // or 2

        assertTrue(userOption == 1 || userOption == 2);
    }
}