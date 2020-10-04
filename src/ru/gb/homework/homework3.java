package ru.gb.homework;

import java.util.Random;
import java.util.Scanner;

public class homework3 {
    public static void main(String[] args){

      numberGame();
      wordGame();
    }

    static void numberGame(){
        int play = 1;

        while ( play != 0) {
            Random rand = new Random();
            int x = rand.nextInt(10);

            game(x);

            Scanner sc = new Scanner(System.in);
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            play = sc.nextInt();
        }
    }

    static void game(int random){
        int c = 0;
        while (c != 3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число: ");
            int a = sc.nextInt();
            if (random == a) {
                System.out.println("Вы угадали!");
                break;
            } else {
                bigOrSmall( random, a);
                c++;
            }
            if (c == 3) {
                System.out.println("Вы проиграли!");
            }
        }
    }

    static void bigOrSmall( int random, int number){
        if (random > number) {
            System.out.println("Это число меньше загаданного!");
        } else if (random < number) {
            System.out.println("Это число больше загаданного!");
        }
    }

    static void wordGame(){
        String[] words = {"apple", "orange", "lemon", "banana",
                "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        Random rand = new Random();
        int random_word = rand.nextInt(words.length);

        String word = "";
        char[] answer = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#',
                '#', '#', '#', '#', '#',};

        while ( words[random_word].equals(word) != true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите слово: ");
            word = scan.nextLine();

            compareChar(word, random_word, answer, words);
            System.out.println(answer);
        }
        System.out.println("Вы победили!");
    }

    static void compareChar( String word, int random_word, char answer[], String words[]){
        for (int i = 0; i < word.length(); i++) {
            if (words[random_word].charAt(i) == word.charAt(i)) {
                answer[i] = word.charAt(i);
            }
        }
    }

}
