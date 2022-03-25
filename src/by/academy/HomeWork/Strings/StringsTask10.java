package by.academy.HomeWork.Strings;

//10. Используя оператор switch, написать программу, которая выводит на экран сообщения
//        о принадлежности некоторого значения k интервалам (-10k, 0], (0, 5], (5, 10], (10, 10k].
public class StringsTask10 {
    public static void main(String[] args) {
        int k = (int)(Math.random()*10);
        switch (k){
            case 1,2,3,4,5 -> System.out.println("k is between (0, 5]");
            case 6,7,8,9,10 -> System.out.println("k is between (0, 10]");
            case(Boolean.compare(( k < 1), true)) -> System.out.println("k is within (-10k, 0]");

            }
        }
    }

