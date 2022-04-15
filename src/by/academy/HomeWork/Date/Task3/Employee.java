package by.academy.HomeWork.Date.Task3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Employee {
    public static void main(String[] args) {

//        LocalDateTime date = LocalDateTime.of(2014, 4, 21, 15, 56, 45);
//        System.out.println(date.toString());
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d-EEEE-d");
//        String s = date.format(dateTimeFormatter);
//        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
//        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
//        DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
//        String s1 = date.format(dateTimeFormatter1);
//        String s2 = date.format(dateTimeFormatter2);
//        String s3 = date.format(dateTimeFormatter3);
//        String s4 = date.format(dateTimeFormatter4);
//        System.out.println(s + "\n" + s1 + "\n" + s2 + " " + "\n" + s3 + "\n" + s4);
        DateTimeFormatter dateTimeFormatter5 = DateTimeFormatter.ofPattern("d");
        DateTimeFormatter dateTimeFormatter6 = DateTimeFormatter.ofPattern("dd");
    //    DateTimeFormatter dateTimeFormatter7 = DateTimeFormatter.ofPattern("ddd");
    //   DateTimeFormatter dateTimeFormatter8 = DateTimeFormatter.ofPattern("dddd");
       DateTimeFormatter dateTimeFormatter9 = DateTimeFormatter.ofPattern("dd-y");
        DateTimeFormatter dateTimeFormatter10 = DateTimeFormatter.ofPattern("dd-yy");
       DateTimeFormatter dateTimeFormatter11 = DateTimeFormatter.ofPattern("dd-yyy");
        DateTimeFormatter dateTimeFormatter12 = DateTimeFormatter.ofPattern("dd-yyyy");
        DateTimeFormatter dateTimeFormatter13 = DateTimeFormatter.ofPattern("dd-yyyy-E");
        DateTimeFormatter dateTimeFormatter14 = DateTimeFormatter.ofPattern("dd-yyyy-EE");
        DateTimeFormatter dateTimeFormatter15 = DateTimeFormatter.ofPattern("dd-yyyy-EEE");
        DateTimeFormatter dateTimeFormatter16 = DateTimeFormatter.ofPattern("dd-yyyy-EEEE");
        DateTimeFormatter dateTimeFormatter17 = DateTimeFormatter.ofPattern("dd-yyyy-EEEE-u");
        DateTimeFormatter dateTimeFormatter18 = DateTimeFormatter.ofPattern("dd-yyyy-EEEE-uu");
        DateTimeFormatter dateTimeFormatter19 = DateTimeFormatter.ofPattern("dd-yyyy-EEEE-uuu");
        DateTimeFormatter dateTimeFormatter20 = DateTimeFormatter.ofPattern("dd-yyyy-EEEE-uuuu");
        DateTimeFormatter dateTimeFormatter21 = DateTimeFormatter.ofPattern("dd-yyyy-EEEE-uuuu-M");
        DateTimeFormatter dateTimeFormatter22 = DateTimeFormatter.ofPattern("dd-yyyy-EEEE-uuuu-MM");
        DateTimeFormatter dateTimeFormatter23 = DateTimeFormatter.ofPattern("dd-yyyy-EEEE-uuuu-MMM");
        DateTimeFormatter dateTimeFormatter24 = DateTimeFormatter.ofPattern("dd-yyyy-EEEE-uuuu-MMMM");
        DateTimeFormatter dateTimeFormatter25 = DateTimeFormatter.ofPattern("dd-yyyy-EEEE-uuuu-MMMM-L");
        DateTimeFormatter dateTimeFormatter26 = DateTimeFormatter.ofPattern("dd-yyyy-EEEE-uuuu-MMMM-LL");
        DateTimeFormatter dateTimeFormatter27 = DateTimeFormatter.ofPattern("dd-yyyy-EEEE-uuuu-MMMM-LLL");
        DateTimeFormatter dateTimeFormatter28 = DateTimeFormatter.ofPattern("dd-yyyy-EEEE-uuuu-MMMM-LLLL");
        LocalDateTime localDateTime = LocalDateTime.now();
        String s5 = localDateTime.format(dateTimeFormatter5);
        String s6 = localDateTime.format(dateTimeFormatter6);
   //     String s7 = localDateTime.format(dateTimeFormatter7);
    //   String s8 = localDateTime.format(dateTimeFormatter8);
        String s9 = localDateTime.format(dateTimeFormatter9);
        String s10 = localDateTime.format(dateTimeFormatter10);
        String s11 = localDateTime.format(dateTimeFormatter11);
        String s12 = localDateTime.format(dateTimeFormatter12);
        String s13 = localDateTime.format(dateTimeFormatter13);
        String s14 = localDateTime.format(dateTimeFormatter14);
        String s15 = localDateTime.format(dateTimeFormatter15);
        String s16 = localDateTime.format(dateTimeFormatter16);
        String s17 = localDateTime.format(dateTimeFormatter17);
        String s18 = localDateTime.format(dateTimeFormatter18);
        String s19 = localDateTime.format(dateTimeFormatter19);
        String s20 = localDateTime.format(dateTimeFormatter20);
        String s21 = localDateTime.format(dateTimeFormatter21);
        String s22 = localDateTime.format(dateTimeFormatter22);
        String s23 = localDateTime.format(dateTimeFormatter23);
        String s24 = localDateTime.format(dateTimeFormatter24);
        String s25 = localDateTime.format(dateTimeFormatter25);
        String s26 = localDateTime.format(dateTimeFormatter26);
        String s27 = localDateTime.format(dateTimeFormatter27);
        String s28 = localDateTime.format(dateTimeFormatter28);
        System.out.println(s5 + "\n" + s6 + "\n" + s9 + "\n" + s10 + "\n" + s11 + "\n" + s12 + "\n" + s13
                + "\n" +s14 + "\n" + s15 + "\n" + s16 + "\n" + s17 + "\n" + s18 + "\n" + s19 + "\n" + s20
        + "\n" + s21 + "\n" + s22 + "\n" + s23 + "\n" + s24 + "\n" + s25 + "\n" + s26 + "\n" + s27 + "\n"
        + s28);
    }
}