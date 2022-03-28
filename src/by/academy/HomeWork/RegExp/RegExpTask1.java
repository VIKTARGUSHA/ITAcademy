package by.academy.HomeWork.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//1. Найти в строке:- не только; запятые, но и другие знаки препинания. Подсчитать
//        общее их количество
public class RegExpTask1 {
    public static void main(String[] args) {
String s = "Найти - в строке не: только запятые, но и другие знаки,, препинания. Подсчитать;";
int counter = 0;
        Pattern pattern = Pattern.compile(",|:|;|\\.|-");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
                counter++;
        }
        System.out.println(counter);
    }
}
