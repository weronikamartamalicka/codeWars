package com.exercise.training.cellphone.simple;

public class EncodingMain {

    public static void main(String[] args) {
        SonyEncodingMap sonyEncodingMap = new SonyEncodingMap();
        sonyEncodingMap.generateEncodingMap();

        String result = sonyEncodingMap.encodeWithRecursion("BABA");

        System.out.println(result);
    }
}
