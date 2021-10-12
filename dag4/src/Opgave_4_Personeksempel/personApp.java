package Opgave_4_Personeksempel;

//hovedprogram, der opretter person -  objekter og metoder.
public class personApp {

    //Opretter en main metode, der køre classen, person//
    public static void main(String[] args) {
        Person Person_1 = new Person("Magnus","Risdalsvej 48",4,32000);
        Person_1.printPerson();

        //sætter Nyt navn, adresse, og løn//
        Person_1.setNavn("Ken");
        Person_1.setAdresse("Færøvej 32");
        Person_1.setMånedløn(35000);
        Person_1.setAntalvirkomheder(6);
        Person_1.ny_arbejdsplads();
        Person_1.printPerson();

        //Person 2//
        Person_1.setNavn("Henrik");
        Person_1.setAdresse("Thorvaldsvej");
        Person_1.setMånedløn(52000);
        Person_1.setAntalvirkomheder(16);
        Person_1.printPerson();

    }


}
