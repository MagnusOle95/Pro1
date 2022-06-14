package interfaces.exstraopgave_viderepåOpgave1;

public class Chili implements Measurable {

    //Attributer
    private String navn;
    private double styrke;

    public Chili(String navn, double styrke) {
        this.navn = navn;
        this.styrke = styrke;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setStyrke(double styrke) {
        this.styrke = styrke;
    }

    @Override
    public double getMeasure(){
        return styrke;
    }

    @Override
    public String toString(){
        return "Navn: " + navn + " Styrke: " + getMeasure() + " Scoville";
    }


}
