package com.exercise.training.points;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class PointsMain {

    public static void main(String[] args) {
        List<Points> pointsList = new ArrayList<>();
        Random random = new Random();

        IntStream.rangeClosed(1, 10).forEach(number -> {
            int randomInt = random.nextInt(100);
            pointsList.add(new Points(number, randomInt));
        });

        Points mainPoint = new Points(12, 25);

        PointFinder finder = new PointFinder();
        System.out.println(finder.findNearestPoint(pointsList, mainPoint));

    }
}
