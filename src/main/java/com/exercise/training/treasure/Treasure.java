package com.exercise.training.treasure;

import java.util.ArrayList;
import java.util.List;

public class Treasure {

    private char[][] generateBoard(int m, int n) {
        char[][] treasureBoard = new char[m][n];
        treasureBoard[0][0] = 'g';
        treasureBoard[10][11] = 'y';
        treasureBoard[6][8] = 'b';
        treasureBoard[7][8] = 'b';
        treasureBoard[7][7] = 'b';
        treasureBoard[8][7] = 'b';
        treasureBoard[8][6] = 'b';
        treasureBoard[8][5] = 'b';
        treasureBoard[9][5] = 'b';

        return treasureBoard;
    }

    public String getWayToTreasure(int m, int n) {
        String resultString = "";
        List<Point> start = new ArrayList<>();
        List<Point> treasure = new ArrayList<>();
        List<Point> rocks = new ArrayList<>();
        char[][] treasureBoard = generateBoard(m, n);

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++) {

                char tile = treasureBoard[i][j];
                if(tile == 'g') {
                    start.add(new Point(i, j));
                }
                if(tile == 'y') {
                    treasure.add(new Point(i, j));
                }
                if(tile == 'b') {
                    rocks.add(new Point(i, j));
                }
            }
        }

        int treasureX = treasure.get(0).getX();
        int treasureY = treasure.get(0).getY();
        int startX = start.get(0).getX();
        int startY = start.get(0).getY();
        int lambdaX = treasureX - startX;
        int lambdaY = treasureY - startY;

        for(Point point : rocks) {
            int pointX = point.getX();
            int pointY = point.getY();

            if(pointX != startX && pointY != treasureY) {
                resultString = "Your way up or down: " + lambdaY +
                        "Your war right or left : " + lambdaX;
            } else if(pointX != treasureX && pointY != startY) {
                resultString = "Your war right or left : " + lambdaX +
                        "Your way up or down: " + lambdaY;
            } else {

            }
        }

        return resultString;
    }
}
