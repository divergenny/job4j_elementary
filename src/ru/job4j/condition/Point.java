package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        // d = sqrt( (x2-x1)^2 + (y2-y1)^2
        int firstOperation = x2 - x1; // 1. Вычесть аргументы x2 и x1.
        int secondOperation = y2 - y1; // 2. Вычесть аргументы y2 и y1.
        double thirdOperation = Math.pow(firstOperation,2); // 3. Возвести в степень 2 результат операции 1.
        double fourthOperation = Math.pow(secondOperation,2); // 4. Возвести в степень 2 результат операции 2.
        double fifthOperation = thirdOperation + fourthOperation; // 5. Сложить результаты операций 3 и 4.
        double sixthOperation = Math.sqrt(fifthOperation); // 6. Вычислить корень квадратный из результата операции 5.
        return sixthOperation;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) is equal to  " + result);

        result = Point.distance(3, 5, 5, 21);
        System.out.println("result (3, 5) to (5, 21) is equal to  " + result);

        result = Point.distance(16, 24, 9, 6);
        System.out.println("result (16, 24) to (9, 6) is equal to  " + result);
    }
}
