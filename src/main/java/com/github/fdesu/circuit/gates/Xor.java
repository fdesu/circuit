package com.github.fdesu.circuit.gates;

public class Xor implements BinaryGate {

    private final Not not = new Not();
    private final And and = new And();
    private final Or or = new Or();

    @Override
    public boolean perform(boolean in1, boolean in2) {
        return or.perform(
                and.perform(not.perform(in1), in2),
                and.perform(in1, not.perform(in2))
        );
    }
}
