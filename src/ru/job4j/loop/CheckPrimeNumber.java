package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        number = Math.abs(number);
        boolean prime = true;
        if (number == 1) {
            return false;
        }
        for (int index = 2; index < number; index++) {
            if (number % index == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
