package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftItr = 0;
        int rightItr = 0;

        for (int index = 0; index < rsl.length; index++) {
            if (leftItr < left.length && rightItr < right.length) {
                if (left[leftItr] < right[rightItr]) {
                   rsl[index] = left[leftItr];
                   leftItr++;
                } else {
                    rsl[index] =  right[rightItr];
                    rightItr++;
                }
            } else if (leftItr < left.length) {
                rsl[index] = left[leftItr];
                leftItr++;
            } else if (rightItr < right.length) {
                rsl[index] = right[rightItr];
                rightItr++;
            }
        }
        return rsl;
    }
}
