package storage;

import application.model.*;

import java.util.ArrayList;

public class Storage {

    private static ArrayList<Konferrence> konferrencer = new ArrayList<>();
    private static ArrayList<Hotel> hoteller = new ArrayList<>();
    private static ArrayList<Deltager> deltagere = new ArrayList<>();


    /////////////////////////////////////////////////////////////////////////////////////
    public static ArrayList<Konferrence> getKonferrencer(){
        return new ArrayList<Konferrence>(konferrencer);
    }
    public static void addKonferrence(Konferrence konferrence){
        konferrencer.add(konferrence);
    }
    public static void removeKonferrence(Konferrence konferrence){
        konferrencer.remove(konferrence);
    }

    /////////////////////////////////////////////////////////////////////////////////////
    public static ArrayList<Hotel> getHoteller(){
        return new ArrayList<>(hoteller);
    }
    public static void addHotel(Hotel hotel){
        hoteller.add(hotel);
    }
    public static void removeHotel(Hotel hotel){
        hoteller.remove(hotel);
    }

    /////////////////////////////////////////////////////////////////////////////////////
    public static ArrayList<Deltager> getDeltagere(){
        return new ArrayList<Deltager>(deltagere);
    }
    public static void addDeltager(Deltager deltager){
        deltagere.add(deltager);
    }
    public static void removeDeltager(Deltager deltager){
        deltagere.remove(deltager);
    }

    //////////////////////////////////////////////////////////////////////////////////




}
