package by.academy.lesson4.HomeWork;

import java.util.Scanner;

//19. Два двузначных числа, записанных одно за другим , образуют четырёхзначное число,
// которое делится на их произведение. Найти эти числа.
public class LoopsTask19 {
    public static void main(String[] args) {

        int ni = 0;
        for(int i = 1000; i < 10000; i++){
            StringBuilder stringBuilderOneFigure = new StringBuilder();
            StringBuilder stringBuilderSecondFigure = new StringBuilder();
           String strNumber = String.valueOf(i);
            char[] charStr = strNumber.toCharArray();
            stringBuilderOneFigure.append(charStr,0,2);
            if(Integer.parseInt(String.valueOf(charStr[2])) > 0) {
                stringBuilderSecondFigure.append(charStr, 2, 2);
            }
           else continue;
//        String firstNum = String.valueOf(charStr,0,2);
//        String secondNum = String.valueOf(charStr,2,2);
        int first = Integer.parseInt(stringBuilderOneFigure.toString());
        int second = Integer.parseInt(stringBuilderSecondFigure.toString());
            if(i%(first*second) == 0) {
                System.out.println(first + " * " + second + " = " + first*second + " " + "i = " + i );

           }
        }
    }
}
