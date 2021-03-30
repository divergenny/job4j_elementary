package ru.job4j.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        for (int variable = 0; variable <= finish; variable++) {
            if (CheckPrimeNumber.check(variable)) {
                count++;
            }
        }
        return count;
    }
}
