package by.academy.ClassWork.lesson3Classwork;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = 1;
        System.out.println();
        while (y < 10){
            System.out.print(x * y + " ");
            y++;
        }
    }
}
