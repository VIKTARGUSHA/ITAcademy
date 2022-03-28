package by.academy.HomeWork.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//6. Написать regexp для email.
public class RegExpTask6 {
    public static void main(String[] args) {
        String s = "victorgusha1@gmail.com";
        Pattern pattern = Pattern.compile("[a-z]+\\d*.*mail\\.(com|ru|by|su)");
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher.find());
    }
}
