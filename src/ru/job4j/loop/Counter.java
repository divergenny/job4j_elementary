package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        if (start == finish) {
            return sum;
        }
        for (int value = start; value <= finish; value++) {
            sum = sum + value;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 80));
        System.out.println(sum(7, 40));
        System.out.println(sum(1, 1));
    }
}
