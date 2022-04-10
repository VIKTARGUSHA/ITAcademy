package by.academy.HomeWork.Arrays;

import java.util.Arrays;

//Задача 17.
//Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9]. Вывести массив на экран.
//Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её наибольший элемент.
//При этом изменять состав массива нельзя, а можно только переставлять элементы в рамках одной строки.
//Порядок остальных элементов строки не важен (т.е. можно соврешить только одну перестановку,
// а можно отсортировать по убыванию каждую строку).
//Вывести преобразованный массив на экран.
public class ArraysTask17 {

    public static void main(String[] args) {
        int[][] array = new int[6][7];
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 7; j++){
                array[i][j] = (int)(Math.random()*10);
            }
        }
        System.out.println( Arrays.deepToString(array));
        System.out.println();
        for (int i = 0; i < 6; i++){
            int[] arrayNegative = new int[7];
            for (int j = 0; j < 7; j++){
               arrayNegative[j] = array[i][j] * -1;
            }
            Arrays.sort(arrayNegative);
            for (int j = 0; j < 7; j++){
                array[i][j] = arrayNegative[j]*-1;
            }
        }
        System.out.println(Arrays.deepToString(array));
    }
}
