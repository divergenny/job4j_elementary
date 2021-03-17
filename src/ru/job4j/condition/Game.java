package ru.job4j.condition;

import java.util.Locale;

public class Game {
    public static void menu(String name) {
        boolean checkUseGame = false;
        if (name.toLowerCase(Locale.ROOT).equals("super mario")) {
            System.out.println("Start - super mario");
            checkUseGame = true;
        }
        if (name.toLowerCase(Locale.ROOT).equals("tanks")) {
            System.out.println("Start - tanks");
            checkUseGame = true;
        }
        if (name.toLowerCase(Locale.ROOT).equals("tetris")) {
            System.out.println("Start - tetris");
            checkUseGame = true;
        }
        if (!checkUseGame) {
            System.out.println("There is no such Game, try Again.");
            System.out.println("List of available games: \n1) Tanks \n2) Super Mario \n3) Tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("Tanks");
    }
}
