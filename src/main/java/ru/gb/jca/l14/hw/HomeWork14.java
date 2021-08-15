package ru.gb.jca.l14.hw;

import java.util.Arrays;

public class HomeWork14 {
    public static void main(String[] args){
        System.out.println(Arrays.toString(metArFour(new int[] { 10, 20, 30, 4, 50, 60 , 70 , 80, 90, 100})));
        System.out.println(metFindFour(new int[] {1,1,4,4,4,1,1,1,4,1}));
    }

    public static int[] metArFour(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) return Arrays.copyOfRange(arr, i + 1, arr.length);
        }
        throw new RuntimeException("4 not found");
    }
        public static boolean metFindFour(int[] arr) {
            if (arr == null)
                return false;

            boolean find1 = false, find4 = false;
            for (int i=0; i < arr.length; i++) {
                if (arr[i] == 1) find1 = true;
                else if (arr[i] == 4) find4 = true;
                else return false;
            }

            return (find1 & find4);
    }
}

