package application.model;

import java.util.ArrayList;

public class Arrangement {

    //Attributter
    private String navn;
    private boolean offentlig;

    //Link attributter
    ArrayList<Reservation> reservationer;

    //Construktor
    public Arrangement(String navn, Boolean offentlig){
        this.navn = navn;
        this.offentlig = offentlig;
        reservationer = new ArrayList<>();
    }

    //Get of set metoder
    public String getNavn(){
        return this.navn;
    }
    public void setNavn(String navn){
        this.navn = navn;
    }

    public boolean getOffentlig(){
        return this.offentlig;
    }
    public void setOffentlig(Boolean offentlig){
        this.offentlig = offentlig;
    }

    //Opretter get reservationer//
    public ArrayList<Reservation> getReservationer(){
        return new ArrayList<>(reservationer);
    }

    //Opretter ad reservationer
    public void addReservationer(Reservation reservation){
        if (!reservationer.contains(reservation)){
            reservationer.add(reservation);
        }
    }

    //Opretter remove reservation
    public void removeReservation(Reservation reservation){
        if (reservationer.contains(reservation)){
            reservationer.remove(reservation);
        }
    }



}
