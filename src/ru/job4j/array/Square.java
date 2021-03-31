package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] squaredNumbers = new int[bound];
        for (int index = 0; index < squaredNumbers.length; index++) {
            squaredNumbers[index] = index * index;
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
