package by.academy.ClassWork.lesson3Classwork;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сумма покупки:");
        double amount = sc.nextInt();
        System.out.println("Возраст:");
        int age = sc.nextInt();
        if(amount < 100){
            amount = (amount*95)/100;
            System.out.println("1");
        }
        else if(amount < 200){
            amount = (amount*93)/100;
            System.out.println("2");
        }
        else if(amount < 300){
            if (age > 18) {
                amount = (amount * (88 - 4)) / 100;
                System.out.println("3");
            }
            else {
                amount = amount * (88 + 3) / 100;
                System.out.println("33");
            }
        }
        else if (amount < 400){
            amount = (amount*85)/100;
            System.out.println("4");
        }
        else if(amount >= 400){
            amount = (amount * 80)/100;
            System.out.println("5");
        }
        System.out.println("Сумма со скидкой" + ": " + amount);
    }
}
