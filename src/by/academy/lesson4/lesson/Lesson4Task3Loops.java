package by.academy.lesson4.lesson;

import java.util.Scanner;

public class Lesson4Task3Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        int y = sc.nextInt();
        for (int i = 1; i < y; i++){
            x = x*i;
        }
        System.out.println(x);
    }
}
