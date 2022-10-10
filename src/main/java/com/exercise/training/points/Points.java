package com.exercise.training.points;

public final class Points {

    private final int x;
    private final int y;

    public Points(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Points{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
