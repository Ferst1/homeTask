package de.telran.lesson4HW28_09;//№ 2
//        Создайте методы с математическими операциями +, -, *, /
//        Каждый метод принимает два числа в параметрах и возвращает результат
//        Вызовите все методы в main
//        Результат распечатайте в консоль

public class MathOperations {
    public static double add(double a, double b) {
            return a + b;
    }

    // Метод для вычитания двух чисел
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Метод для умножения двух чисел
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Метод для деления двух чисел
    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Деление на ноль невозможно");
            return 0;
        }
    }

    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 5.0;
        double result = divide(num1, num2);
        // Вызов методов и печать результатов
        System.out.println("Сложение: " + add(num1, num2));
        System.out.println("Вычитание: " + subtract(num1, num2));
        System.out.println("Умножение: " + multiply(num1, num2));
        System.out.println(("Деление: " + result));

    }
}


