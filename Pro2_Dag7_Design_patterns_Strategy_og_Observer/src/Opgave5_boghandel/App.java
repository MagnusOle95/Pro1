package Opgave5_boghandel;

public class App {

    public static void main(String[] args) {
        Kunde k1 = new Kunde("Frank");
        Kunde k2 = new Kunde("Jens");

        BogTitle b1 = new BogTitle("Den store tur",7);
        BogTitle b2 = new BogTitle("Turen til afrika",10);
        BogTitle b3 = new BogTitle("Universets skabelse",9 );

        Sælger s1 = new Sælger(b1,"Gert");
        Indkøber i1  = new Indkøber(b1,"Hansi");

        //Tester hvad sælgeren ser.
        b2.etKøb(k1);
        b2.etKøb(k1);
        b3.etKøb(k1);
        b1.etKøb(k1);

        System.out.println();

        //Tester om indkøber får af hvide at lageret er under 6 bøger.
        b1.etKøb(k2);



    }
}
