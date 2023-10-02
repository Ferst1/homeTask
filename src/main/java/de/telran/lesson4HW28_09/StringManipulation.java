package de.telran.lesson4HW28_09;

//1 уровень сложности: № 1
    //         Создайте строку через new - I study Basic Java!
//         Распечатать пред-последний символ строки. Используем метод String.charAt().
//         Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains()
//    Вырезать строку Java c помощью метода String.substring().
//         Заменить все символы “а” на “о”.
//         Преобразуйте строку к верхнему регистру.
//         Преобразуйте строку к нижнему регистру.
    public class StringManipulation {
        public static void main(String[] args) {
            String myString = "I study Basic Java!";

            // Предпоследний символ строки
            char preLastChar = myString.charAt(myString.length() - 2);
            System.out.println("Пред-последний символ строки: " + preLastChar);
            // Проверка на наличие подстроки "Java"
            boolean containsJava = myString.contains("Java");
            System.out.println("Содержит ли строка подстроку 'Java': " + containsJava);

            // Вырезать подстроку "Java"
            String substring = myString.substring(1, 14);
            System.out.println("Строка после удаления 'Java':" + substring);

            // Заменить все символы 'a' на 'o'

            String replacedString = myString.replace('a', 'o');
            System.out.println("Строка после замены 'a' на 'o': " + replacedString);

            // Преобразование строки к верхнему регистру
            String upperCaseString = myString.toUpperCase();
            System.out.println("Строка в верхнем регистру: " + upperCaseString);

            // Преобразование строки к нижнему регистру
            String lowerCaseString = myString.toLowerCase();
            System.out.println("Строка в нижнем регистру: " + lowerCaseString);
        }
    }


