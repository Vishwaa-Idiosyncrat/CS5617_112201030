package controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @Test
    void testMainRunsWithoutError() {
        assertDoesNotThrow(() -> Program.main(new String[]{}));
    }
}