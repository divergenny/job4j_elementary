package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double triangleSemiperimeter = (a + b + c) / 2;
        double area = Math.sqrt(
                triangleSemiperimeter * (triangleSemiperimeter - a) * (triangleSemiperimeter - b) * (triangleSemiperimeter - c)
        );
        return area;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.printf("area (2, 2, 2) = %.2f ", rsl);
    }
}
