package com.exercise.training.inheritance;

public class Human {

    private final Mammal mammal;

    public Human(Mammal mammal) {
        this.mammal = mammal;
    }

    public void getHealthy() {
        mammal.drink();
        System.out.println("Eat many vegetables");
    }
}
