package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int heightL = 0; heightL < height; heightL++) {
            for (int widthL = 0; widthL < width; widthL++) {
                if ((heightL + widthL) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
        System.out.println();
        paint(10, 4);
    }
}
