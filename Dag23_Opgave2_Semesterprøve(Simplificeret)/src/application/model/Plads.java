package application.model;

import java.util.ArrayList;

public class Plads {

    //Attributer
    private int nr;
    private static int standartTimePris;

    //Link attributter
    private Område område;
    ArrayList<Reservation> reservationer;


    //Construktor
    public Plads(int nr, Område område){
        this.nr = nr;
        this.område = område;
        reservationer = new ArrayList<>();
        this.standartTimePris = 50;
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

    //Get og set metoder til standart timepris
    public int getStandardTimePris(){
        return this.standartTimePris;
    }

    public void setStandartTimePris(int standartTimePris){
        this.standartTimePris = standartTimePris;
    }

    public double pris(int timer){
        double samletPris = standartTimePris * timer;

        if (område == Område.VIP){
            samletPris = samletPris * 1.25;
        }
        if (område == Område.BØRNE){
            samletPris = samletPris * 0.80;
        }
        if (område == Område.BØRNE){
            samletPris = samletPris * 1.10;
        }
        return samletPris;
    }




}
