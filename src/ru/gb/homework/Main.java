package ru.gb.homework;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static char[][] map;
    static final int SIZE = 5;
    static final int DOTS_TO_WIN = 4;

    static final char DOT_EMPTY = '.';
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static  char DOT_HUMAN;
    static  char DOT_AI;

    public static void main(String[] args)
    {
        initMap();
        printMap();
        choseDot();

        while (true)
        {
            makeHumanTurn();
            printMap();

            if (hasWin(DOT_HUMAN))
            {
                System.out.println("Победил человек!");
                break;
            }

            if (isMapFull())
            {
                System.out.println("Ничья");
                break;
            }

            makeAiTurn();
            printMap();

            if (hasWin(DOT_AI))
            {
                System.out.println("Победил Т-1000");
                break;
            }

            if (isMapFull())
            {
                System.out.println("Ничья");
                break;
            }
        }
    }

    static void initMap()
    {
        map = new char[SIZE][SIZE];

        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[i].length; j++)
            {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    static void printMap()
    {
        for (int i = 0; i <= map.length; i++)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < map.length; i++)
        {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++)
            {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    static void choseDot(){
        System.out.println("Выберете фишку Х или 0");
        Scanner scanner = new Scanner(System.in);
        char dot = scanner.next().charAt(0);
        if ( dot == DOT_X){
            DOT_HUMAN = DOT_X;
            DOT_AI = DOT_O;
        } else {
            DOT_HUMAN = DOT_O;
            DOT_AI = DOT_X;
        }
    }

    static void makeHumanTurn()
    {
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;

        do
        {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));

        map[y][x] = DOT_HUMAN;
    }

    static void makeAiTurn()
    {
        Random random = new Random();

        int x;
        int y;

        do
        {
            System.out.println("Введите координаты в формате X Y");
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));

        System.out.println("Компьютер сходил в точку: " + (x + 1) + " " + (y + 1));

        map[y][x] = DOT_AI;

    }

    static boolean isCellValid(int x, int y)
    {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE)
        {
            return false;
        }
        else if (map[y][x] == DOT_EMPTY)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static boolean hasWin(char symb)
    {
        // проверка по строкам
        for ( int i = 0; i < map.length; i++){
            int count_raw = 0;
            for ( int j = 0; j < map.length; j++){
                if (map[i][j] == symb){
                    count_raw++;
                }
                if (count_raw == DOTS_TO_WIN){
                    return true;
                }
            }
        }

        // проверка по столбцам
        for ( int j = 0; j < map.length; j++){
            int count_column = 0;
            for ( int i = 0; i < map.length; i++){
                if (map[i][j] == symb){
                    count_column++;
                }
                if (count_column == DOTS_TO_WIN){
                    return true;
                }
            }
        }

        // Проверка по диагоналям #1
        int count_d1 = 0;
        for ( int i = 0; i < map.length; i++) {
            if (map[i][i] == symb) {
                count_d1++;
            }
            if (count_d1 == DOTS_TO_WIN) {
                return true;
            }
        }

        // Проверка по диагоналям #2
        int count_d2 = 0;
        for ( int i = 0; i < map.length; i++) {
            if (map[i][map.length - 1 - i] == symb) {
                count_d2++;
            }
            if (count_d2 == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    static boolean isMapFull()
    {
        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[i].length; j++)
            {
                if (map[i][j] == DOT_EMPTY)
                {
                    return false;
                }
            }
        }

        return true;
    }
}
