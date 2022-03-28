package by.academy.HomeWork.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//3. Имеется строка с текстом. Вывести текст, составленный из последних букв.
//        всех слов
public class RegExpTask3 {
    public static void main(String[] args) {
        String s  = "Имеется строка с текстом. Вывести текст, составленный из последних букв  ";
        Pattern pattern = Pattern.compile("\\b[а-яА-Я]+\\b");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            String str = matcher.group();
            System.out.print( str.charAt(str.length()-1)+ " ");
        }
    }
}
