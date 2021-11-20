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
    private double dagspris;

    //Link Attributter
    private ArrayList<Tilmelding> tilmeldinger;
    private ArrayList<Udflugt> udflugter;

    //Construktor
    public Konferrence(LocalDate startDato, LocalDate slutDato, String konferrenceNavn, String location, double dagspris) {
        this.startDato = startDato;
        this.slutDato = slutDato;
        this.konferrenceNavn = konferrenceNavn;
        this.location = location;
        this.tilmeldinger = new ArrayList<>();
        this.udflugter = new ArrayList<>();
        this.dagspris = dagspris;
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


    public ArrayList<Tilmelding> getTilmeldinger() {
        return new ArrayList<>(tilmeldinger);
    }

    public void addTilmelding(Tilmelding tilmelding) {
        if (!tilmeldinger.contains(tilmelding)){
            this.tilmeldinger.add(tilmelding);
            tilmelding.setKonferrence(this);
        }
    }

    public void setDagspris(Double pris) {
        this.dagspris = pris;
    }

    public double getDagsPris() {
        return this.dagspris;
    }

    public ArrayList<Udflugt> getUdflugter(){return new ArrayList<>(udflugter);}



    /////////////////////////////////////////////////////////////////////////////////////////

    public void removePerson(Tilmelding tilmelding) {
        if (this.tilmeldinger.contains(tilmelding)) {
            this.tilmeldinger.remove(tilmelding);
        }
    }


    /////////////////////////////////////////////////////////////////////////////////////

    public Udflugt createUdflugt(double pris, String placering, String type, LocalDate dato) {
        Udflugt udflugt = new Udflugt(pris, placering, type, dato, this);
        udflugter.add(udflugt);
        return udflugt;
    }

    public void addUdflugt(Udflugt udflugt){
        if (!udflugter.contains(udflugt)){
            udflugter.add(udflugt);
            udflugt.setKonferrence(this);
        }
    }

    public void removePerson(Udflugt udflugt) {
        if (udflugter.contains(udflugt)) {
            udflugter.remove(udflugt);
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////


    @Override
    public String toString() {
        return konferrenceNavn;
    }
}
