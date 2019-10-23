package com.github.fdesu.circuit.gates;

public class Or implements BinaryGate {
    @Override
    public boolean perform(boolean in1, boolean in2) {
        return in1 || in2;
    }
}
