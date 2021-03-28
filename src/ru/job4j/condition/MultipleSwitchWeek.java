package ru.job4j.condition;

import java.util.Locale;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        name = name.toLowerCase(Locale.ROOT);
        return switch (name) {
            case "понедельник", "monday" -> 1;
            case "вторник", "tuesday" -> 2;
            case "среда", "wednesday" -> 3;
            case "четверг", "thursday" -> 4;
            case "пятница", "friday" -> 5;
            case "суббота", "saturday" -> 6;
            case "воскресенье", "sunday" -> 7;
            default -> -1;
        };
    }
}
