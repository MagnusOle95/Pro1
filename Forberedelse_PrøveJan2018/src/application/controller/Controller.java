package application.controller;

import application.model.Arrangement;
import application.model.Hold;
import application.model.Tutor;
import application.model.Uddannelse;
import storage.Storage;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Controller {

    //Create,add,remove,update objekter igennem gui

    public static Arrangement createArrangement(String title, LocalDate date, LocalTime startTid, LocalTime slutTid, double pris){
        Arrangement arrangement = new Arrangement(title,date ,startTid ,slutTid , pris);
        Storage.addArrangementer(arrangement);
        return arrangement;
    }

    public static Tutor createTutor(String navn, String eMail){
        Tutor tutor = new Tutor(navn,eMail );
        Storage.addTutore(tutor);
        return tutor;
    }

    public static Hold createHold(String betegnelse, String holdLeder, Uddannelse uddannelse){
        Hold hold = uddannelse.createHold(betegnelse,holdLeder);
        return hold;
    }

    public static Uddannelse createUddannelse(String navn){
        Uddannelse uddannelse = new Uddannelse(navn);
        Storage.addUddannelser(uddannelse);
        return uddannelse;
    }

    public static void addTutorTilHold(Hold hold, Tutor tutor){
        if (!hold.getTutors().contains(hold)){
            hold.addTurtor(tutor);
        }
    }

    public static void addArrangementTilTutor(Arrangement arrangement, Tutor tutor){
        //
    }

    public static ArrayList<Hold> holdUdenTutorer(Uddannelse uddannelse){
        ArrayList<Hold> holdUdenTutor = new ArrayList<>();
        for (Hold h : uddannelse.getTeams()){
            if (h.getTutors() == null){
                holdUdenTutor.add(h);
            }
        }
        return holdUdenTutor;
    }








    // -------------------------------------------------------------------------

    /**
     * Initializes the storage with some objects.
     */
    public static void initStorage() {
        //Her tilføges alle de ting, som skal pre sættes.

        //Opretter uddannelser
        Uddannelse dmu = Controller.createUddannelse("DMU");
        Uddannelse finø = Controller.createUddannelse("FINØ");

        //Opretter Hold
        Controller.createHold("1dmE17S","Margrethe Dybdahl" ,dmu);
        Controller.createHold("1dmE17T","Kristian Dorland" ,dmu);
        Controller.createHold("1dmE17U","Kell Ørhøj" ,dmu);
        Controller.createHold("1fiE17B","Karen Jensen",finø);

        //opretter tutor
        Controller.createTutor(" Anders Hansen","aaa@students.eaaa.dk");
        Controller.createTutor("Peter Jensen","ppp@students.eaaa.dk" );
        Controller.createTutor("Niels Madsen","nnn@students.eaaa.dk" );
        Controller.createTutor("Lone Andersen","lll@students.eaaa.dk");
        Controller.createTutor("Mads Miller","mmm@students.eaaa.dk");

        //opretter Arrangementer
        Controller.createArrangement("Rusfest",LocalDate.of(2017,8 ,31) ,LocalTime.of(18,00 ) ,LocalTime.of(23,30 ) ,250);
        Controller.createArrangement("Fodbold",LocalDate.of(2017,8 ,30) ,LocalTime.of(14,00 ) ,LocalTime.of(17,30 ) ,100);
        Controller.createArrangement("Brætspil",LocalDate.of(2017,8 ,29) ,LocalTime.of(12,00 ) ,LocalTime.of(16,30 ) ,25);
        Controller.createArrangement("Mindeparken",LocalDate.of(2017,8 ,30) ,LocalTime.of(18,00 ) ,LocalTime.of(22,00 ) ,25);

    }

    public static void init() {
        initStorage();
    }

}
