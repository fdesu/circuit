package com.github.fdesu.circuit.gates;

@FunctionalInterface
public interface BinaryGate {

    boolean perform(boolean in1, boolean in2);

}
