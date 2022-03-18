package by.academy.lesson4.HomeWork.Arrays;

import java.util.Arrays;

//Задача 9.
//Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел.
//Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива
//        с i-ым индексом к элементу из второго массива с i-ым индексом.
//Вывести все три массива на экран (каждый на отдельной строке),
//        затем вывести количество целых элементов в третьем массиве.
public class ArraysTask9 {
    public static void main(String[] args) {
        int firstArray[] = new int[10];
        int secondArray[] = new int[10];
        double thirdArray[] = new double[10];
        for (int i = 0; i < 10; i++){
            firstArray[i] = (int)(Math.random()*8+1);
            secondArray[i] = (int)(Math.random()*8+1);
            thirdArray[i] = (double) firstArray[i] / (double) secondArray[i];
        }
        System.out.print(Arrays.toString(firstArray) + "\n" + Arrays.toString(secondArray) + "\n"
        + Arrays.toString(thirdArray));
        int counterEntire = 0;
        for (double d : thirdArray){
            if ((int) d % 1 == 0){
                counterEntire++;
            }
        }
        System.out.println("\n"+ "counterEntire" + ": " + counterEntire);
    }
}
