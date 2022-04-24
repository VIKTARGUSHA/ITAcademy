package by.academy.HomeWork.Collections.LinkedList;

public class LinkedList<T> {
    private int size = 0;
    Node <T> first;
    Node <T> last;


public Node<T> get(int index){
    Node <T> node = first;
    int indexI = 0;
    while (index < indexI){
         node = node.next;
        indexI++;
    }
    return node;
}
public void add(T item){
    Node <T> nodeAdd = new Node<>(item);
    if(first == null){
        last = nodeAdd;
        first = nodeAdd;
    } else {
        last.next = nodeAdd;
        nodeAdd.prev = last;
        last = nodeAdd;
        size++;
    }
}

    public void add( int index ,T item) {

    Node <T> nodeBeforeReplace = get(index-1);
        Node <T> nodeWithThisItem = new Node<>(item);
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds");

        }
        else if (index == size) {
           add(item);
            size++;

        }
        else  {
            Node <T> nodeForReplace = get(index);
           nodeWithThisItem.next = nodeForReplace;
           nodeWithThisItem.prev = nodeForReplace.prev;
           nodeForReplace.prev = nodeWithThisItem;
           nodeForReplace.prev.next = nodeWithThisItem;
            size++;
        }
    }

    public class Node <T>{
public T item;
public Node <T> prev;
public Node <T> next;
public Node(T item, Node<T> prev, Node<T> next){
    this.item = item;
    this.prev = prev;
    this.next = next;
}
public Node (T item){
    this.item = item;
}
    }
}
