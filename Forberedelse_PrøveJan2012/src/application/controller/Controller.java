package application.controller;


import application.model.Hold;
import application.model.Medlem;
import application.model.Tilmelding;
import storage.Storage;

import java.util.ArrayList;

public class Controller {

    //Create,add,remove,update objekter igennem gui
    public static Medlem createMedlem(String navn, String adresse, String email, int mobilNr){
        Medlem medlem = new Medlem(navn, adresse, email,mobilNr );
        Storage.indsætMedlem(medlem);
        return medlem;
    }

    public static ArrayList<Medlem> getMedlemmer(){
        return Storage.getmedlemmer();
    }


    public static Tilmelding createTilmelding(boolean aktiv, boolean VIPmedlem, Medlem medlem, Hold hold){
        Tilmelding tilmelding = hold.createTilmelding(aktiv, VIPmedlem,medlem);
        return tilmelding;
    }


    public static Hold createHold(String navn, String diciplin, int maxAntal){
        Hold hold = new Hold(navn,diciplin ,maxAntal);
        Storage.addHold(hold);
        return hold;
    }

    public static ArrayList<Hold> getHold(){
        return Storage.getAlleHold();
    }


    public static void updateHold(Hold hold, String navn, String disciplin, int maxAntal){
        hold.setNavn(navn);
        hold.setDiciplin(disciplin);
        hold.setMaxAntal(maxAntal);
    }

    public static void updateMedlem(Medlem medlem,String navn, String adresse, String email, int tlfNr){
        medlem.setNavn(navn);
        medlem.setAdresse(adresse);
        medlem.setEmail(email);
        medlem.setMobilNr(tlfNr);
    }

    public static ArrayList<Hold> findStoreHold(int antal){
        ArrayList<Hold> storeHold = new ArrayList<>();
        ArrayList<Hold> alleHold = Storage.getAlleHold();
        for (Hold h : alleHold){
            if (h.getMaxAntal() >= antal){
                storeHold.add(h);
            }
        }
        return storeHold;
    }




    // -------------------------------------------------------------------------

    /**
     * Initializes the storage with some objects.
     */
    public static void initStorage() {
        //Her tilføges alle de ting, som skal pre sættes.
        Medlem m1 = Controller.createMedlem("Frank Jensen","Rusvej 23" ,"Email.com" ,23232323);
        Medlem m2 = Controller.createMedlem("Jan hansen", "Risdals 22","Hotmail.com",00220022);
        Medlem m3 = Controller.createMedlem("Gert hansen","Gurli vej 2" ,"hugo@hotmail.com" ,01010101);
        Medlem m4 = Controller.createMedlem("Juhu bertson","Jumsevej 23" ,"Juhuos@gmail.com" ,28765496);
        Medlem m5 = Controller.createMedlem("Jens hansen","Rusvej 2 " ,"Jens@Yahoo.com" ,89898989);

        Hold h1 = Controller.createHold("Booleans","Styrkeløft" ,30);
        Hold h2 = Controller.createHold("De svage","børne VægtLøftning" , 12);

        Tilmelding t1 = Controller.createTilmelding(true,true ,m1 ,h1);
        Tilmelding t2 = Controller.createTilmelding(true,true ,m2 ,h1);
        Tilmelding t3 = Controller.createTilmelding(true,false ,m3 ,h1);
        Tilmelding t4 = Controller.createTilmelding(true,true ,m4 ,h2);
        Tilmelding t5 = Controller.createTilmelding(true,false ,m5 ,h2);

    }
}
