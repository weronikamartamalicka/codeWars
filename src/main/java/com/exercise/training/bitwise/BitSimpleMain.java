package com.exercise.training.bitwise;

public class BitSimpleMain {

    public static void main(String args[]) {
        BitSimple bitSimple = new BitSimple();
        int reversedInt = bitSimple.reverse(3125);

        System.out.println(Integer.toBinaryString(reversedInt));
    }
}
