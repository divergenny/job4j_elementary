package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        for (boolean values : data) {
            if (data[0] != values) {
                return false;
            }
        }
        return true;
    }
}
