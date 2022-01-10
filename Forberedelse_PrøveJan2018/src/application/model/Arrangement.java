package application.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Arrangement {

    //attributter
    private String title;
    private LocalDate date;
    private LocalTime startTid;
    private LocalTime slutTid;
    private double pris;


    //Link attributter



    //Contruktor
    public Arrangement(String title, LocalDate date, LocalTime startTid, LocalTime slutTid, double pris) {
        this.title = title;
        this.date = date;
        this.startTid = startTid;
        this.slutTid = slutTid;
        this.pris = pris;
    }


    //Get og set metoder
    public String getTitle() {
        return title;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getStartTid() {
        return startTid;
    }

    public LocalTime getSlutTid() {
        return slutTid;
    }

    public double getPris() {
        return pris;
    }


    //metoder






}
