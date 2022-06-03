package Stak;

import java.util.NoSuchElementException;

public class NodeDropOutStackDouble implements StackI {

    private Node top;
    private Node bottom;
    private int stackstørrelse;

    public NodeDropOutStackDouble(int stackstørrelse){
        top = new Node();
        bottom = new Node();
        top.next = bottom;
        bottom.prev = top;
        this.stackstørrelse = stackstørrelse;
    }

    @Override
    public void push(Object element) {
        if (size() == stackstørrelse){
            Node temp = bottom.prev;
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        Node newnode = new Node();
        newnode.data = element;
        newnode.next = top.next;
        newnode.prev = top;
        top.next.prev = newnode;
        top.next = newnode;
    }

    @Override
    public Object pop() {
        if (top.next == bottom){
            throw new NoSuchElementException();
        }
        Object element = top.next.data;
        top.next.next.prev = top;
        top.next = top.next.next;
        return element;
    }

    @Override
    public Object peek() {
        if (top.next == bottom){
            throw new NoSuchElementException();
        }
        return top.next.data;
    }

    @Override
    public boolean isEmpty() {
            boolean listIsEmpty = false;
            if (top.next == bottom){
                listIsEmpty = true;
            }
            return listIsEmpty;
        }

    @Override
    public int size() {
        int count = 0;
        Node temp = top.next;
        while (temp != bottom){
            count++;
            temp = temp.next;
        }
        return count;
    }

    static class Node {
        public Object data;
        public Node next;
        public Node prev;
    }

}
