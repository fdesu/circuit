package com.github.fdesu.circuit.gates;

public class Nand implements BinaryGate {

    private final And and = new And();
    private final Not not = new Not();

    @Override
    public boolean perform(boolean in1, boolean in2) {
        return not.perform(
                and.perform(in1, in2)
        );
    }
}
