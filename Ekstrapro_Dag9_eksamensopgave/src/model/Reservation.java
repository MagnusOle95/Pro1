package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation implements Comparable<Reservation> { // del af S8
    private final LocalDate dato;
    private final LocalTime startTid;

    // association --> 1 Bane
    Bane bane; // OBS: package visibility

    // aggregation --> 1 Medlem
    Medlem booker; // OBS: package visibility

    // association --> 1 Medlem
    private Medlem makker;

    public Reservation(LocalDate dato, LocalTime startTid, Bane bane, Medlem makker) {
        this.dato = dato;
        this.startTid = startTid;
        // linker denne reservation dobbeltrettet til banen
        this.setBane(bane);
        // linker denne reservation til makkeren dobbeltrettet
        this.setMakker(makker);
    }

    public LocalDate getDato() {
        return dato;
    }

    public LocalTime getStartTid() {
        return startTid;
    }

    //-----------------------------------------------------

    public Bane getBane() {
        return bane;
    }

    /** Note: Nullable param bane */
    public void setBane(Bane bane) {
        if (this.bane != bane) {
            Bane oldBane = this.bane;
            if (oldBane != null)
                oldBane.removeReservation(this);
            this.bane = bane;
            if (bane != null)
                bane.addReservation(this);
        }
    }

    //-----------------------------------------------------

    public Medlem getBooker() {
        return booker;
    }

    /** Note: Nullable param booker */
    public void setBooker(Medlem booker) {
        if (this.booker != booker) {
            Medlem oldBooker = this.booker;
            if (oldBooker != null)
                oldBooker.removeBookerReservation(this);
            this.booker = booker;
            if (booker != null)
                booker.addBookerReservation(this);
        }
    }

    //-----------------------------------------------------

    public Medlem getMakker() {
        return makker;
    }

    /** Note: Nullable param makker */
    public void setMakker(Medlem makker) {
        if (this.makker != makker) {
            Medlem oldMakker = this.makker;
            if (oldMakker != null)
                oldMakker.removeMakkerReservation(this);
            this.makker = makker;
            if (makker != null)
                makker.addMakkerReservation(this);
        }
    }

    // S8
    @Override
    public int compareTo(Reservation other) {
        // TODO
        return 0;
    }
}
