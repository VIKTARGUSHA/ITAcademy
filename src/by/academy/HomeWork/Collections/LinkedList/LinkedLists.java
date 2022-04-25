package by.academy.HomeWork.Collections.LinkedList;

public class LinkedLists<T> {
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
        size++;
    } else {
        last.next = nodeAdd;
        nodeAdd.prev = last;
        last = nodeAdd;
        size++;
    }
}

    public void add( int index ,T item) {


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
    public void print(){
    Node<T> node = first;
    for (int i = 0; i < size; i++){
        System.out.println(node.item);
        node = first.next;
        first = node;
    }
    }

    public void remove(int index) {
        if (index < 0 || index > size-1) {
            System.out.println("There is index out of bounds mistake");
        } else if (index == size-1) {
            Node <T> node = get(index);
            node.prev.next =null;
            last = node.prev;
        }
        else if(index == 0){
            Node<T> node = get(index);
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        } else  {
            Node<T> node = get(index);
            node.next.prev = null;
            first = node.next;
            size--;
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

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +
                    ", prev=" + prev +
                    ", next=" + next +
                    '}';
        }
    }
}
