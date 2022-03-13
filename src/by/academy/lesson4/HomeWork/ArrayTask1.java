package by.academy.lesson4.HomeWork;

import java.util.Arrays;
import java.util.Scanner;
//1. Ввести n строк с консоли, найти самую короткую и самую длинную строки.
//        Вывести найденные строки и их длину.
public class ArrayTask1 {
    public static void main(String[] args) {
        int n = 5;
        Scanner sc = new Scanner(System.in);
        String [] ar = new String[n];
        int i = 0;
        for (String st : ar){
            ar[i] = sc.next();
            i++;
        }
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        System.out.println("The shortest:" + ar[0] + " " + ar[0].length() + "\n" +  "The longest:"
                + " " + ar[ar.length-1] + " " + ar[ar.length-1].length());
        sc.close();
    }
}
