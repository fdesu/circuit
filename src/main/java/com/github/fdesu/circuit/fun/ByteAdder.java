package com.github.fdesu.circuit.fun;

public class ByteAdder {

    private final BinaryAdder adder = new BinaryAdder();

    public byte add(byte a, byte b) {
        BinaryAdder adder = this.adder;

        byte res = 0x0;
        boolean carry = false;
        for (byte i = 0; i < 8; i++) {
            byte bit = (byte)(1 << i);

            adder.go(
                    (a & bit) == bit,
                    (b & bit) == bit,
                    carry
            );

            res |= (byte)((adder.bit() ? 1 : 0) << i);
            carry = adder.carry();
        }

        return res;
    }

}
