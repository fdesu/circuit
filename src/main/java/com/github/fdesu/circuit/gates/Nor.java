package com.github.fdesu.circuit.gates;

public class Nor implements BinaryGate {

    private final Or or = new Or();
    private final Not not = new Not();

    @Override
    public boolean perform(boolean in1, boolean in2) {
        return not.perform(
                or.perform(in1, in2)
        );
    }
}
