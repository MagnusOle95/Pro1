package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Medlem {
    private final String navn;
    private final String mobil;
    private final String mail;

    // aggregation --> 0..* Reservation
    private final ArrayList<Reservation> bookerRes = new ArrayList<>();

    // association --> 0..* Reservation
    final ArrayList<Reservation> makkerRes = new ArrayList<>(); // OBS: package visibility

    public Medlem(String navn, String mobil, String mail) {
        this.navn = navn;
        this.mobil = mobil;
        this.mail = mail;
    }

    public String getNavn() {
        return navn;
    }

    public String getMobil() {
        return mobil;
    }

    public String getMail() {
        return mail;
    }

    //-----------------------------------------------------

    public ArrayList<Reservation> getBookerRes() {
        return new ArrayList<>(bookerRes);
    }

    public Reservation opretBookerReservation(
            LocalDate dato, LocalTime startTid, Bane bane, Medlem makker) {
        // linker denne reservation dobbelrettet til banen og dobbeltrettet til makkeren
        Reservation reservation = new Reservation(dato, startTid, bane, makker);
        // linker denne booker til reservationen dobbeltrettet
        this.addBookerReservation(reservation);
        return reservation;
    }

    public void addBookerReservation(Reservation reservation) {
        if (!bookerRes.contains(reservation)) {
            bookerRes.add(reservation);
            reservation.setBooker(this);
        }
    }

    public void removeBookerReservation(Reservation reservation) {
        if (bookerRes.contains(reservation)) {
            bookerRes.remove(reservation);
            reservation.setBooker(null);
        }
    }

    //-----------------------------------------------------

    public ArrayList<Reservation> getMakkerRes() {
        return new ArrayList<>(makkerRes);
    }

    public void addMakkerReservation(Reservation reservation) {
        if (!makkerRes.contains(reservation)) {
            makkerRes.add(reservation);
            reservation.setMakker(this);
        }
    }

    public void removeMakkerReservation(Reservation reservation) {
        if (makkerRes.contains(reservation)) {
            makkerRes.remove(reservation);
            reservation.setMakker(null);
        }
    }

    //-----------------------------------------------------

    // S6
    public boolean harAktivReservation() {
        // TODO
        return false;
    }
}
