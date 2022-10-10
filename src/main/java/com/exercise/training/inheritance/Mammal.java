package com.exercise.training.inheritance;

public abstract class Mammal implements Animal {
    protected String name;
    protected int numberOfLegs;

    public Mammal(String name, int numberOfLegs) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void drink() {
        System.out.println("Drink water");
    }

    @Override
    public void move() {
        System.out.println("Move forward and backward");
    }

    @Override
    public String communicate() {
        return "I am an animal";
    }
}
