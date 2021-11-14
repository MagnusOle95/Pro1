package application.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reservation {

    //Attributer
    private LocalDateTime start;
    private LocalDateTime Slut;

    //Link Attributter
    ArrayList<Plads> pladser;

    //Construktor
    public Reservation(LocalDateTime start, LocalDateTime slut) {
        this.start = start;
        this.Slut = slut;
        pladser = new ArrayList<>();
    }

    //Get og set metoder
    public LocalDateTime getStart() {
        return this.start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getSlut() {
        return this.Slut;
    }

    public void setSlut(LocalDateTime slut) {
        this.Slut = slut;
    }

    //Opretter get pladser//
    public ArrayList<Plads> getPladser(){
        return new ArrayList<>(pladser);
    }

    //Opretter add person
    public void addPlads(Plads plads){
        if (!pladser.contains(plads)){
            pladser.add(plads);
            plads.addReservation(this);
        }
    }

    //Fjerne pladsen fra reservationen
    public void removePlads(Plads plads){
        if (pladser.contains(plads)){
            pladser.remove(plads);
            plads.removeReservation(this);
        }
    }



}
