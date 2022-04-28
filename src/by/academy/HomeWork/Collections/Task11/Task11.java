package by.academy.HomeWork.Collections.Task11;

import by.academy.HomeWork.Collections.Task5.HeavyBox;

import java.util.ArrayDeque;

//Создать очередь, содержащую объекты класса HeavyBox. Используем класс ArrayDeque.
//Поместить объекты в очередь с помощью метода offer().
//Удалить объекты методом poll().
public class Task11 {
    public static void main(String[] args) {
        ArrayDeque<HeavyBox> arrayDeque = new ArrayDeque();
        arrayDeque.offer(new HeavyBox(100, 1));
        arrayDeque.offer(new HeavyBox(15, 2));
        arrayDeque.offer(new HeavyBox(20,3));
        arrayDeque.add(new HeavyBox(20, 3));
        arrayDeque.offer(new HeavyBox(20,3));
        arrayDeque.offer(new HeavyBox(25, 5));
        for (HeavyBox box : arrayDeque){
            System.out.println(box.toString());
        }
        while (!arrayDeque.isEmpty()){
            arrayDeque.poll();
        }
        System.out.println(arrayDeque.size());
    }
}
