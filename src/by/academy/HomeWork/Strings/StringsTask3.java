package by.academy.HomeWork.Strings;

import java.util.Scanner;

//3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше)
//        средней, а также длину.
public class StringsTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array = new String[n];
        int totalLength = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.next();
            totalLength += array[i].length();
        }
        double averageLength = (double) totalLength / n;
        for (String s : array) {
            if (s.length() < averageLength) {
                System.out.println(s + " " + s.length());
            }
        }
        sc.close();
    }
}