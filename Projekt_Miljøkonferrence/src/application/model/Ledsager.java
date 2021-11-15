package application.model;

import java.util.ArrayList;

public class Ledsager {

    //Attribut
    private String navn;

    //Link attributter
    ArrayList<Tilmelding> tilmeldinger;
    private ArrayList<Udflugt> udflugter;


    //Construktor
    public Ledsager(String navn) {
        this.navn = navn;
        udflugter = new ArrayList<>();
        tilmeldinger = new ArrayList<>();
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


    public void addTilmelding (Tilmelding tilmelding){
        if (!tilmeldinger.contains(tilmelding)){
            this.tilmeldinger.add(tilmelding);
            tilmelding.setLedsager(this);
        }
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






}
