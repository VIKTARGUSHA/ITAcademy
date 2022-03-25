package by.academy.HomeWork.Strings;

import java.util.Scanner;

//6. Ввести n слов с консоли. Найти слово, символы в котором идут в строгом порядке
//        возрастания их кодов. Если таких слов несколько, найти первое из них.
//
//
//
//        10. Используя оператор switch, написать программу, которая выводит на экран сообщения
//        о принадлежности некоторого значения k интервалам (-10k, 0], (0, 5], (5, 10], (10, 10k].
//        11. Используя оператор switch, написать программу, которая выводит на экран сообщения
//        о принадлежности некоторого значения k интервалам (-10k, 5], [0, 10], [5, 15], [10, 10k].
//        12. Написать программу, которая выводит числа от 1 до 25 в виде матрицы 5x5 слева направо и сверху вниз.
public class StringsTask6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++){
            String word = sc.next();
            char[] arChar = word.toCharArray();
            for (int j = 1; j < arChar.length; j++){
                if((int) arChar[j] <= (int) arChar[j-1]){
                    break;
                }
                else if(j == arChar.length-1) {
                    System.out.println(word);
                    return;
                }
                }
            }
        System.out.println();
        }
    }

