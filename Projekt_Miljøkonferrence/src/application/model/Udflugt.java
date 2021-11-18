package application.model;

import javafx.scene.control.DatePicker;

import java.time.LocalDate;
import java.util.ArrayList;

public class Udflugt {

    //Attributer
    private double pris;
    private String placering;
    private String type;
    private LocalDate dato;

    //Link attributer
    private ArrayList<Ledsager> ledsagere;
    private Konferrence konferrence;


    Udflugt(double pris, String placering, String type, LocalDate dato,Konferrence konferrence) {
        this.pris = pris;
        this.placering = placering;
        this.type = type;
        this.dato = dato;
        this.konferrence = konferrence;
        ledsagere = new ArrayList<>();
    }


    public double getPris() {
        return pris;
    }
    public void setPris(double pris) {
        this.pris = pris;
    }


    public String getPlacering() {
        return placering;
    }
    public void setPlacering(String placering) {
        this.placering = placering;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDato() {
        return dato;
    }
    public void setDato(LocalDate dato) {
        this.dato = dato;
    }

    public Konferrence getKonferrence(){
        return this.konferrence;
    }


    public void addLedsager(Ledsager ledsager){
        if (!ledsagere.contains(ledsager)){
            ledsagere.add(ledsager);
            ledsager.addUdflugt(this);
        }
    }

    public void removeLedsager(Ledsager ledsager){
        if (ledsagere.contains(ledsager)){
            ledsagere.remove(ledsager);
            ledsager.removeUdflugt(this);
        }
    }









}
