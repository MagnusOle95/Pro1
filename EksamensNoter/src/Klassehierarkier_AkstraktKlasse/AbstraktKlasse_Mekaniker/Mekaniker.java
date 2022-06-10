package Klassehierarkier_AkstraktKlasse.AbstraktKlasse_Mekaniker;

public class Mekaniker extends Ansat {

    //Attributer
    private int svendePrøveÅr;

    public Mekaniker(String navn, String adresse, int svendePrøveÅr, double timeLøn) {
        super(navn, adresse,timeLøn);
        this.svendePrøveÅr = svendePrøveÅr;
    }

    public int getSvendePrøveÅr() {
        return svendePrøveÅr;
    }

    public void setSvendePrøveÅr(int svendePrøveÅr) {
        this.svendePrøveÅr = svendePrøveÅr;
    }

    @Override
    public double beregnLoen(){
        return (super.getTimeløn() * 37);
    }

}
