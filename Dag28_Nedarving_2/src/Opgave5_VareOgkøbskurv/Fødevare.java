package Opgave5_VareOgkøbskurv;

public class Fødevare extends Vare {

    private int holdbarhedIdage;

    public Fødevare(double prisExMoms, String vareNavn, String beskrivelse, int holdbarhedIdage) {
        super(prisExMoms, vareNavn, beskrivelse);
        this.holdbarhedIdage = holdbarhedIdage;
    }

    @Override
    public double beregnPris(){
        return super.getPrisExMoms() * 1.05;
    }

    @Override
    public String toString(){
        return super.toString() + " Holdbarhed: " + holdbarhedIdage + " Dage";
    }

}
