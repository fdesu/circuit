package com.github.fdesu.circuit.fun;

import com.github.fdesu.circuit.gates.BinaryGate;
import com.github.fdesu.circuit.gates.Gates;

public class BinaryAdder {

    private final HalfAdder halfAdder1 = new HalfAdder();
    private final HalfAdder halfAdder2 = new HalfAdder();
    private final BinaryGate or = Gates.or();

    private boolean bit;
    private boolean carry;

    public void go(boolean sig1, boolean sig2, boolean carry) {
        halfAdder1.halfAdd(sig1, sig2);
        halfAdder2.halfAdd(halfAdder1.bit(), carry);

        this.bit = halfAdder2.bit();
        this.carry = or.perform(halfAdder1.carry(), halfAdder2.carry());
    }

    public boolean bit() {
        return bit;
    }

    public boolean carry() {
        return carry;
    }

    private static class HalfAdder {
        private final BinaryGate xor = Gates.xor();
        private final BinaryGate and = Gates.and();

        private boolean bit;
        private boolean carry;

        private void halfAdd(boolean a, boolean b) {
            bit = xor.perform(a, b);
            carry = and.perform(a, b);
        }

        public boolean bit() {
            return bit;
        }
        public boolean carry() {
            return carry;
        }
    }

}
