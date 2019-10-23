package com.github.fdesu.circuit.gates;

public class Xnor implements BinaryGate {

    private final Not not = new Not();
    private final Xor xor = new Xor();

    @Override
    public boolean perform(boolean in1, boolean in2) {
        return not.perform(
                xor.perform(in1, in2)
        );
    }
}
