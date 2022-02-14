package Opgave2_Skole_Studerende.associeringen_List;

public class App {
    public static void main(String[] args) {

        Skole skole = new Skole("Holgber skolen");

        Studerende s1 = new Studerende(1,"Magnus");
        s1.addKarater(12);
        s1.addKarater(7);
        s1.addKarater(10);

        Studerende s2 = new Studerende(2,"Kim" );
        s2.addKarater(7);
        s2.addKarater(12);
        s2.addKarater(4);

        Studerende s3 = new Studerende(3,"Mathias");
        s3.addKarater(7);
        s3.addKarater(7);
        s3.addKarater(7);

        Studerende s4 = new Studerende(4,"Mikkel");
        s4.addKarater(4);
        s4.addKarater(4);
        s4.addKarater(2);

        skole.addStuderende(s1);
        skole.addStuderende(s2);
        skole.addStuderende(s3);
        skole.addStuderende(s4);

        System.out.println("Elevernes gennemsnit: " + skole.gennemsnit());

        System.out.println("Finder elev med studie nummer 2: " + skole.findStuderende(2));

        System.out.println("Udskriver skole ??????: " + skole);


    }


}
