package by.academy.HomeWork.Collections.Task2;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<Double> linkedList = new LinkedList();
        ArrayList<Double> arrayList = new ArrayList();
        FillArray.fillArrayList(arrayList);
        FillArray.fillLink(linkedList);
        FillArray.useArrayList(arrayList);
        FillArray.useLinkedList(linkedList);
    }
    public static class FillArray{
public static void fillArrayList(ArrayList<Double> a){
    for (int i = 0; i < 1_000_000; i++){
        a.add(Math.random()*100);
    }
    System.out.println("ArrayListIsFull");
}
        public static void fillLink(LinkedList<Double> a){
            for (int i = 0; i < 1_000_000; i++){
                a.add(Math.random()*100);
            }
            System.out.println("LinkedListIsFull");
        }
        public static void useArrayList(ArrayList<?> a){
            for (int i = 0; i < 100_000; i++){
                a.get((int)(Math.random()*1_000_000));
            }
            System.out.println("Time use ArrayList" + " " + a.size());
        }
        public static void useLinkedList(LinkedList<?> a){
            for (int i = 0; i < 10000; i++){
                a.get((int)(Math.random()*1_000_000));
            }
            System.out.println("Time use LinkedList" + " " + a.size());
        }
    }
}
