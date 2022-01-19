package storage;


import application.model.Forhindring;
import application.model.Løb;

import java.util.ArrayList;

public class Storage {

	//Arraylister
    private static ArrayList<Løb> løbArrayList = new ArrayList<>();
    private static ArrayList<Forhindring> forhindringer = new ArrayList<>();



	// -------------------------------------------------------------------------

	//get,add,remove metoder.
    public static ArrayList<Løb> getLøbArrayList(){
        return new ArrayList<>(løbArrayList);
    }

    public static void addLøb(Løb løb){
        løbArrayList.add(løb);
    }

    //--------------------------------------------------------------------------

    public static ArrayList<Forhindring> getForhindringer(){
        return new ArrayList<>(forhindringer);
    }

    public static void addForhindring(Forhindring forhindring){
        forhindringer.add(forhindring);
    }

    //--------------------------------------------------------------------------





}
