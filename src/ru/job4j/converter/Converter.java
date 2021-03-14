package ru.job4j.converter;

public class Converter {
    private static final int DOLLAR = 60; // 1 доллар = 60 рублей.
    private static final int EURO = 70; // 1 евро = 70 рублей.
    private static final double UZS = 142.96; // 1 рубль = 142.96 узбекских сум.



    public static double rubleToEuro(int value) {
        double result = (double)value / EURO; /* формула перевода рублей в евро. */
        return result;
    }

    public static double rubleToDollar(int value) {
        double result = (double)value / DOLLAR; /* формула перевода рублей в доллары. */
        return result;
    }

    public static double rubleToUzs(int value) {
        double result = (double)value * UZS; /* формула перевода рублей в узбекские суммы. */
        return result;
    }

    public static double euroToRuble(int value) {
        double result = (double)value * EURO; /* формула перевода евро в рубли. */
        return result;
    }

    public static double dollarToRuble(int value) {
        double result = (double)value * DOLLAR; /* формула перевода долларов в рубли. */
        return result;
    }

    public static double uzsToRuble(int value) {
        double result = (double)value / UZS; /* формула перевода узбекских сум в рубли. */
        return result;
    }

    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(140);
        System.out.printf("140 rubles are " + "%.3f" + " euro.", euro);

        double dollar = Converter.rubleToDollar(140);
        System.out.printf("\n140 rubles are " + "%.3f" + " dollars.", dollar);

        double uzs = Converter.rubleToUzs(140);
        System.out.printf("\n140 rubles are " + "%.3f" + " uzbek sums.", uzs);

        double euroToRuble = Converter.euroToRuble(140);
        System.out.printf("\n140 euro are " + "%.3f" + " ruble.", euroToRuble);

        double dollarToRuble = Converter.dollarToRuble(140);
        System.out.printf("\n140 dollar are " + "%.3f" + " ruble.", dollarToRuble);

        double uzsToRuble = Converter.uzsToRuble(140);
        System.out.printf("\n140 uzbek sums are " + "%.3f" + " ruble.", uzsToRuble);
    }
}
