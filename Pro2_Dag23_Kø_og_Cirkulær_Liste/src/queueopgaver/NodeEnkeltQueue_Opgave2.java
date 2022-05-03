package queueopgaver;

public class NodeEnkeltQueue_Opgave2 implements QueueI{

    private int antalIKø;
    private Node queueFront;
    private Node queueStart;


    public NodeEnkeltQueue_Opgave2(){
        antalIKø = 0;
        queueFront = null;
        queueStart = null;
    }

    @Override
    public boolean isEmpty() {
        boolean queueEmpty = false;
        if (queueFront == null){
            queueEmpty = true;
        }
        return queueEmpty;
    }

    @Override
    public void enqueue(Object newElement) {
        Node newnode = new Node();
        newnode.data = newElement;
        antalIKø++;

        if (queueFront == null){
            queueFront = newnode;
            queueStart = newnode;
        }else{
            queueStart.next = newnode;
            queueStart = newnode;
        }
    }

    @Override
    public Object dequeue() {
        Object objekt = queueFront.data;
        queueFront = queueFront.next;
        antalIKø--;
        return objekt;
    }

    @Override
    public Object getFront() {
        return queueFront.data;
    }

    @Override
    public int size() {
        return antalIKø;
    }

    static class Node {
        public Object data;
        public Node next;
    }

}
