package by.academy.lesson4.HomeWork.Arrays;

import java.util.Random;

//Задача 4.
// Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку.
// Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
public class ArraysTask4 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] ar = new int[8];
        for (int i = 0; i < 8; i++){
            ar[i] = random.nextInt(1,10);
            System.out.print(ar[i] + " ");
        }
        for (int j = 1; j < 8; j +=2){
            ar[j] = 0;
        }
        System.out.println();
        for (int k = 0; k < 8; k++) {
            System.out.print(ar[k] + " ");
        }
    }
}
