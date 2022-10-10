package com.exercise.training.inheritance;

public class Lion extends Mammal {
    private int numberOfClaws;

    public Lion(String name, int numberOfLegs, int numberOfClaws) {
        super(name, numberOfLegs);
        this.numberOfClaws = numberOfClaws;
    }

    @Override
    public String communicate() {
        return "Rooooar";
    }

    @Override
    public void drink() {
        super.drink();
        System.out.println("I have to drink 4 l per day");
    }

    public void growl() {
        System.out.println("Grrrrr");
    }
}
