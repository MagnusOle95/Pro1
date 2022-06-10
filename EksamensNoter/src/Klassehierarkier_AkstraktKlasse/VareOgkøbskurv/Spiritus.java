package Klassehierarkier_AkstraktKlasse.VareOgkøbskurv;

public class

Spiritus extends Vare {

    private double alkoholdProcent;

    public Spiritus(double prisExMoms, String vareNavn, String beskrivelse, double alkoholdProcent) {
        super(prisExMoms, vareNavn, beskrivelse);
        this.alkoholdProcent = alkoholdProcent;
    }

    @Override
    public double beregnPris(){
        double sum;
        if (super.getPrisExMoms() > 90){
            sum = super.getPrisExMoms() * 2.2;
        }else{
            sum = super.getPrisExMoms() * 1.8;
        }
        return sum;
    }

    @Override
    public String toString(){
        return super.toString() + " Alkoholdprocent: " + alkoholdProcent + "%";
    }
}
