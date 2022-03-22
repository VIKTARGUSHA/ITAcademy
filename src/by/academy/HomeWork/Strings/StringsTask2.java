package by.academy.HomeWork.Strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//2. Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания)
//        значений их длины.
public class StringsTask2 {
    public static void main(String[] args) {
        Comparator <String> comparator  = new Comparator <String>() {
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.next().replaceAll("\\." , "");
        }
        Arrays.sort(array, comparator);
        for (String s : array){
            System.out.print(s + " ");
        }
    }
}
