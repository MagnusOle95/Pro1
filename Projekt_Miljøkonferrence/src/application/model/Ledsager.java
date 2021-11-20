package application.model;

import java.util.ArrayList;

public class Ledsager {

    //Attribut
    private String navn;

    //Link attributter
    private ArrayList<Udflugt> udflugter;


    //Construktor
    Ledsager(String navn) {
        this.navn = navn;
        udflugter = new ArrayList<>();
    }

    //Get og set metoder
    public ArrayList<Udflugt> getUdflugter() {
        return new ArrayList<>(udflugter);
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }


    public void addUdflugt(Udflugt udflugt) {
        if (!udflugter.contains(udflugt)){
            this.udflugter.add(udflugt);
            udflugt.addLedsager(this);
        }
    }

    public void removeUdflugt(Udflugt udflugt){
        if (udflugter.contains(udflugt)){
            this.udflugter.remove(udflugt);
            udflugt.removeLedsager(this);
        }
    }

    public String toString(){
        return navn;
    }






}
