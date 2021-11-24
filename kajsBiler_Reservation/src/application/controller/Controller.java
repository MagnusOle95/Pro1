package application.controller;

import application.model.Bil;
import application.model.PrisGruppe;
import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;

public class Controller {

    public static Bil createBil (String bilNavn, String bilMærke, PrisGruppe prisGruppe, LocalDate årgang, int kilometerKørt){
        Bil bil = new Bil(bilNavn,bilMærke ,prisGruppe ,årgang ,kilometerKørt);
        Storage.addBiler(bil);
        return bil;
    }

    public static void removeBil(Bil bil){
        Storage.removeBil(bil);
    }

    public static void updateBil(Bil bil,String bilNavn, String bilMærke, PrisGruppe prisGruppe, LocalDate årgang, int kilometerKørt){
        bil.setBilNavn(bilNavn);
        bil.setBilMærke(bilMærke);
        bil.setPrisGruppe(prisGruppe);
        bil.setÅrgang(årgang);
        bil.setKilometerKørt(kilometerKørt);
    }

    public static ArrayList<Bil> getBiler(){
        return new ArrayList<>(Storage.getbiler());
    }



    //-------------------------------------------------------------------------


    public static void initStorage() {
    }
}
