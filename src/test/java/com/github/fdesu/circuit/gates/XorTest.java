package com.github.fdesu.circuit.gates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class XorTest {

    Xor xor = new Xor();

    @Test
    void shouldComply() {
        assertFalse(xor.perform(false, false));
        assertTrue(xor.perform(true, false));
        assertTrue(xor.perform(false, true));
        assertFalse(xor.perform(true, true));
    }

}