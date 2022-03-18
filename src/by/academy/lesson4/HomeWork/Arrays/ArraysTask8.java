package by.academy.lesson4.HomeWork.Arrays;

import java.util.Arrays;

//Задача 8.
//        Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
//        Определите какой элемент является в этом массиве максимальным
//        и сообщите индекс его последнего вхождения в массив.
public class ArraysTask8 {
    public static void main(String[] args) {
int [] array = new int[12];
int max = 0;
int index = 0;
    for (int i = 0; i < 12; i++){
        array[i] =(int)(Math.random()*30 - 15);
        if(i == 0){
            max = array[i];
        }
        if (array[i] > max){
            max = array[i];
            index = i;
        }
    }
        System.out.println(Arrays.toString(array ) + "\n" + "index = " + index);
    }
}
