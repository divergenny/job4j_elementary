package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ". You are " + age + " years old.");
    }

    public static void hello(int age) {
        System.out.println("You are " + age + " years old.");
    }

    public static void hello(String name, String name2, String name3) {
        System.out.println("Hello, " + name + ", " + name2 + ", "  + name3 + ".");
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.hello(name);
        ArgMethod.hello(name, age);
        ArgMethod.hello(age);
        ArgMethod.hello(name, name, name);
    }
}
