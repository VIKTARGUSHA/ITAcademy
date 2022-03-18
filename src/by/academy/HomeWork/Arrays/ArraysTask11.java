package by.academy.HomeWork.Arrays;

import java.util.Scanner;

//Задача 11.
//        Пользователь должен указать с клавиатуры чётное положительное число,
//        а программа должна создать массив указанного размера из случайных целых чисел из [-5;5] и вывести его на экран в строку.
//        После этого программа должна определить и сообщить пользователю о том, сумма модулей какой половины массива больше:
//        левой или правой, либо сообщить, что эти суммы модулей равны.
//        Если пользователь введёт неподходящее число, то программа должна требовать повторного ввода до тех пор,
//        пока не будет указано корректное значение.
public class ArraysTask11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int marker = 0;
        while (marker == 0) {
            if (n <= 1 || n % 2 != 0) {
                System.out.println("You enter wrong figure");
                n = sc.nextInt();
            } else marker++;
        }
        sc.close();
        int [] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = (int)(Math.random()*12-6);
            System.out.print(array[i] + " ");
        }
        int leftHalf = 0;
        int rightHalf = 0;
        for (int j = 0; j < array.length/2; j ++){
            leftHalf += Math.abs(array[j]);
        }
        for (int k = array.length/2; k < array.length; k++){
            rightHalf += Math.abs(array[k]);
        }
        System.out.println();
        if (leftHalf > rightHalf){
            System.out.println("leftHalf is bigger");
        }
        else if(rightHalf > leftHalf){
            System.out.println("rightHalf is bigger");
        }
        else System.out.println("right and left halfs are equal");
    }
}