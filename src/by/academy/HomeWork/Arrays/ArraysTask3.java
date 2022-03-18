package by.academy.HomeWork.Arrays;

import java.util.Random;

//Задача 3.
//        Создайте массив из 15 случайных целых чисел из отрезка [0;9].
//        Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов
//        и выведете это количество на экран на отдельной строке.
public class ArraysTask3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(9);
            System.out.print(array[i] + " ");
        }
        int countHonest = 0;
        for (int j : array) {
            if (j%2 == 0) {
                countHonest++;
            }
        }
        System.out.println("\n" + countHonest);
    }
}
