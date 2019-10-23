package com.github.fdesu.circuit.fun;

import com.github.fdesu.circuit.gates.BinaryGate;
import com.github.fdesu.circuit.gates.Gates;

public class BinaryAdder {

    private final BinaryGate xor = Gates.xor();
    private final BinaryGate and = Gates.and();
    private final BinaryGate or = Gates.or();

    private boolean bit;
    private boolean carry;

    public void go(boolean sig1, boolean sig2, boolean carry) {
        boolean[] first = halfAdd(sig1, sig2);
        boolean[] second = halfAdd(first[0], carry);

        this.bit = second[0];
        this.carry = or.perform(first[1], second[1]);
    }

    public boolean bit() {
        return bit;
    }

    public boolean carry() {
        return carry;
    }

    private boolean[] halfAdd(boolean a, boolean b) {
        return new boolean[] {
                xor.perform(a, b),
                and.perform(a, b)
        };
    }

}
