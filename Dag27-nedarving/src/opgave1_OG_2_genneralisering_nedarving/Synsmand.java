package opgave1_OG_2_genneralisering_nedarving;

public class Synsmand extends Mekaniker {

    //Attributer
    private int antalSynPrUge;
    private double tilæg;

    //Contruktor
    public Synsmand(String navn, String adresse, int svendePrøveÅr, double timeLønsSats, int antalSynPrUge) {
        super(navn, adresse, svendePrøveÅr, timeLønsSats);
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
