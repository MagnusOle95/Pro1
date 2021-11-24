package Opgave5_VareOgkøbskurv;

public class Vare {

    private double prisExMoms;
    private String vareNavn;
    private String beskrivelse;

    public Vare(double prisExMoms, String vareNavn, String beskrivelse) {
        this.prisExMoms = prisExMoms;
        this.vareNavn = vareNavn;
        this.beskrivelse = beskrivelse;
    }

    public double beregnPris(){
        return prisExMoms * 1.25;
    }

    public double getPrisExMoms(){
        return this.prisExMoms;
    }

    public String toString(){
        return "Pris: " + beregnPris() + " " + vareNavn;
    }

}
