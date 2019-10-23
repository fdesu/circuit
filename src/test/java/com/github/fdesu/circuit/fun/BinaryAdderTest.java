package com.github.fdesu.circuit.fun;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryAdderTest {

    BinaryAdder adder = new BinaryAdder();

    @Test
    void shouldAddWithoutCarry() {
        adder.go(false, false, false);
        verify(false, false);

        adder.go(true, false, false);
        verify(true, false);

        adder.go(false, true, false);
        verify(true, false);

        adder.go(true, true, false);
        verify(false, true);
    }

    @Test
    void shouldAddWithCarry() {
        adder.go(false, false, true);
        verify(true, false);

        adder.go(true, false, true);
        verify(false, true);

        adder.go(false, true, true);
        verify(false, true);

        adder.go(true, true, true);
        verify(true, true);
    }

    private void verify(boolean bit, boolean carry) {
        assertEquals(bit,adder.bit());
        assertEquals(carry, adder.carry());
    }

}