package queueopgaver;

public class NodeDoubleDeQueue_Opgave3 implements DequeI {

    private int antalIKø;
    private Node queueFront;
    private Node queueStart;


    public NodeDoubleDeQueue_Opgave3(){
        antalIKø = 0;
        queueFront = new Node();
        queueStart = new Node();
        queueFront.next = queueStart;
        queueStart.prev = queueFront;
    }


    @Override
    public boolean isEmpty() {
        boolean queueEmpty = false;
        if (queueFront.next == queueStart){
            queueEmpty = true;
        }
        return queueEmpty;
    }

    @Override
    public void addFirst(Object newElement) {
        Node newNode = new Node();
        newNode.data = newElement;

        newNode.next = queueFront.next;
        newNode.prev = queueFront;

        queueFront.next.prev = newNode;
        queueFront.next = newNode;

        antalIKø++;
    }

    @Override
    public void addLast(Object newElement) {
        Node newNode = new Node();
        newNode.data = newElement;

        newNode.next = queueStart;
        newNode.prev = queueStart.prev;

        queueStart.prev.next = newNode;
        queueStart.prev = newNode;

        antalIKø++;
    }

    @Override
    public Object removeFirst() {
        Object objekt = queueFront.next.data;
        queueFront.next.next.prev = queueFront;
        queueFront.next = queueFront.next.next;
        antalIKø--;
        return objekt;
    }

    @Override
    public Object removeLast() {
        Object objekt = queueStart.prev.data;
        queueStart.prev = queueStart.prev.prev;
        queueStart.prev.next = queueStart;
        antalIKø--;
        return objekt;
    }

    @Override
    public Object getFirst() {
        return queueFront.next.data;
    }

    @Override
    public Object getLast() {
        return queueStart.prev.data;
    }

    @Override
    public int size() {
        return antalIKø;
    }

    static class Node {
        public Object data;
        public Node next;
        public Node prev;
    }

}
