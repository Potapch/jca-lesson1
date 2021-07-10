package ru.gb.jca.l3.hw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    /*Написать игру в угадай слово:
    Создать массив из слов (из этих или других)
    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
     "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
      "pumpkin", "potato"}.
            При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и
             сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы,
              которые стоят на своих местах.
    apple – загаданное
    apricot - ответ игрока
    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    Для сравнения двух слов посимвольно можно пользоваться:
    String str = "apple";
    char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
    Играем до тех пор, пока игрок не отгадает слово.
    Используем только маленькие буквы. */

    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
                "pumpkin", "potato"};

        String wordAI = words[random.nextInt(words.length)];
        System.out.println("Test: " + wordAI);
        String guess;
        char[] symb = new char[15];
        Arrays.fill(symb, '#');
        System.out.println(Arrays.toString(words));

        do {
            System.out.print("Guess the word: ");
            guess = scan.next();
            for (int i = 0; i < 15; i++)
                if (i < wordAI.length() && i < guess.length() &&
                        wordAI.charAt(i) == guess.charAt(i))
                    System.out.print(wordAI.charAt(i));
                else
                    System.out.print((wordAI.equals(guess)) ? "" : "#");
            System.out.println();
        } while (!wordAI.equals(guess));
        System.out.println("You won!!!");
    }
}

