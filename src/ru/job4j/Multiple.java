package ru.job4j;

public class Multiple {
    public static void main(String[] args) {
        for(int iterator = 0; iterator < 10; iterator++) {
            int answerOfMultiple;
            answerOfMultiple = 1 * iterator;
            System.out.println("1 * " + iterator + " = " + answerOfMultiple);
        }
    }
}
