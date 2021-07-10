package ru.gb.jca.l1.hw;

public class HomeWork {

    public static void main(String[] args) {
        System.out.println(calcFirst(2, 2, 2, 2));
        System.out.println(task10and20(5, 8));
        isPositiveOrNegative(-30);
        System.out.println(isNegative(-10));
        greetings("Mike");
    }


    /* Задание 1
    Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
     где a, b, c, d – аргументы этого метода, имеющие тип float.
     */
    public static float calcFirst(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    /* Задание 2
    Написать метод, принимающий на вход два целых числа и проверяющий,
     что их сумма лежит в пределах от 10 до 20 (включительно),
      если да – вернуть true, в противном случае – false.
     */
    public static boolean task10and20(int x1, int x2) {
        int sum = x1 + x2;
        return sum >=10 && sum <=20;
        }


    /* Задание 3
    Написать метод, которому в качестве параметра передается целое число,
     метод должен напечатать в консоль, положительное ли число передали или отрицательное.
      Замечание: ноль считаем положительным числом.
     */
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    /* Задание 4
    Написать метод, которому в качестве параметра передается целое число.
     Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     */
    public static boolean isNegative(int y) {
        return y < 0;
    }


    /* Задание 5
    Написать метод, которому в качестве параметра передается строка, обозначающая имя.
     Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
     */
    public static void greetings(String name) {
        System.out.println("Привет," + name + "!");
    }
}







