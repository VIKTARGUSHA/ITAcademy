package by.academy.lesson4.HomeWork.Arrays;

import java.util.Arrays;
import java.util.Random;

//Задача 5.
//        Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
//        выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите,
//        для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
public class ArraysTask5 {
    public static void main(String[] args) {
        Random random = new Random();
int[] firstArray = new int[5];
int[] secondArray = new int[5];
double averageFirst = 0;
double averageSecond = 0;
double totalFirst = 0;
double totalSecond = 0;
for (int i = 0; i < 5; i++){
    firstArray[i] = random.nextInt(5);
    secondArray[i] = random.nextInt(5);
    totalFirst += firstArray[i];
    totalSecond += secondArray[i];
}
averageFirst = totalFirst/5;
averageSecond = totalSecond/5;
        System.out.println(Arrays.toString(firstArray) +"\n" + Arrays.toString(secondArray));
if (averageFirst > averageSecond){
    System.out.println("first array average is bigger");
}
else if (averageFirst == averageSecond){
    System.out.println("arrays are equal");
}
else {
    System.out.println("second array average is bigger");
}
    }
}
