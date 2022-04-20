package by.academy.HomeWork.Collections;

import java.util.ArrayList;

public class MainTask1 {
    public static void main(String[] args) {
        ArrayList<Task1> ar = new ArrayList<>();
        ar.add(new Task1(7));
        ar.add(new Task1(7));
        ar.add(new Task1(9));
        ar.add(new Task1(9));
        ar.add(new Task1(11));
        ar.add(new Task1(5));
        ar.add(new Task1(7));
        ar.add(new Task1(5));
        ar.add(new Task1(2));
        ar.add(new Task1(11));
        System.out.println(Task1.returnListWithoutDublicates(ar).toString());
    }
}
