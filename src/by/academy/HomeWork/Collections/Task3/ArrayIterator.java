package by.academy.HomeWork.Collections.Task3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterator<T> implements Iterator <T> {
    private ArrayList<T> a;
    int index = 0;
    public ArrayIterator(ArrayList<T> ar){
        this.a = ar;
    }
    @Override
    public boolean hasNext() {
       if(index < a.size()){
           return true;
       }
        return false;
    }
    @Override
    public T next() {
        return a.get(index++);
    }
}
