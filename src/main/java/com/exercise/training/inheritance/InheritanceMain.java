package com.exercise.training.inheritance;

public class InheritanceMain {

    public static void main(String[] args) {
        Mammal myMammal = new Lion("Tyberian lion", 4, 20);
        Animal myAnimal = new Lion("Syberian lion", 4, 20);
        Lion myLion = new Lion("Lion king!", 4, 20);
        Monkey myMonkey = new Monkey("gorilla", 4);
        Human myHuman = new Human(myMonkey);

        System.out.println(myAnimal.communicate());
        System.out.println(myMammal.communicate());
        System.out.println(myLion.communicate());

        myLion.drink();
        myLion.breathe();

        System.out.println(Animal.isAlive());

        myHuman.getHealthy();
    }

    public static void makeSthWithAnimal(Animal animal) {
        animal.drink();
    }
}
