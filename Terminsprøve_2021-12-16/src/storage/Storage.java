package storage;

import Gui.application.model.Company;
import Gui.application.model.Employee;
import application.model.Festival;
import application.model.Frivillig;

import java.util.ArrayList;

public class Storage {

	//Arraylister
    private static ArrayList<Festival> festivaler = new ArrayList<>();
    private static ArrayList<Frivillig> frivillige = new ArrayList<>();


	// -------------------------------------------------------------------------
	//get,add festivaler
    public static void addfestivaler(Festival festival){
        festivaler.add(festival);
    }

    public static ArrayList<Festival> getFestivaler(){
        return new ArrayList<Festival>(festivaler);
    }


	// -------------------------------------------------------------------------
	//get,add, frivilige
    public static void addFrivilige(Frivillig frivillig){
        frivillige.add(frivillig);
    }

    public static ArrayList<Frivillig> getFrivilige(){
        return new ArrayList<Frivillig>(frivillige);
    }

	// -------------------------------------------------------------------------


}
