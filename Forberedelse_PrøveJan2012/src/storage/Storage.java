package storage;


import application.model.Hold;
import application.model.Medlem;

import java.util.ArrayList;

public class Storage {

	//Arraylister
    private static ArrayList<Medlem> medlemmer = new ArrayList<>();
    private static ArrayList<Hold> alleHold = new ArrayList<>();


	// -------------------------------------------------------------------------
	//get,add,remove
    private static ArrayList<Medlem> getmedlemmer(){
        return new ArrayList<>(medlemmer);
    }

    public static void addMedlem(Medlem medlem){
        medlemmer.add(medlem);
    }


	// -------------------------------------------------------------------------
	//get,add,remove
    private static ArrayList<Hold> getAlleHold(){
        return new ArrayList<>(alleHold);
    }

    public static void addHold(Hold hold){
        alleHold.add(hold);
    }


	// -------------------------------------------------------------------------


}
