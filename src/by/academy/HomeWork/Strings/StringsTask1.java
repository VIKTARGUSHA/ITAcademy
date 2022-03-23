package by.academy.HomeWork.Strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//1. Ввести n строк с консоли, найти самую короткую и самую длинную строки.
//        Вывести найденные строки и их длину.
public class StringsTask1 {

    public static void main(String[] args) {
        Comparator<String> comparator = (o1,o2) ->o1.length()-o2.length();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] s = new String [n];
        for (int i = 0; i < n; i++){
            s[i] = sc.next();
        }

        Arrays.sort(s,comparator);
        System.out.println(Arrays.toString(s));
        System.out.println("The shortest: " + s[0] + " " + s[0].length() + "\n"
                + "The longest: " + s[s.length-1] + " " + s[s.length-1].length());
        sc.close();
    }
}
