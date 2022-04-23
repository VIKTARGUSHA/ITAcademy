package by.academy.HomeWork.Collections.LinkedList;

public class LinkedList<T> {
    private int size;
    Node <T> first;
    Node <T> last;
    public void add( int index ,Node <T> newNode) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
        }
        if (index == 0 && size == 0) {
            first = newNode;
            first.next = null;
            first.prev = null;
            size++;
        }
        if (index == size - 1) {
            newNode.next = null;
            newNode.prev = last.prev;
            last = newNode;

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

    }

}
