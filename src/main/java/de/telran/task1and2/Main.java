package de.telran.task1and2;

public class Main {
    public static void main(String[] args) {

        int number = 345;
        int digit1 = number / 100;
        int digit2 = (number % 100) / 10;
        int digit3 = number % 10;


        System.out.println("Число " + number + " -> " + digit1 + ", " + digit2 + ", " + digit3);
    }
    }

//    Домашнее задание №2

//2. * Дано трехзначное число. Вывести на экран все цифры этого числа
//        Пример: 345
//        Вывод в консоль: Число 345 -> 3, 4, 5
