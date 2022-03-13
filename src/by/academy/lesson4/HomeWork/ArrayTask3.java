package by.academy.lesson4.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

//3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше)
//        средней, а также длину.
public class ArrayTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String[] array = new String[n];
        double totalStringLenth = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.next();
            totalStringLenth += array[i].length();
        }
            double averageLenth = totalStringLenth/n;
        for (String s : array){
            if (s.length() < averageLenth){
                System.out.println(s + " " + s.length());
            }
        }
            sc.close();
        }
    }

