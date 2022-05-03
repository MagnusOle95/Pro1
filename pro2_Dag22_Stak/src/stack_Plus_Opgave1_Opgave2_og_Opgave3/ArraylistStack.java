package stack_Plus_Opgave1_Opgave2_og_Opgave3;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArraylistStack implements StackI {
    private ArrayList<Object> list;


    public ArraylistStack(){
        list = new ArrayList<Object>();
    }

    @Override
    public void push(Object element) {
        list.add(element);
    }

    @Override
    public Object pop() {
        if (list.size() <= 0) {
            throw new NoSuchElementException();
        }
        return list.remove(list.size() - 1);
    }

    @Override
    public Object peek() {
        if (list.size() <= 0){
            throw new NoSuchElementException();
        }
       return list.get(list.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }


}
