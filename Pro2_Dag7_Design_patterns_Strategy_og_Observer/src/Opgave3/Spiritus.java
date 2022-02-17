package Opgave3;

public class

Spiritus extends Vare {

    private double alkoholdProcent;

    public Spiritus(double prisExMoms, String vareNavn, String beskrivelse, double alkoholdProcent,Moms moms) {
        super(prisExMoms, vareNavn, beskrivelse,moms);
        this.alkoholdProcent = alkoholdProcent;
    }

    @Override
    public double beregnPris(){
        return super.getMoms().beregnPris(super.getPrisExMoms());
    }

    @Override
    public String toString(){
        return super.toString() + " Alkoholdprocent: " + alkoholdProcent + "%";
    }
}
