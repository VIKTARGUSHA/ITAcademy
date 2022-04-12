package by.academy.HomeWork.Date.Task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class SheduleOfHolidays {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy-MM-dd");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM-w-D-d-EEEE-y");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE-dd-MMMM-yy");
        DateTimeFormatter formatter4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate = LocalDate.of(2022, 1, 7);
        LocalDate localDate3 = LocalDate.of(2022,5,1);
LocalDate localDate2 = LocalDate.of(2022,3,8);
LocalDate localDate4 = LocalDate.of(2022, 6, 3);
LocalDate localDate5 = LocalDate.of(2022, 11,7);
        String christmas = localDate.format(formatter);
        String thisDay = localDate1.format(formatter1);
        String eightMarch = localDate2.format(formatter2);
        String firstMay = localDate3.format(formatter1);
        String thirdJune = localDate4.format(formatter3);
        String seventhNovember = localDate5.format(formatter4);
        System.out.println("Christmas: " + christmas + "\n" + "eightMarch" + eightMarch +"\n"
                + "firstMay: " + firstMay + "\n" + "ThirdJune: " + thirdJune + "\n"
                + "SeventhNovember" + seventhNovember);
    }
}