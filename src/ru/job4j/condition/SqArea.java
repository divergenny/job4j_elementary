package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
        if (k < 0 || p < 0) {
            System.out.println("Error, p or k cannot be negative.");
        }
        double height = (double) p / (2 * (k + 1));
        double length = height * k;
        return length * height;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);

        double result2 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);

        double result3 = SqArea.square(10, 4);
        System.out.println(" p = 10, k = 4, s = 2, real = " + result3);

        double result4 = SqArea.square(18, 2);
        System.out.println(" p = 18, k = 2, s = 2, real = " + result4);

        double result5 = SqArea.square(23, 3);
        System.out.println(" p = 23, k = 3, s = 2, real = " + result5);

    }
}
