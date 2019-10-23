package com.github.fdesu.circuit.gates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class XnorTest {

    Xnor xnor = new Xnor();

    @Test
    void shouldComply() {
        assertTrue(xnor.perform(false, false));
        assertFalse(xnor.perform(true, false));
        assertFalse(xnor.perform(false, true));
        assertTrue(xnor.perform(true, true));
    }

}