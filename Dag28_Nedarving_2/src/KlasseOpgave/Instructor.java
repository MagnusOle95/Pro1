package KlasseOpgave;

public class Instructor extends Person {

   //Attribut
    private double månedLøn;

    public Instructor(String navn, int fødselsÅr, double månedLøn) {
        super(navn, fødselsÅr);
        this.månedLøn = månedLøn;
    }

    public String toString(){
        return super.toString() + "Løn" +  månedLøn + "KR";
    }


}
