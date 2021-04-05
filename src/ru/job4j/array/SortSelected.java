package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int iterator = 0; iterator < data.length; iterator++) {
            int min = MinDiapason.findMin(data, iterator, data.length - 1);
            int index = FindLoop.indexOf(data, min, iterator, data.length - 1);

            int temp = data[iterator];
            data[iterator] = data[index];
            data[index] = temp;
        }
        return data;
    }
}
