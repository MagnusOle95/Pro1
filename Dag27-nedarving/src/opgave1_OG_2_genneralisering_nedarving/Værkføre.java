package opgave1_OG_2_genneralisering_nedarving;

public class Værkføre extends Mekaniker {

    //Attributer
    private double tilæg;
    private int udnævelsesår;

    public Værkføre(String navn, String adresse, int svendePrøveÅr, double timeLønsSats, double tilæg, int udnævelsesår) {
        super(navn, adresse, svendePrøveÅr, timeLønsSats);
        this.tilæg = tilæg;
        this.udnævelsesår = udnævelsesår;
    }

    public double getTilæg() {
        return tilæg;
    }

    public void setTilæg(double tilæg) {
        this.tilæg = tilæg;
    }

    public int getUdnævelsesår() {
        return udnævelsesår;
    }

    public void setUdnævelsesår(int udnævelsesår) {
        this.udnævelsesår = udnævelsesår;
    }

    @Override
    public double beregnLoen(){
        return super.beregnLoen() + tilæg;
    }


}
