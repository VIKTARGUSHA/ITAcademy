package by.academy.HomeWork.Strings;

import java.util.Scanner;
import java.util.TreeSet;

//7. Ввести n слов с консоли. Найти слово, состоящее только из различных символов.
//        Если таких слов несколько, найти первое из них.
public class StringsTask7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array = new String[n];
        for (int i = 0; i < n; i++){
            String word = sc.next();
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
