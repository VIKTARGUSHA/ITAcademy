package by.academy.HomeWork.Collections.Task10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Напишите методы union(Set<?>... set) и intersect(Set<?> ... set),
//реализующих операции объединения и пересечения множеств.
//Протестируйте работу этих методов на предварительно заполненных множествах.
public class Task10 {
    public static <T> Set<T> intersect(Set<?>...set){
        Set<T> hashSet = new HashSet<>();

        for (Set localSet : set){
                hashSet.addAll(localSet);
        }
        return hashSet;
    }
    public static <T> ArrayList<T> union(Set<?>...set){
        ArrayList<T> arrayList = new ArrayList<>();

        for (Set localSet : set){
            arrayList.addAll(localSet);
        }
        return arrayList;
    }
    public static void main(String[] args) {
Set <String> set1 = new HashSet<>();
set1.add("A");
set1.add("B");
set1.add("C");
set1.add("D");
set1.add("E");
        Set <String> set2 = new HashSet<>();
        set2.add("F");
        set2.add("G");
        set2.add("H");
        set2.add("I");
        set2.add("J");

        Set <String> set3 = new HashSet<>();
        set3.add("I");
        set3.add("J");
        set3.add("K");
        set3.add("L");
        set3.add("M");
        System.out.println(Task10.union(set1, set2, set3).toString());
        System.out.println(Task10.intersect(set1, set2, set3).toString());
    }

}
