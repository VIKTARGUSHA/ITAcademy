package by.academy.HomeWork.Loops;

//20. даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных числа:
//        первое число получили путем написания сначала числа А, затем В.
//        Для получения второго числа сначала записали число В, затем А. Найти числа А и В если известно ,
//        что первое четырехзначное число нацело делится на 99, а второе на 49.

public class LoopsTask20 {
    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            String number = String.valueOf(i);
            char[] charAr = number.toCharArray();
            String firstNum = String.valueOf(charAr, 0, 2);
            String secondNum = String.valueOf(charAr, 2, 2);
            if (Integer.parseInt(String.valueOf(charAr[2])) == 0) {
                continue;
            }
            char charArTurnOver[] = new char[4];
            charArTurnOver[0] = charAr[2];
            charArTurnOver[1] = charAr[3];
            charArTurnOver[2] = charAr[0];
            charArTurnOver[3] = charAr[1];

            String numberTurnOver = String.valueOf(charArTurnOver, 0, 4);

            int firstFigure = Integer.parseInt(firstNum);
            int secondFigure = Integer.parseInt(secondNum);
            int firstNumTurnOver = Integer.parseInt(String.valueOf(charAr, 0, 2));
            int secondNumTurnOver = Integer.parseInt(String.valueOf(charAr, 2, 2));
            int secondNumberTurnOverFoLenth = Integer.parseInt(numberTurnOver);
if(i%99 == 0 && secondNumberTurnOverFoLenth%49 == 0){
    System.out.println( firstNum + " "  + secondNum + " " + i + " / " + 99 + " = " + i/99 + " " +
            numberTurnOver + " / " + 49 + " = " + secondNumberTurnOverFoLenth/49);
}
        }
    }
}