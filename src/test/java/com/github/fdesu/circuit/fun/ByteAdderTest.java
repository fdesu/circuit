package com.github.fdesu.circuit.fun;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ByteAdderTest {

    ByteAdder adder = new ByteAdder();

    @Test
    void shouldAdd() {
        for (byte i = -128; i < 127; i++) {
            for (byte j = -128; j < 127; j++) {
                assertEquals((byte)(i + j), adder.add(i, j));
            }
        }
    }
}