package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Bane {
    private final int nummer;
    private final String baneinfo;

    // association --> 0..* Reservvation
    private final ArrayList<Reservation> reservationer = new ArrayList<>();

    public Bane(int nummer, String baneinfo) {
        this.nummer = nummer;
        this.baneinfo = baneinfo;
    }

    public int getNummer() {
        return nummer;
    }

    public String getBaneinfo() {
        return baneinfo;
    }

    //-----------------------------------------------------

    public ArrayList<Reservation> getReservationer() {
        return new ArrayList<>(reservationer);
    }

    public void addReservation(Reservation reservation) {
        if (!reservationer.contains(reservation)) {
            reservationer.add(reservation);
            reservation.setBane(this);
        }
    }

    public void removeReservation(Reservation reservation) {
        if (reservationer.contains(reservation)) {
            reservationer.remove(reservation);
            reservation.bane = this;
        }
    }

    //-----------------------------------------------------

    // S2

    /** Pre: Tiden er et helt timetal. */
    public boolean isLedig(LocalDate dato, LocalTime tid) {
        // TODO
        return false;
    }

    // S3
    public ArrayList<LocalTime> getLedigeTiderPaaDag(LocalDate dato) {
        // TODO
        return null;
    }

    // S9
//    public void addReservation(Reservation reservation) {
//        // TODO
//    }

    // Bruges i GUI
    @Override
    public String toString() {
        return nummer + " " + baneinfo;
    }
}
