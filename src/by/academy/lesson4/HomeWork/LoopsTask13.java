package by.academy.lesson4.HomeWork;

//13. Найти сумму чисел от 100 до 200 кратных 17.

public class LoopsTask13 {
    public static void main(String[] args) {
        int amount = 0;
        for (int i = 100; i < 200; i++){
            if(i%17 == 0){
                amount += i;
            }
        }
        System.out.println(amount);
    }
}
