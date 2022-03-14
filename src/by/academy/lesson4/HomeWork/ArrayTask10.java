package by.academy.lesson4.HomeWork;

//  10. Даны натуральные числа от 1 до 50. Найти сумму тех из них, которые делятся на 5 или на 7.
public class ArrayTask10 {
    public static void main(String[] args) {
        int summ = 0;
      for (int i = 1; i < 50; i++){
          if(i%5 == 0 || i%7 == 0){
              summ = summ + i;
          }
      }
        System.out.println(summ);
    }
}
