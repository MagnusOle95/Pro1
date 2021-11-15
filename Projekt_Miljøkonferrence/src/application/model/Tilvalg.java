package application.model;

public class Tilvalg {

    //Attributer
    private String navn;
    private String beskrivelse;
    private double pris;

    //Construktor
    public Tilvalg(String navn, String beskrivelse, double pris) {
        this.navn = navn;
        this.beskrivelse = beskrivelse;
        this.pris = pris;
    }

    //Set og get metoder
    public String getNavn() {
        return navn;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }
    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public double getPris() {
        return pris;
    }
    public void setPris(double pris) {
        this.pris = pris;
    }
}
