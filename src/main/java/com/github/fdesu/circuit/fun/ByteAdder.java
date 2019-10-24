package com.github.fdesu.circuit.fun;

public class ByteAdder {

    private final BinaryAdder adder = new BinaryAdder();

    public byte add(byte a, byte b) {
        BinaryAdder adder = this.adder;

        byte res = 0x0;
        boolean carry = false;

        //flatten the loop to get an estimate on amount of
        //binary-adders required for the real adder circuit
        for (byte i = 0; i < 8; i++) {
            //get mask to extract i-th signal
            byte bit = (byte)(1 << i);

            //parse the i-th signal
            boolean sig1 = (a & bit) == bit;
            boolean sig2 = (b & bit) == bit;

            adder.go(sig1, sig2, carry);

            //put the result signal to the i-th position of the result byte
            res |= (byte)((adder.bit() ? 1 : 0) << i);
            carry = adder.carry();
        }

        return res;
    }

}
