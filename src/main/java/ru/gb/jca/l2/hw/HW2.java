package ru.gb.jca.l2.hw;

import java.util.Arrays;

public class HW2 {
/*
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(arr);
        System.out.println(Arrays.toString(arr));

    //    System.out.println(Arrays.toString(arr1));

        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        changeArray(w);
        System.out.println(Arrays.toString(w));

     //   fillDiagonal(int [4][4] );
        System.out.println(findMaxMin(1, 435, 55, 203, 9, 77));
    }



// 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;

      public static void invertArray(int[] arr){
           for (int i = 0; i < arr.length; i++) {
               if (arr[i] == 0) arr[i] = 1;
                else arr[i] = 0;
            }
        }


// 2.  Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
       public static void fillArray () {
            int[] arr1 = new int[8];
            arr1[0] = 0;
            for (int i = 1; i < arr1.length; i++) {
                arr1[i] = arr1[i - 1] + 3;
            }
            return arr1;
    }

// 3.  Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
        public static void changeArray(int[] w){
                for (int i = 0; i < w.length; i++) {
                if (w[i] < 6) w[i] = w[i] * 2;
            }
        }

// 4.  Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        public static void fillDiagonal () {
            int[][] arr2 = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    arr2[i][j] = 1;
                    arr2[i][(arr2.length - 1) - j] = 1;
                }
            }
            System.out.print(fillDiagonal();
        }

// 5.  Задать одномерный массив и найти в нем минимальный и максимальный элементы
        public static void findMaxMin ( int[] arr3){
            int compMax = arr3[0];
            int compMin = arr3[arr3.length - 1];
            for (int i = 1; i < arr3.length; i++) {
                if (compMax > arr3[i] || compMin < arr3[i]) compMax = arr3[i];
                compMin = arr3[i];
            }
        }
          }

// 6.  Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
// если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
// граница показана символами ||, эти символы в массив не входят


// 7.  Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
// при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами.
// Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
// При каком n в какую сторону сдвиг можете выбирать сами.

*/

}
