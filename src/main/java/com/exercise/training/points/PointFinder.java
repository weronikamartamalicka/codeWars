package com.exercise.training.points;

import java.util.List;

public class PointFinder {

    public Points findNearestPoint(final List<Points> points, Points mainPoint) {
        int resultX = 0;
        int resultY = 0;
        int mainX = mainPoint.getX();
        int mainY = mainPoint.getY();
        int minimumX = points.get(0).getX();
        int minimumY = points.get(0).getY();

        Double minimum = Math.pow(Math.abs(minimumX - mainX), 2) + Math.pow(Math.abs(minimumY - mainY), 2);

        for(Points point : points) {
            int x = point.getX();
            int y = point.getY();

            Double square = Math.pow(Math.abs(x - mainX), 2) + Math.pow(Math.abs(y - mainY), 2);

            if(square.compareTo(minimum) < 0) {
                minimum = square;
                resultX = x;
                resultY = y;
            }
        }
        return new Points(resultX, resultY);
    }
}
