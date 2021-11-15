package application.model;

import java.util.ArrayList;

public class Hotel {

    //Attributer
    private String hotelNavn;
    private String hotelBestyrre;

    //Link attribut
    private ArrayList<Tilvalg> tilValg;

    //Construktor
    public Hotel(String hotelNavn, String hotelBestyrre) {
        this.hotelNavn = hotelNavn;
        this.hotelBestyrre = hotelBestyrre;
        this.tilValg = new ArrayList<>();
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


}
