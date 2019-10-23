package com.github.fdesu.circuit.gates;

public class And implements BinaryGate {

    public boolean perform(boolean in1, boolean in2) {
        return in1 && in2;
    }

}
