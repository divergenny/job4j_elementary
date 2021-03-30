package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        if (start == finish) {
            return sum;
        }
        for (int value = start; value <=     finish; value++) {
            sum = sum + value;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        if (start == finish) {
            return sum;
        }
        for (int value = start; value <= finish; value++) {
            if (value % 2 == 0) {
                sum = sum + value;
            }
        }
        return sum;
    }
}
