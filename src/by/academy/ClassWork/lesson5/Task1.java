package by.academy.ClassWork.lesson5;

public class Task1 {
    public static void main(String[] args) {
        String s = "Для работы со строками в языке java необходимо используются классы String, StringBuilder, StringBuffer";
        int first = 0;
        while (first >= 0) {

            first = s.indexOf('S', first+1);
            System.out.println(first);
        }
    }
}