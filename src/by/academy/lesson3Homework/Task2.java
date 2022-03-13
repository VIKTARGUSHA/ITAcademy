package by.academy.lesson3Homework;

import java.io.BufferedReader;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Тип данных: ");
        String type = sc.next();
        switch (type) {
            case ("int"):
                System.out.println(sc.nextInt() % 2);
                break;
            case ("double"):
                System.out.println(sc.nextDouble() * 0.7);
                break;
            case ("float") :
                System.out.println(Math.pow(sc.nextFloat(), 2.0));
                break;
            case ("char") :
                System.out.println((int)sc.next().charAt(0));
                break;
            case ("String") :
                System.out.println("Hello" + " " + sc.next());
                break;
            default:
                System.out.println("Unsupported type");
                break;
        }
        sc.close();
    }
}
