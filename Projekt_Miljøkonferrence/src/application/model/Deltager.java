package application.model;

import java.util.ArrayList;

public class Deltager {

    //Attributer
    private String navn;
    private String adresse;
    private String by;
    private String land;
    private int tlfNr;
    private String firmanavn;
    private String firmaTlfNr;
    private ArrayList<Tilmelding> tilmeldinger;



    //Construktor
    public Deltager(String navn,String adresse, String land, int tlfNr) {
        this.navn = navn;
        this.adresse = adresse;
        this.land = land;
        this.tlfNr = tlfNr;
        this.tilmeldinger = new ArrayList<>();
    }


    public String getNavn(){return navn;}

    public void setNavn(String navn){this.navn = navn;}

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public int getTlfNr() {
        return tlfNr;
    }

    public void setTlfNr(int tlfNr) {
        this.tlfNr = tlfNr;
    }

    public String getFirmanavn() {
        return firmanavn;
    }

    public void setFirmanavn(String firmanavn) {
        this.firmanavn = firmanavn;
    }

    public String getFirmaTlfNr() {
        return firmaTlfNr;
    }

    public void setFirmaTlfNr(String firmaTlfNr) {
        this.firmaTlfNr = firmaTlfNr;
    }


    public void addTilmelding(Tilmelding tilmelding){
        tilmeldinger.add(tilmelding);
    }

    public void removeTilmelding(Tilmelding tilmelding){
        tilmeldinger.remove(tilmelding);
    }

    public ArrayList<Tilmelding> getTilmeldinger(){
        return new ArrayList<>(tilmeldinger);
    }


    public String toString(){
        return "Navn: " + navn + " Adresse: " + adresse + " TlfNr: " + tlfNr;
    }
}
