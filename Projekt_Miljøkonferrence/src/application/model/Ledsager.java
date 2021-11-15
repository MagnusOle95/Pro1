package application.model;

import java.util.ArrayList;

public class Ledsager {

    //Attribut
    private ArrayList<Udflugt> udflugter;
    private String navn;

    //Construktor
    public Ledsager(String navn) {
        this.navn = navn;
        udflugter = new ArrayList<>();
    }

    //Get og set metoder
    public ArrayList<Udflugt> getUdflugter() {
        return new ArrayList<>(udflugter);
    }

    public void addUdflugt(Udflugt udflugt) {
        if (!udflugter.contains(udflugt)){
            this.udflugter.add(udflugt);
        }
    }

    public void removeUdflugt(Udflugt udflugt){
        if (udflugter.contains(udflugt)){
            this.udflugter.remove(udflugt);
        }
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
}
