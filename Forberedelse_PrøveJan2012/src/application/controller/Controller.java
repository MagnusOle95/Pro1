package application.controller;


import application.model.Hold;
import application.model.Medlem;
import application.model.Tilmelding;
import storage.Storage;

public class Controller {

    //Create,add,remove,update objekter igennem gui
    public static Medlem createMedlem(String navn, String adresse, String email, int mobilNr){
        Medlem medlem = new Medlem(navn, adresse, email,mobilNr );
        Storage.addMedlem(medlem);
        return medlem;
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






    // -------------------------------------------------------------------------

    /**
     * Initializes the storage with some objects.
     */
    public static void initStorage() {
        //Her tilføges alle de ting, som skal pre sættes.

    }

    public static void init() {
        initStorage();
    }

}
