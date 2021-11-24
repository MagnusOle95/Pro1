package Opgave3_AbstraktKlasse_Mekaniker;

public class Synsmand extends Mekaniker {

    //Attributer
    private int antalSynPrUge;
    private double tilæg;

    //Contruktor
    public Synsmand(String navn, String adresse, int svendePrøveÅr, double timeLøn, int antalSynPrUge) {
        super(navn, adresse, svendePrøveÅr, timeLøn);
        this.antalSynPrUge = antalSynPrUge;
        this.tilæg = antalSynPrUge * 29;
    }

    public int getAntalSynPrUge() {
        return antalSynPrUge;
    }

    public void setAntalSynPrUge(int antalSynPrUge) {
        this.antalSynPrUge = antalSynPrUge;
        this.tilæg = antalSynPrUge * 29;
    }

    public double getTilæg() {
        return tilæg;
    }

    @Override
    public double beregnLoen(){
        return super.beregnLoen() + tilæg;
    }

}
