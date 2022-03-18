package by.academy.ClassWork;

import java.util.Scanner;

//Ввести n строк с кансоли. Найти самую длинную и самую короткую строки.
public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int min = 48;
        int max = 0;
        String maxString = null;
        String minString = null;
        for (int i = 0; i < 10; i++){
            String st = sc.next();

            if(st.length() > max){
                maxString = st;
                max = st.length();
            }
            if (st.length() < min){
                minString = st;
                min = st.length();
            }
        }
        System.out.println(maxString + " " + maxString.length() + "; " +  minString + " " + minString.length());
    }
}
