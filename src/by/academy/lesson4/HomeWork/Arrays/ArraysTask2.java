package by.academy.lesson4.HomeWork.Arrays;

import java.util.ArrayList;

//Задача 2.
//        Создайте массив из всех нечётных чисел от 1 до 99,
//        выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
public class ArraysTask2 {
    public static void main(String[] args) {
        int [] array = new int[50];
        int num = 1;
        System.out.print(num + " ");
        for ( int i = 1; i < 50; i ++){
            num +=2;
            array[i] = num;
            System.out.print(array[i] + " ");
        }
        int[] reverseNum = new int[50];
        reverseNum[49] = 1;
        System.out.println();
        array[0] = 1;
        for (int j = 0; j < 50; j++){
            reverseNum[j] = array[49-j];

            System.out.print(reverseNum[j] + " ");
        }
    }
}
