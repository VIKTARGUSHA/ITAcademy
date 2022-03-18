package by.academy.HomeWork.Arrays;

//Задача 1. Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
//        отделяя один элемент от другого пробелом, а затем в столбик
//        (отделяя один элемент от другого началом новой строки).
//        Перед созданием массива подумайте, какого он будет размера.
//        2 4 6 … 18 20
//        2
//        4
//        6
//        …
//        20
public class ArraysTask1 {
    public static void main(String[] args) {
        int ar[] = new int[10];
        int x = 0;
        for (int i : ar){
            x = x + 2;
            System.out.print(x + " ");
        }
        x = 0;
        System.out.println();
        for (int i : ar){
            x = x + 2;
            System.out.println(x + " ");
        }
    }
}
