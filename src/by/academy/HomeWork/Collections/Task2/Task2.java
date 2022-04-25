package by.academy.HomeWork.Collections.Task2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList();
        FillIn.fillInAr(arrayList);
        FillIn.fillInlL(linkedList);
        FillIn.getElement(arrayList);
        FillIn.getElement1(linkedList);
    }
        static class FillIn{
            public static void fillInAr(ArrayList<Double> ar){
                for (int i = 0; i < 1000000; i++){
                    ar.add(Math.random()*100);
                }
                System.out.println("Arraylist is full of");
            }
            public static void fillInlL(LinkedList<Double> lL){
                for (int i = 0; i < 1000000; i++){
                    lL.add(Math.random()*100);
                }
                System.out.println("LinkedList is full of");
            }
            public static void getElement(ArrayList <?> ar){
                for (int j = 0; j < 100000; j++){
                    ar.get((int)(Math.random()*1000000));
                }
                System.out.println("ArrayList speed");
            }
            public static void getElement1(LinkedList <?> ar){
                for (int j = 0; j < 100000; j++){
                    ar.get((int)(Math.random()*1000000));
                }
                System.out.println("LinkedList speed");
            }
        }

    }

