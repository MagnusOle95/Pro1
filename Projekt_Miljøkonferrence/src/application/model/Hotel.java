package application.model;

import java.util.ArrayList;

public class Hotel {

    //Attributer
    private String hotelNavn;
    private String hotelBestyrre;
    private double enkeltVærelsesPris;
    private double dobbeltVærelsesPris;

    //Link attribut
    private ArrayList<Tilvalg> tilValg;
    private ArrayList<Tilmelding> tilMeldinger;
    private ArrayList<Konferrence> konferrencer;

    //Construktor
    public Hotel(String hotelNavn, String hotelBestyrre,double enkeltVærelsesPris, double dobbeltVærelsesPris) {
        this.hotelNavn = hotelNavn;
        this.hotelBestyrre = hotelBestyrre;
        this.enkeltVærelsesPris = enkeltVærelsesPris;
        this.dobbeltVærelsesPris = dobbeltVærelsesPris;
        this.tilValg = new ArrayList<>();
        this.tilMeldinger = new ArrayList<>();

    }

    //Get og set metoder

    public String getHotelNavn() {
        return hotelNavn;
    }
    public void setHotelNavn(String hotelNavn) {
        this.hotelNavn = hotelNavn;
    }

    public String getHotelBestyrre() {
        return hotelBestyrre;
    }
    public void setHotelBestyrre(String hotelBestyrre) {
        this.hotelBestyrre = hotelBestyrre;
    }

    public double getEnkeltVærelsesPrisPris() {
        return this.enkeltVærelsesPris;
    }
    public void setEnkeltVærelsesPris(double pris) {
        this.enkeltVærelsesPris = pris;
    }

    public double getDobbeltVærelsesPris() {
        return this.dobbeltVærelsesPris;
    }
    public void setDobbeltVærelsesPris(double pris) {
        this.dobbeltVærelsesPris = pris;
    }


    //Forbinder, Tilvalg til hotel//
    public ArrayList<Tilvalg> getTilValg() {
        return new ArrayList<>(tilValg);
    }

    public Tilvalg createTilvalg (String navn, String beskrivelse, double pris) {
        Tilvalg tilvalg = new Tilvalg(navn,beskrivelse,pris);
        tilValg.add(tilvalg);
        return tilvalg;
    }

    public void removeTilvalg(Tilvalg tilvalg){
        if (this.tilValg.contains(tilvalg)){
            this.tilValg.remove(tilvalg);
        }
    }

    ////////////////////////////////////////////////////////////////////////////////
    public void addTilmeldinger(Tilmelding tilmelding){
        if (!this.tilMeldinger.contains(tilmelding)){
            this.tilMeldinger.add(tilmelding);
            tilmelding.setHotel(this);
        }
    }
    public void removeTildmelding(Tilmelding tilmelding){
        if (this.tilMeldinger.contains(tilmelding)){
            this.tilMeldinger.remove(tilmelding);
            tilmelding.setHotel(null);
        }
    }

    /////////////////////////////////////////////////////////////////////////////////
    public void addKonference(Konferrence konferrence){
        if (!this.konferrencer.add(konferrence)){
            this.konferrencer.add(konferrence);
            konferrence.addHotel(this);
            }
        }
        public void removeKonferrence(Konferrence konference){
        if (this.konferrencer.contains(konference)){
            this.konferrencer.add(konference);
            konference.removeHotel(this);
        }
    }
    ////////////////////////////////////////////////////////////////////////////////






}
