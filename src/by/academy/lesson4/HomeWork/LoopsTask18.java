package by.academy.lesson4.HomeWork;

//18. Задано натуральное число N.
//        Найти количество натуральных чисел,
//        не превосходящих N и не делящихся ни на одно из чисел 2,3,5.
public class LoopsTask18 {
    public static void main(String[] args) {
        int n  = 48;
        int counter = 0;
        for(int i = 0; i <= n; i++){
            if(i%2 != 0 && i%3 != 0 && i%5 != 0){
               counter++;
                System.out.print(i +" ");
            }
        }
        System.out.println(counter);
        System.out.println();

    }
}
