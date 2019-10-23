package com.github.fdesu.circuit.gates;

public class Gates {

    private Gates() {}

    public static Not not() {
        return new Not();
    }

    public static BinaryGate and() {
        return new And();
    }

    public static BinaryGate nand() {
        return new Nand();
    }

    public static BinaryGate or() {
        return new Or();
    }

    public static BinaryGate nor() {
        return new Nor();
    }

    public static BinaryGate xor() {
        return new Xor();
    }

    public static BinaryGate xnor() {
        return new Xnor();
    }

}
