package by.academy.HomeWork.Arrays;

//Задача 15.
//        Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
//        Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента
//        этого массива (его индекс не имеет значения).
public class ArraysTask15 {
    public static void main(String[] args) {
        int [][] array = new int[5][8];
        int max = 0;
        for (int i = 0; i < 5; i++){
            System.out.println();
            for (int j = 0; j < 8; j++){
                array[i][j] = (int) (Math.random()*198-99);
                System.out.print(array[i][j] + " ");
                if(array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        System.out.println("\n" +max + " is a max value");
    }
}
