package com.exercise.interview.link4;

import java.util.List;

public class StringExampleMain {
    // zmieniając każdy znak na reprezentację liczbową,
    // oblicz podstawowe statystyki: min, max, count, avg dla całego zestawu liczb


// Dodatkowe wymagania:
// 1. przed obliczeniem statystyk przekowertuj znaki na lowerCase
// 2. Prefix np. Line1: nie powinien brać udziału w statystykach (każdy prefix kończy się ':')
// 3. spacja nie powinna brać udziału w statystykach


    public static void main(String[] args) {
        StringExample stringExample = new StringExample();


        List<String> example = List.of(
                "Line1: In this proud land we grew up strong",
                "Line2: We were wanted all along",
                "Line3: I was taught to fight, taught to win",
                "Line4: I never thought I could fail"
        );

        stringExample.replaceString(example);
    }
}
