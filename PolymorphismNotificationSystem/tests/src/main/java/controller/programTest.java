package controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ProgramTest {

    @Test
    void testMainRunsWithoutError() {
        assertDoesNotThrow(() -> Program.main(new String[]{}));
    }
}
