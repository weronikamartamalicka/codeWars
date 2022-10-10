package com.exercise.training.treasure;

public class TreasureMain {

    public static void main(String[] args) {
        Treasure treasure = new Treasure();
        String result = treasure.getWayToTreasure(14, 14);

        System.out.println(result);
    }
}
