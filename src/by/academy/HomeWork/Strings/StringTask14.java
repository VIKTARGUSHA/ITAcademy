package by.academy.HomeWork.Strings;

import java.util.Scanner;

//14. Ввести число от 1 до 12. Вывести на консоль название месяца,
//        соответ-ствующего данному числу. (Осуществить проверку корректности ввода чисел).
public class StringTask14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        System.out.println(month);
        if (month >= 1 && month <= 12){
            switch (month){
                case 1 :
                    System.out.println("Junury");
                    break;
                case 2 :
                    System.out.println("Febrary");
                    break;
                case 3 :
                    System.out.println("March");
                    break;
                case 4 :
                    System.out.println("April");
                    break;
                case 5 :
                    System.out.println("May");
                    break;
                case 6 :
                    System.out.println("June");
                    break;
                case 7 :
                    System.out.println("Jule");
                    break;
                case 8 :
                    System.out.println("August");
                    break;
                case 9 :
                    System.out.println("September");
                    break;
                case 10 :
                    System.out.println("October");
                    break;
                case 11 :
                    System.out.println("November");
                    break;
                case 12 :
                    System.out.println("December");
                    break;
            }
        }else System.out.println("Error" );
    }
}
