package by.academy.HomeWork.Arrays;

import java.util.Arrays;

//Задача 7.
//        Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
//        Напоминаем, что первый и второй члены последовательности равны единицам,
//        а каждый следующий — сумме двух предыдущих.
public class ArraysTask7 {
    public static void main(String[] args) {
        int[] array = new int[20];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < 20; i++){
            array[i] = array[i-2] + array[i-1];
        }
        System.out.println(Arrays.toString(array));
    }
}
