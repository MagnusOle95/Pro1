package Opgave2_Skole_Studerende.associeringen_Map;

public class App {
    public static void main(String[] args) {

        Skole skole = new Skole("Holgber skolen");

        Studerende s1 = new Studerende("Magnus");
        s1.addKarater(12);
        s1.addKarater(7);
        s1.addKarater(10);

        Studerende s2 = new Studerende("Kim" );
        s2.addKarater(7);
        s2.addKarater(12);
        s2.addKarater(4);

        Studerende s3 = new Studerende("Mathias");
        s3.addKarater(7);
        s3.addKarater(7);
        s3.addKarater(7);

        Studerende s4 = new Studerende("Mikkel");
        s4.addKarater(4);
        s4.addKarater(4);
        s4.addKarater(2);

        skole.addStuderende(1,s1);
        skole.addStuderende(2,s2);
        skole.addStuderende(3,s3);
        skole.addStuderende(4,s4);

        System.out.println("Elevernes gennemsnit: " + skole.gennemsnit());

        System.out.println("Finder elev med studie nummer 2: " + skole.findStuderende(2));

        System.out.println("Udskriver skole ??????: " + skole);

        System.out.println(s2);



    }


}
