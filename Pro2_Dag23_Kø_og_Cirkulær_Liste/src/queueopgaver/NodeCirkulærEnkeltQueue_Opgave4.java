package queueopgaver;

import java.util.NoSuchElementException;
import java.util.Random;

public class NodeCirkulærEnkeltQueue_Opgave4 {

    private int antalIKø;
    private Node head;
    private Node tail;

    public NodeCirkulærEnkeltQueue_Opgave4(){
        antalIKø = 0;
        head = null;
        tail = null;
    }

    //Tilføjer person.
    public void addPerson(Person p) {
            Node newnode = new Node();
            newnode.person = p;

            if (head == null){
                head = newnode;
            }
            else{
                tail.next = newnode;
            }
            tail = newnode;
            tail.next = head;
            antalIKø++;
    }

    // udskriver personerne i den
    // rækkefølge de står i listen
    public void print(){
        if (head == null){
            throw new NoSuchElementException();
        }
        Node temp = head;
        System.out.print("[");
        for (int i = 1; i <= antalIKø;i++){
            System.out.print(temp.person + ",");
            temp = temp.next;
        }
        System.out.print("]");
    }

    public void kanibalisering(){
        //Laver det første random tal.
        int tal = randomStart();
        //sletter element, med det første randomme tal.
        System.out.println(remove(tal) + " " + tal);
        //Tæller 5 frem i cirkellisten.
        for (int j = antalIKø; j > 0; j--){
            for (int i = 1; i <= 5; i++){
                if (tal >= antalIKø){
                    tal = 1;
                }else{
                    tal++;
                }
            }
            System.out.println(remove(tal) + " " + tal);
            System.out.println();
            print();
        }


    }

    //en tilfældig person i den cirkulæreliste
    // vælges som start i listen

    public int randomStart(){
        Random r = new Random();
        int randomNr = r.nextInt(antalIKø) + 1;
        System.out.println(randomNr);
        return randomNr;
    }

    // fjerner den person fra listen der ligger
    // count pladser fra starti listen. Personen
    // der fjernes returneres, og startsættes
    // nu til at være personen lige efter.

    public Person remove(int count){
        int index = 1;
        Node temp;
        Person p;

        if (index == count){
            p = head.person;
            head = head.next;
            tail.next = head;

        }else{
            temp = head;
            while (index + 1 != count){
                temp = temp.next;
                index++;
            }
            p = temp.next.person;
            temp.next = temp.next.next;
        }
        antalIKø--;
        return p;
    }


    static class Node {
        public Person person;
        public Node next;
    }





}
