package by.academy.lesson4.HomeWork.Loops;

import java.util.Arrays;
import java.util.Scanner;

//2. Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания)
//        значений их длины.
public class LoopsTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        String s[] = new String[n];
        int index = 0;
        for (String str : s){
            s[index] = sc.next();
            index++;
        }
        index = s.length-1;
        int i = 0;
        Arrays.sort(s);
        for (String str : s){
            System.out.print(str + " ");
        }

        String sTwo[] = new String[n];
        for (String string : sTwo){
            sTwo[index] = s[i];
            i++;
            index--;
        }
        System.out.println();
        for (String str : sTwo){
            System.out.print(str + " ");
        }
        sc.close();
            }
}
