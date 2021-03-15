package ru.job4j.converter;

public class Converter {
    private static final int DOLLAR = 60; // 1 доллар = 60 рублей.
    private static final int EURO = 70; // 1 евро = 70 рублей.
    private static final double UZS = 142.96; // 1 рубль = 142.96 узбекских сум.

    public static double rubleToEuro(int value) {
        double result = (double) value / EURO; /* формула перевода рублей в евро. */
        return Math.round(result);
    }

    public static double rubleToDollar(int value) {
        double result = (double) value / DOLLAR; /* формула перевода рублей в доллары. */
        return Math.round(result);
    }

    public static double rubleToUzs(int value) {
        double result = (double) value * UZS; /* формула перевода рублей в узбекские суммы. */
        return Math.round(result);
    }

    public static double euroToRuble(int value) {
        double result = (double) value * EURO; /* формула перевода евро в рубли. */
        return Math.round(result);
    }

    public static double dollarToRuble(int value) {
        double result = (double) value * DOLLAR; /* формула перевода долларов в рубли. */
        return Math.round(result);
    }

    public static double uzsToRuble(int value) {
        double result = (double) value / UZS; /* формула перевода узбекских сум в рубли. */
        return Math.round(result);
    }

    public static void main(String[] args) {
        System.out.println("===== TEST Methods =====\n");

        int in = 140;
        double expected = 2.0;
        double out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2.000 euro. Test result : " + passed);

        in = 140;
        expected = 2.0;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are 2.333 dollars. Test result : " + passed);

        in = 140;
        expected = 20014.0;
        out = Converter.rubleToUzs(in);
        passed = expected == out;
        System.out.println("140 rubles are 20014.0 uzbek sums. Test result : " + passed);

        in = 140;
        expected = 9800.0;
        out = Converter.euroToRuble(in);
        passed = expected == out;
        System.out.println("140 euro are 9800.0 ruble. Test result : " + passed);

        in = 140;
        expected = 8400.0;
        out = Converter.dollarToRuble(in);
        passed = expected == out;
        System.out.println("140 dollar are 8400.0 ruble. Test result : " + passed);

        in = 140;
        expected = 1.0;
        out = Converter.uzsToRuble(in);
        passed = expected == out;
        System.out.println("140 uzbek sums are 1.0 ruble. Test result : " + passed);

        System.out.println("\n===== TEST Code End =====\n");

        double euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        double dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollars.");

        double uzs = Converter.rubleToUzs(140);
        System.out.println("140 rubles are " + uzs + " uzbek sums.");

        double euroToRuble = Converter.euroToRuble(140);
        System.out.println("140 euro are " + euroToRuble + " ruble.");

        double dollarToRuble = Converter.dollarToRuble(140);
        System.out.println("140 dollar are " +  dollarToRuble + " ruble.");

        double uzsToRuble = Converter.uzsToRuble(140);
        System.out.println("140 uzbek sums are " +  uzsToRuble + " ruble.");
    }
}
