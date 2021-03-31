package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = data[0];
        for (boolean values : data) {
            if (result != values) {
                return false;
            }
        }
        return true;
    }
}
