package by.academy.HomeWork.Collections.Task2;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class TimeCounter {
    public static <T extends List> void timeForList(T t){
        int counter = 0;
        while (counter < 1000000){
            t.add("Hello World");
            counter++;
        }
        System.out.println("List is fiiled");
    }
    public static  <T extends ArrayList &  LinkedList> void timeForChoose(T t){
        int counter2 = 0;

        while (counter2 < 100000){
            t.get((int)(Math.random()*100000));
            counter2++;
        }
    }
}
