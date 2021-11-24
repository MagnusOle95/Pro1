package application.controller;

import application.model.Arrangement;
import application.model.Område;
import application.model.Plads;
import application.model.Reservation;
import storage.Storage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Controller {

    public static Arrangement createArrangement(String navn, Boolean offentlig){
        Arrangement arrangement = new Arrangement(navn, offentlig);
        Storage.addArrangement(arrangement);
        return arrangement;
    }

    public static void removeArrangement(Arrangement arrangement){
        Storage.removeArrangement(arrangement);
    }


    //---------------------------------------------------------------------------------

    public static Plads createPlads(int nr, Område område){
        Plads plads = new Plads(nr,område );
        Storage.addPlads(plads);
        return plads;
    }

    public static void addPladsToReservation (Plads plads, Reservation reservation){
        reservation.addPlads(plads);
    }

    public static void removePladsFromReservation(Plads plads, Reservation reservation){
        reservation.removePlads(plads);
    }

    public static void removePladsFromStorage(Plads plads){
        Storage.removePlads(plads);
    }

    //----------------------------------------------------------------------------------

    public static Reservation createReservation(LocalDateTime start, LocalDateTime slut){
        Reservation reservation = new Reservation(start,slut);
        Storage.addReservation(reservation);
        return reservation;
    }

    public static void addReservationToPlads(Reservation reservation, Plads plads){
        plads.addReservation(reservation);
    }

    public static void removeReservationfromPlads(Reservation reservation, Plads plads){
        plads.removeReservation(reservation);
    }

    public static void removeReservationFromStorage(Reservation reservation){
        Storage.removeReservation(reservation);
    }


    public static void addReservationToArrangement(Arrangement arrangement,Reservation reservation){
        arrangement.addReservationer(reservation);
    }

    public static void removeReservationFromArrangement(Arrangement arrangement, Reservation reservation){
        arrangement.removeReservation(reservation);
    }

    public static ArrayList<Reservation> getReservationer(){
        return new ArrayList<>(Storage.getReservationer());
    }


    public static void initStorage(){
        Plads p1 = Controller.createPlads(1,Område.STANDARD);

    }
//Lav init færdig og kig på if sætninger i controller.


}
