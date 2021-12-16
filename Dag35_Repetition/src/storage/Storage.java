package storage;

import application.model.Bil;
import application.model.Parkeringshus;
import application.model.Parkeringsplads;

import java.util.ArrayList;

public class Storage {

    private static ArrayList<Bil> biler = new ArrayList<>();
    private static ArrayList<Parkeringshus> parkeringshuse = new ArrayList<>();

    //----------------------------------------------------------------------------

    public static ArrayList<Bil> getBiler(){
        return new ArrayList<>(biler);
    }

    public static void addBil(Bil bil){
        biler.add(bil);
    }

    //-----------------------------------------------------------------------
    public static ArrayList<Parkeringshus> getParkeringshuse(){
        return new ArrayList<>(parkeringshuse);
    }

    public static void addparkeringshus(Parkeringshus parkeringshus){
        parkeringshuse.add(parkeringshus);
    }

    //-----------------------------------------------------------------------



}
