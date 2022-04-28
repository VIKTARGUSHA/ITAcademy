package by.academy.HomeWork.Collections.Task12;

import by.academy.HomeWork.Collections.Task5.HeavyBox;

import java.util.ArrayDeque;
import java.util.ArrayList;

//Создать коллекцию, содержащую объекты HeavyBox. Написать метод,
//который перебирает элементы коллекции и проверяет вес коробок.
//Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.
public class Task12 {
    public static ArrayList<ArrayList<HeavyBox>> heavyBoxesSort(ArrayList <HeavyBox> aD){
        ArrayList <HeavyBox> newArrayDeque = new ArrayList<>();
        ArrayList <ArrayList<HeavyBox>> arrayList = new ArrayList<>();
        ArrayList <HeavyBox> aDMod = aD;
        for (HeavyBox box : aD){
            if(box.getWeight() > 300){
                newArrayDeque.add(box);
              aDMod.remove(box);
            }
        }
        System.out.println(aD.size());
        System.out.println(newArrayDeque.size());
        arrayList.add(aDMod);
        arrayList.add(newArrayDeque);
        return arrayList;
    }
    public static void main(String[] args) {
        ArrayList <HeavyBox> arrayDeque = new ArrayList<>();
        arrayDeque.add(new HeavyBox(100, 1));
        arrayDeque.add(new HeavyBox(515, 2));
        arrayDeque.add(new HeavyBox(20,3));
        arrayDeque.add(new HeavyBox(320, 3));
        arrayDeque.add(new HeavyBox(20,3));
        arrayDeque.add(new HeavyBox(325, 5));
        ArrayList<ArrayList<HeavyBox>> arrayList1 = Task12.heavyBoxesSort(arrayDeque);
        for (ArrayList<HeavyBox> a : arrayList1){
            for (HeavyBox box : a){
                System.out.print(box.toString() + " " + "\n");
            }
            System.out.println(a.size());
        }
    }
}
