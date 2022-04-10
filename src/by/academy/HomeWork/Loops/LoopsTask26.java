package by.academy.HomeWork.Loops;

//26. даны действительно х и натуральное n. вычислить: sin x + sin x в квадрате + ... sin x в степени n.

public class LoopsTask26 {
    public static void main(String[] args) {

        double x = 45;
        int n = 6;
        int counter = 1;
        double total = 0;

        while (counter <= n){
            total += Math.pow(Math.sin(x), counter);
            counter++;
        }
        System.out.println(total);
    }
}