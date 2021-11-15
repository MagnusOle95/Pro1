package application.model;

import javafx.scene.control.DatePicker;

import java.util.ArrayList;

public class Udflugt {

    //Attributer
    private double pris;
    private String placering;
    private String type;
    private DatePicker dato;

    //Link attributer
    private ArrayList<Ledsager> ledsagere;


    public Udflugt(double pris, String placering, String type, DatePicker dato) {
        this.pris = pris;
        this.placering = placering;
        this.type = type;
        this.dato = dato;
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

    public DatePicker getDato() {
        return dato;
    }
    public void setDato(DatePicker dato) {
        this.dato = dato;
    }
}
