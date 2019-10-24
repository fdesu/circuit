package com.github.fdesu.circuit.fun;

// assembled using 32 full-binary-adders
public class IntegerAdder {

    private final BinaryAdder adder = new BinaryAdder();

    public int add(int a, int b) {
        BinaryAdder adder = this.adder;

        int res = 0x0;
        boolean carry = false;

        for (int i = 0; i < 32; i++) {
            //get mask to extract i-th signal
            int bit = 1 << i;

            adder.go(
                    (a & bit) == bit,
                    (b & bit) == bit,
                    carry
            );

            res |= (adder.bit() ? 1 : 0) << i;
            carry = adder.carry();
        }

        return res;
    }

}
