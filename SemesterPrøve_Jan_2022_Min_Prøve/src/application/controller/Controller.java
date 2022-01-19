package application.controller;

import application.model.Forhindring;
import application.model.Løb;
import application.model.Note;
import application.model.Tilmelding;
import com.sun.scenario.effect.Offset;
import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;

public class Controller {

    //Create,delete,update og get metoder.
    public static Løb createLøb(LocalDate dato, String sted, int normalPris, LocalDate earlyBirdDate, int earlyBirdPris){
        Løb løb = new Løb(dato,sted,normalPris,earlyBirdDate,earlyBirdPris);
        Storage.addLøb(løb);
        return løb;
    }

    public static ArrayList<Løb> getArraylistLøb(){
        return Storage.getLøbArrayList();
    }

    public static void addForhindringTilLøb(Løb løb,Forhindring forhindring){
        løb.addForhindring(forhindring);
    }

    //--------------------------------------------------------------------------
    public static Tilmelding createTilmelding(String navn, boolean kvinde, LocalDate tilmeldingsDato, int løbeNummer,Løb løb){
        Tilmelding tilmelding = løb.createTilmelding(navn,kvinde ,tilmeldingsDato ,løbeNummer);
        return tilmelding;
    }

    public static ArrayList<Tilmelding> getArraylistTilmeldinger(Løb løb){
        return løb.getTilmeldinger();
    }

    public static void setLøbstidPåTilmelding(Tilmelding tilmelding, int løbstid){
        tilmelding.setLøbstid(løbstid);
    }

    //--------------------------------------------------------------------------
    public static void registerStrafPåForhindring(String navnForhindring, int strafSekunder,Tilmelding tilmelding){
        tilmelding.registrerStrafPåForhindring(navnForhindring,strafSekunder);
    }

    public static ArrayList<Note> getNoter(Tilmelding tilmelding){
        return tilmelding.getnoter();
    }

    //--------------------------------------------------------------------------
    public static Forhindring createForhindring(int nummer, String navn){
        Forhindring forhindring = new Forhindring(nummer,navn);
        Storage.addForhindring(forhindring);
        return forhindring;
    }

    public static ArrayList<Forhindring> getForhindringer(){
        return Storage.getForhindringer();
    }



    // -------------------------------------------------------------------------
    /**
     * Initializes the storage with some objects.
     */

    public static void initStorage() {
        //Opretter løb
        Løb løb = createLøb(LocalDate.of(2021,8 ,23),"Halse Bakker",
                500,LocalDate.of(2021,6 ,23), 350);


        //Opretter forhindringer
        Forhindring f1 = Controller.createForhindring(1,"Stejl bakke" );
        Forhindring f2 = Controller.createForhindring(2,"Meget stejl bakke");
        Forhindring f3 = Controller.createForhindring(3,"Mudderpøl");
        Forhindring f4 = Controller.createForhindring(4,"Over mur");
        Forhindring f5 = Controller.createForhindring(5,"Under gitter");


        //Tilføger forhindring til løb.
        Controller.addForhindringTilLøb(løb,f1);
        Controller.addForhindringTilLøb(løb,f2);
        Controller.addForhindringTilLøb(løb,f3);
        Controller.addForhindringTilLøb(løb,f4);
        Controller.addForhindringTilLøb(løb,f5);


        //Opretter tilmeldingerne.
        Tilmelding t1 = Controller.createTilmelding("Sune",false ,LocalDate.of(2021,5 ,12 ) ,1 ,løb);
        Tilmelding t2 = Controller.createTilmelding("Anne",true ,LocalDate.of(2021,7 ,12 ) ,2 ,løb);
        Tilmelding t3 = Controller.createTilmelding("Bent",false ,LocalDate.of(2021,7 ,14 ) ,3 ,løb);
        Tilmelding t4 = Controller.createTilmelding("Ole",false ,LocalDate.of(2021,5 ,10 ) ,4 ,løb);
        Tilmelding t5 = Controller.createTilmelding("Lars",false ,LocalDate.of(2021,4 ,8 ) ,5 ,løb);
        Tilmelding t6 = Controller.createTilmelding("Mette",true ,LocalDate.of(2021,8 ,20 ) ,6 ,løb);


        //Sætter løbstider og straf på tilmeldinger/Løbere
        Controller.setLøbstidPåTilmelding(t1,8733);

        Controller.setLøbstidPåTilmelding(t2,9132);
        Controller.registerStrafPåForhindring("Over mur",90 ,t2);

        Controller.setLøbstidPåTilmelding(t4,8280);
        Controller.registerStrafPåForhindring("Over mur",220,t4);

        Controller.setLøbstidPåTilmelding(t5,9126);
        Controller.registerStrafPåForhindring("Over mur",180 ,t5);
        Controller.registerStrafPåForhindring("Under gitter",410,t5);

        Controller.setLøbstidPåTilmelding(t6,12732);








    }

}
