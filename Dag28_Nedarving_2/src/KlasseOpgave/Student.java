package KlasseOpgave;

public class Student extends Person {

    //Attribut
    private String hovedFag;

    public Student(String navn, int fødselsÅr, String hovedFag) {
        super(navn, fødselsÅr);
        this.hovedFag = hovedFag;
    }

    public String toString(){
        return super.toString() + "HovedFalg: " + hovedFag;
    }
}
