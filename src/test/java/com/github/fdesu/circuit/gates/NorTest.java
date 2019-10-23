package com.github.fdesu.circuit.gates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NorTest {

    Nor nor = new Nor();

    @Test
    void shouldComply() {
        assertTrue(nor.perform(false, false));
        assertFalse(nor.perform(true, false));
        assertFalse(nor.perform(false, true));
        assertFalse(nor.perform(true, true));
    }

}