package Stak;

import java.util.NoSuchElementException;

public class NodeDropOutStack implements StackI{

    private Node top;
    private int stackStørrelse;

    NodeDropOutStack(int stackStørrelse){
        top = new Node();
        this.stackStørrelse = stackStørrelse;
    }

    @Override
    public void push(Object element) {

        if (size() == stackStørrelse){
            Node temp = top.next;
           while (temp.next.next != null){
               temp = temp.next;
           }
           temp.next = null;
        }

        Node newNode = new Node();
        newNode.data = element;
        newNode.next = top.next;
        top.next = newNode;
    }

    @Override
    public Object pop() {
        if (top.next == null){
            throw new NoSuchElementException();
        }
        Object element = top.next.data;
        top.next = top.next.next;
        return element;
    }

    @Override
    public Object peek() {
        if (top.next == null){
            throw new NoSuchElementException();
        }
        return top.next.data;
    }

    @Override
    public boolean isEmpty() {
        boolean listIsEmpty = false;
        if (top.next == null){
            listIsEmpty = true;
        }
        return listIsEmpty;
    }

    @Override
    public int size() {
        int count = 0;
        Node temp = top.next;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    static class Node {
        public Object data;
        public Node next;
    }


}
