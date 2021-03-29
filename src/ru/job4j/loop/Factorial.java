package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int index = n; index >= 1; index--) {
            result = index * result;
        }
        return result;
    }
}
