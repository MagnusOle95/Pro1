package Opgave3_AbstraktKlasse_Mekaniker;

public class Værkføre extends Ansat {

    //Attributer
    private double tilæg;
    private int udnævelsesår;

    public Værkføre(String navn, String adresse,Double timeLøn,double tilæg, int udnævelsesår) {
        super(navn,adresse,timeLøn);
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
        return (super.getTimeløn() * 37) + tilæg;
    }


}
