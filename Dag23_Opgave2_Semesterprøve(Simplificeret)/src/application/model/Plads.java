package application.model;

import java.util.ArrayList;

public class Plads {

    //Attributer
    private int nr;

    //Link attributter
    private Område område;
    ArrayList<Reservation> reservationer;


    //Construktor
    public Plads(int nr, Område område){
        this.nr = nr;
        this.område = område;
        reservationer = new ArrayList<>();
    }

    //Get og set metoder
    public int getNr(){
        return this.nr;
    }
    public void setNr(int nr){
        this.nr = nr;
    }

    public Område getOmråde(){
        return this.område;
    }
    public void setOmråde(Område område){
        this.område = område;
    }

    //Opretter get reservationer//
    public ArrayList<Reservation> getReservationer(){
        return new ArrayList<>(reservationer);
    }

    //Opretter addReservation
    public void addReservation(Reservation reservation){
        if (!reservationer.contains(reservation)){
            reservationer.add(reservation);
            reservation.addPlads(this);
        }
    }

    //Fjerne reservation fra plads
    public void removeReservation(Reservation reservation){
        if (reservationer.contains(reservation)){
            reservationer.remove(reservation);
            reservation.removePlads(this);
        }
    }



}
