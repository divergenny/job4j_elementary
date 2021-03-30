package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] squaredNumbers = new int[bound];
        for (int var = 0; var < squaredNumbers.length; var++) {
            squaredNumbers[var] = var * var;
        }
        return squaredNumbers;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int values : array) {
            System.out.println(values);
        }
    }
}
