package com.exercise.training.bitwise;

public class BitSimple {

    public int reverse(int a) {
        int bitLength = Integer.toBinaryString(a).length();
        int result = 0;
        int mask = 1;
        System.out.println(Integer.toBinaryString(a));
        //System.out.println(Integer.toBinaryString(mask));
        for (int i = 1; i < bitLength; ++i) {

            int bit = (a >> i) & 1;

            int reverseBit = bit << (bitLength - 1 - i);

            result = result | reverseBit;

            System.out.println("bit: " + Integer.toBinaryString(bit));
            System.out.println("reverseBit: " + Integer.toBinaryString(reverseBit));
            //System.out.println("~a: " + Integer.toBinaryString(~a));
            //System.out.println("a: " + Integer.toBinaryString(a));
            //System.out.println("mask: " + Integer.toBinaryString(mask));
            System.out.println("result: " + Integer.toBinaryString(result));
            //System.out.println("a & mask: " + Integer.toBinaryString(a & mask));
        }
        return a & mask;
    }
}
