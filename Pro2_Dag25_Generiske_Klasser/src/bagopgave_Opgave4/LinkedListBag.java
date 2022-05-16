package bagopgave_Opgave4;

import org.w3c.dom.Node;

public class LinkedListBag<T> implements Bag<T> {

    private Node first;
    private int currentSize;
    private int maxSize;

    public LinkedListBag(){
        this.first = null;
        this.currentSize = 0;
        this.maxSize = 0;
    }

    @Override
    public int getCurrentSize() {
        return currentSize;
    }

    @Override
    public boolean isFull() {
        return currentSize == maxSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public boolean add(T newEntry) {

        return false;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public boolean remove(T anEntry) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int getFrequencyOf(T anEntry) {
        return 0;
    }

    @Override
    public boolean contains(T anEntry) {
        return false;
    }

    @Override
    public T[] toArray() {
        return null;
    }

    private class Node {
        public T data;
        public Node next;
    }

}
