package storage;


import application.model.Arrangement;
import application.model.Tutor;
import application.model.Uddannelse;

import java.util.ArrayList;

public class Storage {

	//Arraylister
    private static ArrayList<Uddannelse> uddannelser = new ArrayList<>();
    private static ArrayList<Tutor> tutore = new ArrayList<>();
    private static ArrayList<Arrangement> arrangementer = new ArrayList<>();


	// -------------------------------------------------------------------------
	//get,add,remove
    public static void addUddannelser(Uddannelse uddannelse){
        uddannelser.add(uddannelse);
    }

    public static ArrayList<Uddannelse> getUddannelser(){
        return new ArrayList<>(uddannelser);
    }


	// -------------------------------------------------------------------------
	//get,add,remove

    public static void addTutore(Tutor tutor){
        tutore.add(tutor);
    }

    public static ArrayList<Tutor> getTutore(){
        return new ArrayList<>(tutore);
    }

    //--------------------------------------------------------------------------

    public static void addArrangementer(Arrangement arrangement){
        arrangementer.add(arrangement);
    }

    public static ArrayList<Arrangement> getArrangementer(){
        return new ArrayList<>(arrangementer);
    }


	// -------------------------------------------------------------------------


}
