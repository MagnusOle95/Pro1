package Kædede_struktur;

import java.util.NoSuchElementException;

public class SortedLinkedList {

    private Node first;


    // TODO hvilke feltvariable skal klassen have
    public SortedLinkedList() {
        first = null;
    }

    /**
     * Tilføjer e til listen, så listen fortsat er sorteret i henhold til den
     * naturlige ordning på elementerne
     */
    public void addElement(String e) {
        Node newNode = new Node();
        newNode.data = e;

        if (first == null) {
            first = newNode;
        } else if (first.data.compareTo(newNode.data) > 0) {
            newNode.next = first;
            first = newNode;
        } else {
			boolean found = false;
			Node temp = first;

            while (!found && temp.next != null) {
                if (temp.next.data.compareTo(e) > 0) {
                    found = true;
                }else{
					temp = temp.next;
				}
            }
			newNode.next = temp.next;
			temp.next = newNode;
        }
    }


    /**
     * Udskriver elementerne fra listen i sorteret rækkefølge
     */
    public void udskrivElements() {
        Node temp = first;
        System.out.print("[");
        while (temp != null) {
            System.out.print(temp.data + ",");
            temp = temp.next;
        }
        System.out.print("]");
    }

    /**
     * Returnerer antallet af elementer i listen
     */
    public int countElements() {
        // TODO
        int count = 0;
        Node temp = first;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }


    /**
     * Fjerner det sidste (altså det største) element i listen. Listen skal fortsat være
     * sorteret i henhold til den naturlige ordning på elementerne.
     *
     * @return true hvis der blev fjernet fra listen ellers returneres false.
     */
    public boolean removeLast() { // hvorfor boolean
        // TODO
        boolean slettet;
        if (first == null) {
            slettet = false;
            throw new NoSuchElementException();
        } else if (first.next == null) {
            first = null;
            slettet = true;
        } else {
            Node temp = first;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            slettet = true;
        }
        return slettet;
    }


    /**
     * Fjerner den første forekomst af e i listen. Listen skal fortsat være
     * sorteret i henhold til den naturlige ordning på elementerne.
     *
     * @return true hvis e blev fjernet fra listen ellers returneres false.
     */
    public boolean removeElement(String e) {
        // TODO
        boolean slettet = false;
        if (first == null) {
            throw new NoSuchElementException();
        } else if (first.data.equals(e)) {
            first = first.next;
            slettet = true;
        } else {
            Boolean fundet = false;
            Node temp = first;
            while (!fundet && temp.next != null) {
                if (temp.next.data.equals(e)) {
                    fundet = true;
                    temp.next = temp.next.next;
                }
                temp = temp.next;
            }
            slettet = true;
        }
        return slettet;
    }

    /**
     * Tilføjer alle elementerne fra list til den aktuelle liste.
     * Listen er fortsat sorteret i henhold til den naturlige ordning på
     * elementerne.
     * ----------------------
     * Tidskompleksisteten tænker vi er O(N^2) da, metoden addElement også har et loop. altså et loop inde i et loop.
     */
    public void addAll(SortedLinkedList list) {
        // TODO: lav mig
        Node temp = list.first;
        while (temp != null){
            this.addElement(temp.data);
            temp = temp.next;
        }
    }


    // Privat indre klasse der modellerer en node i listen
    private class Node {
        public String data;
        public Node next;
    }
}
