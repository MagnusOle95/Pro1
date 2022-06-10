package Klassehierarkier_AkstraktKlasse.AbstraktKlasse_Mekaniker;

public abstract class Ansat extends Person {

    private double timeløn;

    public Ansat(String navn, String adresse,double timeløn){
        super(navn, adresse);
        this.timeløn = timeløn;
    }

    public double getTimeløn(){
        return timeløn;
    }

    public abstract double beregnLoen();

}
