package by.academy.HomeWork.Collections.LinkedList;
public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList <String> linkedList = new LinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.print();
        System.out.println("\n" + linkedList.get(2).toString());
    }
}
