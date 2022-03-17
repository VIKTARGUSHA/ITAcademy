package by.academy.lesson4.HomeWork.Loops;

import java.util.Scanner;

//7. Ввести с клавиатуры 10 пар чисел. сравнить числа в каждой паре и напечатать большие из них.
public class LoopsTask7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x > y){
                System.out.print(x + " ");
            }
            else System.out.print(y + " ");
        }
    }
}
