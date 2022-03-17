package by.academy.lesson4.HomeWork.Loops;

//23.Вычислить : 1+2+4+8+...+ 2 в 10 степени.
public class LoopsTask23 {
    public static void main(String[] args) {
        int amount = 1;
        for (int i = 1; i <= 10; i++){
            amount += Math.pow(2,i);
            System.out.println(amount);
        }
        System.out.println(amount);
    }
}
