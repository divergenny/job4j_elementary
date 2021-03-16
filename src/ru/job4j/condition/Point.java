package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        // d = sqrt( (x2-x1)^2 + (y2-y1)^2
        return Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) is equal to  " + result);

        result = Point.distance(3, 5, 5, 21);
        System.out.println("result (3, 5) to (5, 21) is equal to  " + result);

        result = Point.distance(16, 24, 9, 6);
        System.out.println("result (16, 24) to (9, 6) is equal to  " + result);

        result = Point.distance(44, 14, 8, 16);
        System.out.println("result (44, 14) to (8, 16) is equal to  " + result);

        result = Point.distance(4, 5, 4, 24);
        System.out.println("result (4, 5) to (4, 24) is equal to  " + result);
    }
}
