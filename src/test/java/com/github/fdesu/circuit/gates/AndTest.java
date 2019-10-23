package com.github.fdesu.circuit.gates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AndTest {
    And and = new And();

    @Test
    void shouldComply() {
        assertFalse(and.perform(false, false));
        assertFalse(and.perform(true, false));
        assertFalse(and.perform(false, true));
        assertTrue(and.perform(true, true));
    }
}