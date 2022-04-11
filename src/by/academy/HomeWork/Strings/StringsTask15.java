package by.academy.HomeWork.Strings;

import java.util.Scanner;

//15. Условие здачи: ввести 2 слова, состоящие из четного числа букв.
// Получить слово состоящее из первой половины первого слова и второй половины второго слова.
public class StringsTask15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        String firstHalf = first.substring(0, first.length()/2);
        String secondHalf = second.substring(second.length()/2, second.length());
        String totalString = firstHalf + secondHalf;
        System.out.println(totalString);
    }
}
