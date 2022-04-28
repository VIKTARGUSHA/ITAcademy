package by.academy.HomeWork.Collections.Task9;

import by.academy.HomeWork.Collections.Task5.HeavyBox;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

//Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
//  Избавиться от повторяющихся элементов в строке и вывести результат на экран.
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String [] s1 = s.split(", ");
        System.out.println(Arrays.toString(s1));
        HashSet<String> hashSet = new HashSet(Arrays.asList(s1));
        System.out.println(hashSet.toString());
    }
}
