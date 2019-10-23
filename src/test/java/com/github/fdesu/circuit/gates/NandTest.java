package com.github.fdesu.circuit.gates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NandTest {

    Nand nand = new Nand();

    @Test
    void shouldComply() {
        assertTrue(nand.perform(false, false));
        assertTrue(nand.perform(true, false));
        assertTrue(nand.perform(false, true));
        assertFalse(nand.perform(true, true));
    }

}