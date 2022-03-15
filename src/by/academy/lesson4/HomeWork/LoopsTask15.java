package by.academy.lesson4.HomeWork;

//15. Написать программу,
//        которая по заданным значениям чисел a и b находит a в степени b.
//        В запросе укажите допустимые значения этих переменных
//        ( Например если а - дробное, то b не может быть отрицательным).

import java.util.Scanner;

public class LoopsTask15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(b != 0 && a%1 == 0) {
            double x = Math.pow(a, b);
            System.out.println(x);
        }
        else {
            System.out.println("Fall");
        }
        sc.close();
    }
}
