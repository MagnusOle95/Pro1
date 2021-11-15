package application.model;

import javafx.scene.control.DatePicker;

import java.util.ArrayList;

public class Konferrence {

    //Attributer
    private DatePicker startDato;
    private DatePicker slutDato;
    private String konferrenceNavn;
    private String location;

    //Link Attributter
    private ArrayList<Foredrag> foredrag;
    private ArrayList<Tilmelding> deltagere;
    private ArrayList<Hotel> hoteller;
    private ArrayList<Udflugt> udflugter;

    //Construktor
    public Konferrence(DatePicker startDato, DatePicker slutDato, String konferrenceNavn, String location) {
        this.startDato = startDato;
        this.slutDato = slutDato;
        this.konferrenceNavn = konferrenceNavn;
        this.location = location;
        this.foredrag = new ArrayList<>();
        this.deltagere = new ArrayList<>();
        this.hoteller = new ArrayList<>();
    }

    //Set og get metoder
    public DatePicker getStartDato() {
        return startDato;
    }
    public void setStartDato(DatePicker startDato) {
        this.startDato = startDato;
    }

    public DatePicker getSlutDato() {
        return slutDato;
    }
    public void setSlutDato(DatePicker slutDato) {
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
        return new ArrayList<>(foredrag);
    }
    public void addForedrag(Foredrag foredrag) {
        this.foredrag.add(foredrag);
    }

    public ArrayList<Tilmelding> getDeltagere() {
        return new ArrayList<>(deltagere);
    }
    public void addDeltager(Tilmelding tilmelding) {
        this.deltagere.add(tilmelding);
    }

    public ArrayList<Hotel> getHoteller() {
        return new ArrayList<>(hoteller);
    }
    public void addHotel(Hotel hotel) {
        this.hoteller.add(hotel);
    }

    public ArrayList<Udflugt> getUdflugter() {
        return new ArrayList<>(udflugter);
    }
    public void addUdflugter(Udflugt udflugt) {
        this.udflugter.add(udflugt);
    }
}
