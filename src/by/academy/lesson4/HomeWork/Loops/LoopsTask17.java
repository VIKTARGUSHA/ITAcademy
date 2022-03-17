package by.academy.lesson4.HomeWork.Loops;

//17. В ЭВМ вводятся по очереди данные о росте N учащихся класса. Определить средний рост учащихся класса.

import java.util.Scanner;

public class LoopsTask17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        double totalGrowth = 0;
        for (int i = 0; i < n; i++){
            totalGrowth += sc.nextDouble();
        }
        System.out.println(totalGrowth/n);
    }
}
