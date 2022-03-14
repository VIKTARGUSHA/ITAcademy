package by.academy.lesson4.HomeWork;

import java.util.Scanner;

//4. С клавиатуры вводятся n чисел.
//        Составьте программу, которая определяет кол-во отрицательных,
//        кол-во положительных и кол-во нулей среди введеных чисел.
//        Значение n вводится с клавиатуры.

public class ArrayTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counterNegative = 0;
        int counterZero = 0;
        int counterPositive = 0;
        for(int i = 0; i < n; i++){
            int figure = sc.nextInt();
        if(figure < 0) {
            counterNegative++;
        }
        else if(figure == 0){
            counterZero++;
        }
        else if(figure > 0){
            counterPositive++;
        }
        }
        System.out.println("Positive: " + counterPositive + "\n" + "Zero: " + counterZero
        + "\n" + "Negative: " + counterNegative);
    }
}
