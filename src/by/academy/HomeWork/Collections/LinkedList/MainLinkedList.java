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
        System.out.print("\n" + linkedList.get(4).toString());
        System.out.print("\n" + linkedList.get(0).toString());
        System.out.print("\n" + linkedList.get(1).toString());
        System.out.println();
        linkedList.add(3, "F");
        linkedList.add(4, "G");
        linkedList.add(0, "H");
        linkedList.print();
        linkedList.remove(1);
        linkedList.remove(4);

        linkedList.remove(linkedList.size()-1);
        System.out.println();
        linkedList.print();

    }
}
