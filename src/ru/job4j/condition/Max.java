package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        if (left == right) {
            return left;
        } else {
            return left > right ?  left :  right;
        }
    }

    public static void main(String[] args) {
        System.out.println(Max.max(3, 4));
        System.out.println(Max.max(24, 0));
        System.out.println(Max.max(8, 8));
    }
}
