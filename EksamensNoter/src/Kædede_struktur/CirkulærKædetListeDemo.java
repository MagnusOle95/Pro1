package Kædede_struktur;

public class CirkulærKædetListeDemo {
    public static void main(String[] args) {
        CirkulærKædetListe liste = new CirkulærKædetListe();
        System.out.println(liste.isEmpty());
        System.out.println(liste.size());
        liste.addElement("Lars");
        liste.addElement("Frank");
        System.out.println(liste.size());
        System.out.println(liste.isEmpty());
        System.out.println(liste.getFront());
        System.out.println(liste.gettail());
        System.out.println(); //Mellemrum
        liste.addElement("Egon");
        System.out.println(liste.size());
        System.out.println(liste.getFront());
        System.out.println(liste.gettail());
        System.out.println(); //Mellemrum.
        System.out.println(liste.containsElement("frederik"));
        System.out.println(liste.containsElement("Lars"));
        System.out.println(liste.containsElement("Frank"));
        System.out.println(liste.containsElement("Egon"));
        System.out.println(liste.size());
        System.out.println(); //Mellemrum
        liste.RemoveElement("Lars");
        System.out.println(liste.containsElement("Lars"));
        System.out.println(liste.size());
        System.out.println();
        System.out.println(liste.containsElement("Lars"));
        System.out.println(liste.containsElement("Frank"));
        System.out.println(liste.containsElement("Egon"));
        System.out.println(); //Mellemrum
        liste.RemoveElement("Egon");
        System.out.println(liste.containsElement("Egon"));
        System.out.println(liste.size());
        System.out.println(liste.containsElement("Lars"));
        System.out.println(liste.containsElement("Frank"));
        System.out.println(liste.containsElement("Egon"));
        System.out.println(); //Mellemrum
        liste.RemoveElement("Frank");
        System.out.println(liste.containsElement("Frank"));
        System.out.println(liste.size());
        System.out.println(liste.containsElement("Lars"));
        System.out.println(liste.containsElement("Frank"));
        System.out.println(liste.containsElement("Egon"));








    }

}
