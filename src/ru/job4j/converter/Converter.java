package ru.job4j.converter;

public class Converter {
    private static final double DOLLAR = 60; // 1 доллар = 60 рублей.
    private static final double EURO = 70; // 1 евро = 70 рублей.
    private static final double UZS = 142.96; // 1 рубль = 142.96 узбекских сум.

    public static double rubleToEuro(int value) {
        return value / EURO; /* формула перевода рублей в евро. */
    }

    public static double rubleToDollar(int value) {
        return value / DOLLAR; /* формула перевода рублей в доллары. */
    }

    public static double rubleToUzs(int value) {
        return value * UZS; /* формула перевода рублей в узбекские суммы. */
    }

    public static double euroToRuble(int value) {
        return value * EURO; /* формула перевода евро в рубли. */
    }

    public static double dollarToRuble(int value) {
        return value * DOLLAR; /* формула перевода долларов в рубли. */
    }

    public static double uzsToRuble(int value) {
        return value / UZS; /* формула перевода узбекских сум в рубли. */
    }

    public static void main(String[] args) {
        System.out.println("===== TEST Methods =====\n");

        int in = 140;
        double expected = 2.0;
        double out = Converter.rubleToEuro(in);
        out = Math.round(out * 100.0) / 100.0;
        boolean passed = expected == out;
        System.out.println("140 rubles are 2.00 euro. Test result : " + passed);

        in = 140;
        expected = 2.33;
        out = Converter.rubleToDollar(in);
        out = Math.round(out * 100.0) / 100.0;
        passed = expected == out;
        System.out.println("140 rubles are 2.33 dollars. Test result : " + passed);

        in = 140;
        expected = 20014.4;
        out = Converter.rubleToUzs(in);
        out = Math.round(out * 100.0) / 100.0;
        passed = expected == out;
        System.out.println("140 rubles are 20014.4 uzbek sums. Test result : " + passed);

        in = 140;
        expected = 9800.0;
        out = Converter.euroToRuble(in);
        out = Math.round(out * 100.0) / 100.0;
        passed = expected == out;
        System.out.println("140 euro are 9800.0 ruble. Test result : " + passed);

        in = 140;
        expected = 8400.0;
        out = Converter.dollarToRuble(in);
        out = Math.round(out * 100.0) / 100.0;
        passed = expected == out;
        System.out.println("140 dollar are 8400.0 ruble. Test result : " + passed);

        in = 140;
        expected = 0.98;
        out = Converter.uzsToRuble(in);
        out = Math.round(out * 100.0) / 100.0;
        passed = expected == out;
        System.out.println("140 uzbek sums are 0.98 ruble. Test result : " + passed);

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
