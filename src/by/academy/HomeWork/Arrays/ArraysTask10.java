package by.academy.HomeWork.Arrays;

import java.util.Arrays;

//Задача 10.
//        Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
//        Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
//        Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
public class ArraysTask10 {
    public static void main(String[] args) {
        int [] array = new int[11];
        int counterPos = 0;
        int counterZero = 0;
        int counterNeg = 0;
        for (int i = 0; i < 11; i++){
            array[i] = (int)(Math.random()*4-2);
            System.out.print(array[i] + " ");
            switch (array[i]){
                case (1) : counterPos++;
                break;
                case (0) : counterZero++;
                break;
                case (-1) : counterNeg++;
                break;
            }
        }
        System.out.println();
        if (counterPos > counterZero && counterPos > counterNeg){
            System.out.println("1 ocures more" );
        }
        if (counterZero > counterPos && counterZero > counterNeg){
            System.out.println("0 ocures more" );
        }
        if (counterNeg > counterZero && counterNeg > counterPos){
            System.out.println("-1 ocures more" );
        }
    }
}
