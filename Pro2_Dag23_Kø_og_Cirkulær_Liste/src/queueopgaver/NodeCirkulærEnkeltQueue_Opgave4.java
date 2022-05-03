package queueopgaver;

public class NodeCirkulærEnkeltQueue_Opgave4 {

    private int antalIKø;
    private Node queueFront;
    private Node queueStart;

    public NodeCirkulærEnkeltQueue_Opgave4(){
        antalIKø = 0;
        queueFront = null;
        queueStart = null;
    }

    //Tilføjer person.
    public void addPerson(Person p) {
        Node newnode = new Node();
        newnode.person = p;
        antalIKø ++;
        if (queueFront == null){
            queueFront = newnode;
            queueStart = newnode;
        }else{
            queueStart.next = newnode;
            queueStart = newnode;
        }
    }

    // udskriver personerne i den
    // rækkefølge de står i listen
    public void print(){

    }

    //en tilfældig person i den cirkulæreliste
    // vælges som start i listen
    public void randomStart(){

    }

    // fjerner den person fra listen der ligger
    // count pladser fra starti listen. Personen
    // der fjernes returneres, og startsættes
    // nu til at være personen lige efter.
    public Person remove(int count){
      return null;
    }

    static class Node {
        public Person person;
        public Node next;
    }

}
