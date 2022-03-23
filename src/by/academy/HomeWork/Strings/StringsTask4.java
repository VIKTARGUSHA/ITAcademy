package by.academy.HomeWork.Strings;

import java.util.Arrays;
import java.util.Scanner;

//4. Ввести n слов с консоли. Найти слово, в котором число различных символов минимально.
//        Если таких слов несколько, найти первое из них.
public class StringsTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String array[] = new String[n];
        char[][] arChar = new char[n][15];
        int minDif = 100;
        int indexMin = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.next();
            char[] symbols = array[i].toCharArray();
            for (int j = 0; j < symbols.length; j++) {
                arChar[i][j] = symbols[j];

            }
            for (int k = 0; k < symbols.length - 1; k++) {
                for (int r = k + 1; r < symbols.length; r++) {
                    if (symbols[k] == arChar[i][r]) {
                        arChar[i][r] = '0';
                    }
                }
            }

            int counterDif = 0;
            for (int c = 0; c < 15; c++) {
                if (arChar[i][c] != '0' ) {
                    counterDif++;
                }
            }
            System.out.println(counterDif);
            if (counterDif < minDif) {
                minDif = counterDif;
                indexMin = i;
            }
        }
        System.out.println(array[indexMin]);
    }
}
