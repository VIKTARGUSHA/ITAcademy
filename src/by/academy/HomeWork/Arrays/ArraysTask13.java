package by.academy.HomeWork.Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Задача 13
//        Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.
//        Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
//        Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
//        Создать второй массив только из чётных элементов первого массива,
//        если они там есть, и вывести его на экран.
public class ArraysTask13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int marker = 0;
        while (marker == 0) {
            if (n <= 3) {
                System.out.println("You entered an incorrect number");
                n = sc.nextInt();
            } else marker++;
        }
        int[] array = new int[n];
        int[] arrayIndex = new int[n];
        int indexCounter = 0;
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * (n + 1));
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0) {
                arrayIndex[indexCounter] = array[i];
                indexCounter++;
            }
        }
        System.out.println();
        if (indexCounter != 0) {
            for (int in : arrayIndex) {
                if (in != 0) {
                    System.out.print(in + " ");
                }
            }
        }
    }
}