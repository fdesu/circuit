package com.github.fdesu.circuit.fun;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerAdderTest {

    IntegerAdder adder = new IntegerAdder();

    @Test
    void shouldAdd() {
        for (int i = -1000; i < 1000; i++) {
            for (int j = -1000; j < 1000; j++) {
                assertEquals(i + j, adder.add(i, j));
            }
        }

        assertEquals(Integer.MAX_VALUE + 1, adder.add(Integer.MAX_VALUE, 1));
    }

}