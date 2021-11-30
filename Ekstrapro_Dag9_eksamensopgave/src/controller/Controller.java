package controller;

import model.Bane;
import model.Medlem;
import model.Reservation;
import storage.Storage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Controller {

    public static Bane opretBane(int nummer, String baneInfo) {
        Bane bane = new Bane(nummer, baneInfo);
        Storage.storeBane(bane);
        return bane;
    }

    public static Medlem opretMedlem(String navn, String mobil, String mail) {
        Medlem medlem = new Medlem(navn, mobil, mail);
        Storage.storeMedlem(medlem);
        return medlem;
    }

    public static void initStorage() {
        Medlem lene = opretMedlem("Lene Mikkelsen", "12345678", "lm@msn.com");
        Medlem finn = opretMedlem("Finn Jensen", "22331144", "fj@msn.com");

        Bane bane1 = opretBane(1, "Nord/syd vendt");
        opretBane(2, "Under egetræet");
        opretBane(3, "Med tilskuerpladser");

        // Bruges i GUI
        createReservation(lene, finn, bane1, LocalDate.parse("2016-01-20"), LocalTime.of(9, 0));
        createReservation(finn, lene, bane1, LocalDate.parse("2016-01-20"), LocalTime.of(10, 0));
        createReservation(lene, finn, bane1, LocalDate.parse("2016-01-20"), LocalTime.of(11, 0));
        createReservation(finn, lene, bane1, LocalDate.parse("2016-01-20"), LocalTime.of(13, 0));
    }

    // S7
    /** Note: Nullable return value. */
    public static Reservation createReservation(
            Medlem booker, Medlem makker, Bane bane, LocalDate dato, LocalTime startTid) {
        // TODO
        return null;
    }

    // S10
    public static void writeLedigeTider(LocalDate dato, String filnavn) {
        // TODO
    }

    // bruges i GUI
    public static ArrayList<Bane> getBaner() {
        return Storage.getBaner();
    }
}