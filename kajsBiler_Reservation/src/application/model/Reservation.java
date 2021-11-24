package application.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reservation {

    private LocalDate reservationsStart;
    private LocalDate reservationsSlut;
    private double pris;
    private Kunde kunde;

    public Reservation(LocalDate reservationsStart, LocalDate reservationsSlut,Kunde kunde) {
        this.reservationsStart = reservationsStart;
        this.reservationsSlut = reservationsSlut;
        this.kunde = kunde;
    }


    public LocalDate getReservationsStart() {
        return reservationsStart;
    }

    public void setReservationsStart(LocalDate reservationsStart) {
        this.reservationsStart = reservationsStart;
    }

    public LocalDate getReservationsSlut() {
        return reservationsSlut;
    }

    public void setReservationsSlut(LocalDate reservationsSlut) {
        this.reservationsSlut = reservationsSlut;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public Kunde getKunde() {
        return kunde;
    }

}
