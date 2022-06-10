package Kædede_struktur;

public class CirkulærKædetListe {

    private int antalIkø;
    private Node head;
    private Node tail;

    public CirkulærKædetListe(){
        this.antalIkø = 0;
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return antalIkø == 0;
    }

    public void addElement(Object newElement) {
            Node newnode = new Node();
            newnode.object = newElement;

            if (head == null){
                head = newnode;
            }
            else{
                tail.next = newnode;
            }
            tail = newnode;
            tail.next = head;
            antalIkø++;
    }

    public void RemoveElement(Object object){
        Node currentNode = head;
        if (head == null) { // the list is empty
            return;
        }
        //Do while, løber igennem løkken, mindst 1 gang,
        // før den tjekker om betingelsen i whileløkken overholdes.
        do {
            Node nextNode = currentNode.next;
            if (nextNode.object == object) {
                if (tail == head) { // the list has only one single element
                    head = null;
                    tail = null;
                    antalIkø--;
                } else {
                    currentNode.next = nextNode.next;
                    if (head == nextNode) { //we're deleting the head
                        head = head.next;
                        antalIkø--;
                    }
                    if (tail == nextNode) { //we're deleting the tail
                        tail = currentNode;
                        antalIkø--;
                    }
                }
                //Break Afbryder whileloopen omgående, og kontrollen af
                // programmet bevæger sig til det næste statement.
                break;
            }
            currentNode = nextNode;
        } while (currentNode != head);
    }


    public boolean containsElement(Object objekt){
        Node current = head;
        boolean found = false;
        int index = 1;

        if (current == null){
            return found;
        }
        else{
            while (!found && index <= antalIkø){
                if (current.object.equals(objekt)){
                    found = true;
                }
                current = current.next;
                index++;
            }
        }
        return found;
    }


    public Object getFront() {
        //Bruger tail her, istedet for head.data, da jeg vil sikre, at min
        //tail kigger på head og sikre mig at listen er cirkulær.
        return tail.next.object;
    }

    public Object gettail() {
        return tail.object;
    }

    public int size() {
        return antalIkø;
    }

    static class Node{
        public Object object;
        public Node next;
    }

}
