package by.academy.lesson4.HomeWork.Arrays;

import java.util.Arrays;

//Задача 6.
//        Создайте массив из 4 случайных целых чисел из отрезка [10;99],
//        выведите его на экран в строку. Определить и вывести на экран сообщение о том, 
//        является ли массив строго возрастающей последовательностью.
public class ArraysTask6 {
    public static void main(String[] args) {
        int [] array = new int [4];
        for (int i = 0; i < 4; i++){
            array[i] = (int)(10 + (Math.random()*89));
        }
        System.out.println(Arrays.toString(array));
        int marker = 0;
      for (int j = 1; j < 4; j++){
          if (array[j] <= array[j-1]){
              marker++;
              break;
          }
      }
      if (marker != 1){
          System.out.println("array grows");
      }
      else System.out.println("array doesn't grow");
    }
}
