package by.academy.HomeWork.Arrays;

//Задача 16.
//        Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
//        Вывести массив на экран. Определить и вывести на экран индекс строки
//        с наибольшим по модулю произведением элементов.
//        Если таких строк несколько, то вывести индекс первой встретившейся из них.
public class ArraysTask16 {
    public static void main(String[] args) {
        var array = new int[7][4];
        int generalMultiply = 0;
        var indexMax = 0;
        for (int i = 0; i < 7; i++){

            int maxMultiply = 1;
            for (int j = 0; j < 4; j++){
                array[i][j] = (int)(Math.random()*12-6);
                System.out.print(array[i][j] + " ");
                maxMultiply *= array[i][j];
            }

            if (Math.abs(maxMultiply) > generalMultiply){
                generalMultiply = Math.abs(maxMultiply);
                indexMax = i;
            }
            System.out.println();
        }
        System.out.println(indexMax);
    }
}
