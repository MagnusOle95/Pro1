package Patterns.adapter.Super_salg_Butik_Adapter_pattern;

public abstract class Vare {

    //Attributes
    private int pris;
    private String navn;

    //Cunstruktor
    public Vare(int pris, String navn) {
        this.pris = pris;
        this.navn = navn;
    }

    //aner ikke  hvordan jeg skal forbinde, klassen til, adaptern.
    //Samtidig, kan klassen spiritus ikke overide.


    //Methodes
    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public abstract double beregnmoms();
}
