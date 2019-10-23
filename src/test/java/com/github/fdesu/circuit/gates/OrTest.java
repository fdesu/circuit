package com.github.fdesu.circuit.gates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OrTest {

    Or or = new Or();

    @Test
    void shouldComply() {
        assertFalse(or.perform(false, false));
        assertTrue(or.perform(true, false));
        assertTrue(or.perform(false, true));
        assertTrue(or.perform(true, true));
    }

}