package Opgaver_På_Klassen_Implemetering_af_iterator;

import java.util.Iterator;

public class SortedLimkedListDemo {

    public static void main(String[] args) {
        String Jens = "Jens";
        String Per = "Per";
        String Øster = "Øster";
        String Frank = "Frank";
        String Jepper = "Jepper";
        String kim = "Kim";

        SortedLinkedList sortedLinkedList = new SortedLinkedList();
        sortedLinkedList.addElement(Jens);
        sortedLinkedList.addElement(Per);
        sortedLinkedList.addElement(Øster);
        sortedLinkedList.addElement(Frank);
        sortedLinkedList.addElement(Jepper);
        sortedLinkedList.addElement(kim);

        sortedLinkedList.udskrivElements();

        System.out.println();
        System.out.println(sortedLinkedList.countElements());

        sortedLinkedList.removeLast();
        sortedLinkedList.udskrivElements();

        System.out.println();
        sortedLinkedList.removeElement("Jepper");
        sortedLinkedList.udskrivElements();

        //Tester addAll altså sætter 2 lister sammen.
        System.out.println();
        System.out.println();
        sortedLinkedList.udskrivElements();

        //Opretter linked liste 2
        System.out.println();
        String gurli = "Gurli";
        String torben = "Torben";
        String sune = "Sune";
        SortedLinkedList sortedLinkedList2 = new SortedLinkedList();
        sortedLinkedList2.addElement(gurli);
        sortedLinkedList2.addElement(torben);
        sortedLinkedList2.addElement(sune);
        sortedLinkedList2.udskrivElements();
        System.out.println();

        //Sætter linked liste 2 ind i linked liste 1.
        sortedLinkedList.addAll(sortedLinkedList2);

        //Udskriver linkedliste 1 og ser om emnerne fra linkedliste 2 er tilføjet.
        sortedLinkedList.udskrivElements();
        System.out.println();

        //Tester iterator.
        Iterator<String> itr = sortedLinkedList.listiterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }













    }
}
