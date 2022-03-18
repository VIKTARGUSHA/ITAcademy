package by.academy.HomeWork.Loops;

import java.util.Scanner;

//14. Составьте программу, которая вычисляет сумму квадратов чисел от 1 до введенного вами целого числа N.
public class LoopsTask14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double squireSum = 0;
        int n = sc.nextInt();
        for (int i = 1; i < n; i++){
            squireSum = squireSum + Math.pow(i,2);
        }
        System.out.println(squireSum);
    }
}
