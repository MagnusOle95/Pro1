package application.controller;

import application.model.*;
import storage.Storage;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Controller {

    public static Parkeringshus createParkeringshus(String adresse){
        Parkeringshus p = new Parkeringshus(adresse);
        Storage.addparkeringshus(p);
        return p;
    }

    public static Bil createBil(String regNr, Bilmærke bilmærke){
        Bil b = new Bil(regNr,bilmærke);
        Storage.addBil(b);
        return b;
    }

    public static Parkeringsplads createParkeringsPlads(int nummer, Parkeringshus Parkeringshus){
        return Parkeringshus.createParkeringsPlads(nummer);
    }

    public static InvalidePlads createinvalidePlads(int nummer, Parkeringshus parkeringshus, double areal){
        return parkeringshus.createInvalidPlads(nummer,areal);
    }


    public static void writeOptagnePladser(Parkeringshus hus, String filnavn){
        try {
            PrintWriter printWriter = new PrintWriter(filnavn);
            for (String s: hus.optagnePladser()){
                printWriter.println(s);
            }
            printWriter.flush();
            printWriter.close();
            System.out.println("Fil oprettet: " + filnavn);
        }
        catch (FileNotFoundException fnf){
            System.out.println(fnf.getMessage());
        }
    }



    //---------------------------------------------------------------------------

    public static void createSomeObjects(){
        //Opretter biler
        Bil b1 = Controller.createBil("AB 11 222",Bilmærke.FORD);
        Bil b2 = Controller.createBil("EF 33 444",Bilmærke.KIA);
        Bil b3 = Controller.createBil("BD 55 666",Bilmærke.MERCEDES);

        //Opretter parkeringshus
        Parkeringshus ph1 = Controller.createParkeringshus("Havnegade 12, 8000 Aarhus");

        //Opretter 100 parkeringspladser
        for (int i = 1; i <= 100; i++){
            Controller.createParkeringsPlads(i,ph1);
        }

        //Opretter 10 invalidparkeringspladser
        for (int i = 101; i <= 110; i++){
            Controller.createinvalidePlads(i,ph1,18);
        }

        //Tilføger bilerne til en plads i parkeringshuset.
        ph1.getParkeringspladser().get(50).setBil(b1);
        ph1.getParkeringspladser().get(67).setBil(b2);
        ph1.getParkeringspladser().get(108).setBil(b3);





    }





}
