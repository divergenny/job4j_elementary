package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int iterator = point; iterator < array.length; iterator++) {
                    if (array[iterator] != null) {
                        SwitchArray.swap(array, point, iterator);
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }
}
