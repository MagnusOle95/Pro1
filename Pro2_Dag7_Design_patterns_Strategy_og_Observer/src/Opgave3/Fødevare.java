package Opgave3;

public class Fødevare extends Vare {

    private int holdbarhedIdage;

    public Fødevare(double prisExMoms, String vareNavn, String beskrivelse, int holdbarhedIdage,Moms moms) {
        super(prisExMoms, vareNavn, beskrivelse,moms);
        this.holdbarhedIdage = holdbarhedIdage;
    }

    @Override
    public double beregnPris(){
        return super.getMoms().beregnPris(super.getPrisExMoms());
    }

    @Override
    public String toString(){
        return super.toString() + " Holdbarhed: " + holdbarhedIdage + " Dage";
    }

}
