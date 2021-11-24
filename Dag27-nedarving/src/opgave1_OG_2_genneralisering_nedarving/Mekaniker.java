package opgave1_OG_2_genneralisering_nedarving;

public class Mekaniker extends Person {

    //Attributer
    private int svendePrøveÅr;
    private double timeLønsSats;

    public Mekaniker(String navn, String adresse, int svendePrøveÅr, double timeLønsSats) {
        super(navn, adresse);
        this.svendePrøveÅr = svendePrøveÅr;
        this.timeLønsSats = timeLønsSats;
    }

    public int getSvendePrøveÅr() {
        return svendePrøveÅr;
    }

    public void setSvendePrøveÅr(int svendePrøveÅr) {
        this.svendePrøveÅr = svendePrøveÅr;
    }

    public double getTimeLønsSats() {
        return timeLønsSats;
    }

    public void setTimeLønsSats(double timeLønsSats) {
        this.timeLønsSats = timeLønsSats;
    }

    public double beregnLoen(){
      return  this.timeLønsSats * 37;
    }

}
