package application.model;

import javafx.scene.control.DatePicker;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Konferrence {

    //Attributer
    private LocalDate startDato;
    private LocalDate slutDato;
    private String konferrenceNavn;
    private String location;

    //Link Attributter
    private ArrayList<Foredrag> foredrags;
    private ArrayList<Hotel> hoteller;
    private ArrayList<Tilmelding> tilmeldinger;
    private ArrayList<Udflugt> udflugter;

    //Construktor
    public Konferrence(LocalDate startDato, LocalDate slutDato, String konferrenceNavn, String location) {
        this.startDato = startDato;
        this.slutDato = slutDato;
        this.konferrenceNavn = konferrenceNavn;
        this.location = location;
        this.foredrags = new ArrayList<>();
        this.tilmeldinger = new ArrayList<>();
        this.hoteller = new ArrayList<>();
        this.udflugter = new ArrayList<>();
    }

    //Set og get metoder
    public LocalDate getStartDato() {
        return startDato;
    }
    public void setStartDato(LocalDate startDato) {
        this.startDato = startDato;
    }

    public LocalDate getSlutDato() {
        return slutDato;
    }
    public void setSlutDato(LocalDate slutDato) {
        this.slutDato = slutDato;
    }

    public String getKonferrenceNavn() {
        return konferrenceNavn;
    }
    public void setKonferrenceNavn(String konferrenceNavn) {
        this.konferrenceNavn = konferrenceNavn;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Foredrag> getForedrag() {
        return new ArrayList<>(foredrags);
    }

    public ArrayList<Tilmelding> getDeltagere() {
        return new ArrayList<>(tilmeldinger);
    }
    public void addDeltager(Tilmelding tilmelding) {
        this.tilmeldinger.add(tilmelding);
    }


/////////////////////////////////////////////////////////////////////////////////////////
    public ArrayList<Hotel> getHoteller() {
        return new ArrayList<>(hoteller);
    }

    public void addHotel(Hotel hotel) {
        if (!hoteller.contains(hotel)){
            hoteller.add(hotel);
            hotel.addKonference(this);
        }
    }
    public void removeHotel(Hotel hotel){
        if (!hoteller.contains(hotel)){
            hoteller.remove(hotel);
            hotel.removeKonferrence(this);
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////

    public void addTilmelding (Tilmelding tilmelding){
        if (!tilmeldinger.contains(tilmelding)){
            tilmeldinger.add(tilmelding);
            tilmelding.setKonferrence(this);
        }
    }
    public void removeTilmelding(Tilmelding tilmelding){
        if (tilmeldinger.contains(tilmelding)){
            tilmeldinger.remove(tilmelding);
            tilmelding.setKonferrence(null);
        }
    }
//////////////////////////////////////////////////////////////////////////////////////////////

    public void addForedrag (Foredrag foredrag){
        if (!foredrags.contains(foredrag)){
            foredrags.add(foredrag);
            foredrag.setKonferrence(this);
        }
    }

    public void removeFordrag (Foredrag foredrag){
        if (foredrags.contains(foredrag)){
            foredrags.remove(foredrag);
            foredrag.setKonferrence(null);
        }
    }

    /////////////////7777////////////////////////////////////////////////////////////////////

    public void addUdflugt (Udflugt udflugt){
        if (!udflugter.contains(udflugt)){
            udflugter.add(udflugt);
            udflugt.setKonferrence(this);
        }
    }

    public void removeUdflugt(Udflugt udflugt){
        if (udflugter.contains(udflugt)){
            udflugter.remove(udflugt);
            udflugt.setKonferrence(null);
        }
    }




}
