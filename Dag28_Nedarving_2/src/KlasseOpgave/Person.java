package KlasseOpgave;

public class Person {

    //Attributer
    private String navn;
    private int fødselsÅr;

    public Person(String navn, int fødselsÅr) {
        this.navn = navn;
        this.fødselsÅr = fødselsÅr;
    }

    public String toString(){
        return "Navn: " + navn + "\nFødels år: " + fødselsÅr + "\n";
    }
}
