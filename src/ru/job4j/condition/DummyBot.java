package ru.job4j.condition;

import java.util.Locale;

public class DummyBot {
    public static String answer(String question) {
        question = question.toLowerCase(Locale.ROOT);
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("привет, бот".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("пока".equals(question)) {
            rsl = "До скорой встречи!";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет, Бот");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока");
        System.out.println(rsl);
    }
}
