package com.exercise.training.inheritance;

import java.util.Random;

public interface Animal {
    int NUMBER_OF_HEADS = 1;

    void drink();
    default void breathe() {
        System.out.println("Breathe in oxygen");
        System.out.println("Breathe out carbon");
    }
    String communicate();
    void move();

    static boolean isAlive() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
