package by.academy.HomeWork.RegExp;

import java.util.regex.Pattern;

//        5. Дана строка:
//        " Hey      There!     How      Are you doing"   ;
//        оставить лишь 1 пробел между слов.
public class RegExpTask5 {
    public static void main(String[] args) {
String s = " Hey      There!     How      Are you doing";
        String ss = s.replaceAll("\\s+", " ").trim();
        System.out.println(ss);
    }
}
