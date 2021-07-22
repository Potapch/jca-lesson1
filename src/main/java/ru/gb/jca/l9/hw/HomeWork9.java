package ru.gb.jca.l9.hw;

public class HomeWork9 {
/*
    1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
    При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
    Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
     должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
    3. В методе main() вызвать полученный метод,
    обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.
    Integer.parseInt();
*/

    public static void main(String[] args) {

        String[][] arr = new String[][]{
                {"1", "2", "3", "2"},
                {"10", "9", "8", "7"},
                {"0", "5", "15", "25"},
                {"1000", "100", "10", "l"},
        };


        int sum = 0;
        for (int y = 0; y < arr.length; y++) {
            if (arr[y].length != 4) throw new MyArraySizeException("Wrong size");
            for (int x = 0; x < arr[y].length; x++) {
                try {
                    sum += Integer.parseInt(arr[y][x]);
                    System.out.println("Sum = " + sum);
                } catch (Exception e) {
                    System.out.printf("Invalid value in [%d][%d]\n", x + 1, y + 1);
                    throw new MyArrayDataException("Invalid value");
                }
            }
        }
    }
}


