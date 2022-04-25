package by.academy.HomeWork.Collections.LinkedList;

public class MainLincked {
    public static void main(String[] args) {
        LinkedLists <String> linkedLists = new LinkedLists<>();
        linkedLists.add("A");
        linkedLists.add("B");
        linkedLists.add("C");
        linkedLists.add("D");
        linkedLists.add("E");
        linkedLists.print();
        System.out.println(linkedLists.get(4).toString());
      //  linkedLists.add(2, "F");
    }
}
