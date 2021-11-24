package storage;

import application.model.Bil;
import application.model.Reservation;

import java.util.ArrayList;

public class Storage {
	private static ArrayList<Bil> biler = new ArrayList<>();
	private static ArrayList<Reservation> reservationer = new ArrayList<>();

	// -------------------------------------------------------------------------

	public static ArrayList<Bil> getbiler() {
		return new ArrayList<>(biler);
	}

	public static void addBiler(Bil bil) {
		biler.add(bil);
	}

	public static void removeBil(Bil bil) {
		biler.remove(bil);
	}
    //---------------------------------------------------------------------------

    public static ArrayList<Reservation> getReservationer(){
        return new ArrayList<>(reservationer);
    }

    public static void addReservationer(Reservation reservation){
        reservationer.add(reservation);
    }

    public static void removeReservation(Reservation reservation){
        reservationer.remove(reservation);
    }

}
