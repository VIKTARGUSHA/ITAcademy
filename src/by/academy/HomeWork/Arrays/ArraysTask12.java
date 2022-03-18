package by.academy.HomeWork.Arrays;

import java.util.Arrays;

//Задача 12.
//        Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом,
//        чтобы отрицательных и положительных элементов там было поровну и не было нулей.
//        При этом порядок следования элементов должен быть случаен (т. е. не подходит вариант,
//        когда в массиве постоянно выпадает сначала 6 положительных, а потом 6 отрицательных чисел
//        или же когда элементы постоянно чередуются через один и пр.). Вывести полученный массив на экран.
public class ArraysTask12 {
    public static void main(String[] args) {
        int[] array = new int[12];
         int marker = 1;

         while (marker != 0){
             marker = 0;
             int counterNegative = 0;
             int counterPositive = 0;
         for (int i = 0; i < 12; i++) {
             array[i] = (int) (Math.random() * 21 - 11);
             if (array[i] == 0 ){
                 marker++;
             }
             if (array[i] > 0) {
                 counterPositive++;
             }
                 if(array[i] < 0){
                     counterNegative++;
                 }
                 if (counterPositive > 6){
                     marker++;
                 }
                 if(counterNegative > 6){
                     marker++;
                 }
         }
         }
        System.out.println(Arrays.toString(array));
    }
}
