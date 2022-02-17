package Opgave3;

public class Vare {

    private double prisExMoms;
    private String vareNavn;
    private String beskrivelse;
    private Moms moms;

    public Vare(double prisExMoms, String vareNavn, String beskrivelse,Moms moms) {
        this.prisExMoms = prisExMoms;
        this.vareNavn = vareNavn;
        this.beskrivelse = beskrivelse;
        this.moms = moms;
    }

    public double beregnPris(){
        return moms.beregnPris(prisExMoms);
    }

    public double getPrisExMoms(){
        return this.prisExMoms;
    }

    public String toString(){
        return "Pris: " + beregnPris() + " " + vareNavn;
    }

    public Moms getMoms(){
        return moms;
    }

}
