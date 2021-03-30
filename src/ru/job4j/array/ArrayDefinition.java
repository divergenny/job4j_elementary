package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Jamshid";
        names[1] = "Bakhrom";
        names[2] = "Kudrat";
        names[3] = "Petr";

        for (int var = 0; var < 4; var++) {
            System.out.println(names[var]);
        }

        System.out.println("Size of array ages: " + ages.length);
        System.out.println("Size of array surnames: " + surnames.length);
        System.out.println("Size of array prices: " + prices.length);
    }
}
