package ru.geekbrains.lesson1;

public class lesson1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nAplle");
    }

    public static void checkSumSign() {
        int a = 10, b = -17;
        a += b;
        System.out.println(a >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    public static void printColor() {
        int value = 236;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 10, b = 20;
        System.out.println(a >= b ? "a >= b" : "a < b");

    }
}
