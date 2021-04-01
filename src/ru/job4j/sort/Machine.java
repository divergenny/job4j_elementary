package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];

        money = money - price;
        int resultIterator = 0;

        for (int index = 0; index < coins.length; index++) {
            while (money >= coins[index]) {
                money = money - coins[index];
                rsl[resultIterator] = coins[index];
                resultIterator++;
            }
        }

        int size = resultIterator;
        return Arrays.copyOf(rsl, size);
    }
}
