package application.model;

public class Bil {

    //attributer
    private String regNr;
    private Bilmærke bilmærke;

    //Construktor
    public Bil(String regNr,Bilmærke bilmærke){
        this.regNr = regNr;
        this.bilmærke = bilmærke;
    }

    //Get regnr
    public String getRegNr() {
        return regNr;
    }

    //Get og set metoder til bilmærke.
    public Bilmærke getBilmærke() {
        return bilmærke;
    }

    public void setBilmærke(Bilmærke bilmærke) {
        this.bilmærke = bilmærke;
    }
}
