package by.academy.lesson3Homework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 2;
        System.out.print(x);
        while (x < 1_000_000){
            x = x* 2;
            System.out.print(" " + x);
        }
    }
}
