package by.academy.HomeWork.Strings;

import java.util.Arrays;
import java.util.TreeSet;

// 9. Написать программы решения задач 1–8, осуществляя ввод строк как аргументов командной строки.
public class StringsTask9 {
    public static void main(String[] args) {
//Для примера возьмём задачу 7
        //7. Ввести n слов с консоли. Найти слово, состоящее только из различных символов.
//        Если таких слов несколько, найти первое из них.
        System.out.println(Arrays.toString(args));
      //  Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);
        String[] array = new String[n];
        for (int i = 0; i < n; i++){

            String word = args[i+1];
            char[] charAr = word.toCharArray();
            TreeSet<Character> treeSet = new TreeSet<>();
            for (int j = 0; j < charAr.length; j++){
                treeSet.add(charAr[j]);
            }
            if (treeSet.size() == charAr.length){
                System.out.println(word);
                return;
            }
        }
    }
}

