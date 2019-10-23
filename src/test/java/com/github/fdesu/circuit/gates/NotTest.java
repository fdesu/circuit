package com.github.fdesu.circuit.gates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NotTest {

    Not not = new Not();

    @Test
    void shouldComply() {
        assertTrue(not.perform(false));
        assertFalse(not.perform(true));
    }

}