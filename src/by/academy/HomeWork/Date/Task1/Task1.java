package by.academy.HomeWork.Date.Task1;

import java.time.LocalDate;

public class Task1 {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(1987, 2, 27);
        LocalDate localDateNow = LocalDate.now();
        System.out.println(localDate.getDayOfWeek() + " " + localDate.getDayOfMonth() + " " + localDate.getDayOfYear() + " " +
                localDate.getMonth() + " " + localDate.getYear());
         boolean b = localDate.isBefore(localDateNow);
        System.out.println(b);
         b = localDate.isAfter(localDateNow);
        System.out.println(b);
    }
}