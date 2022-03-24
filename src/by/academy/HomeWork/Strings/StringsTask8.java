package by.academy.HomeWork.Strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 8. Ввести n слов с консоли. Среди слов, состоящих только из цифр, найти слово-палиндром.
//        Если таких слов больше одного, найти второе из них.
public class StringsTask8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        int counterPolindrom = 0;
        int indexPolindrom = 0;
        int indexAr = 0;
        String sss = sc.nextLine();
        String s = sc.nextLine();
        String[] array = new String[n];
        Pattern pattern = Pattern.compile("\\b\\d+\\b");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            array[counter] = s.substring(matcher.start(), matcher.end());
            counter++;
        }
        System.out.println(Arrays.toString(array));
        String polindrom = null;
        for (String str : array){
            if( counterPolindrom == 1 && indexAr == array.length-1 && str == null){
                System.out.println(polindrom);
            }
            if(str ==null){
                indexAr ++;
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder(str);
            String rev =stringBuilder.reverse().toString();

            if (rev.equals(str)){
                counterPolindrom++;
                polindrom = str;
            }

            if(rev.equals(str) && counterPolindrom == 2){
                System.out.println(str);
                break;
            }
            if( counterPolindrom == 1 && indexAr == array.length-1){
                System.out.println(str);
            }

            indexAr ++;

        }

    }
}
