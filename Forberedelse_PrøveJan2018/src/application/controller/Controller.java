package application.controller;

import application.model.Arrangement;
import application.model.Hold;
import application.model.Tutor;
import application.model.Uddannelse;
import storage.Storage;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
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

    public static ArrayList<Arrangement> getArrangementer(){
        return Storage.getArrangementer();
    }

    public static Tutor createTutor(String navn, String eMail){
        Tutor tutor = new Tutor(navn,eMail );
        Storage.addTutore(tutor);
        return tutor;
    }

    public static ArrayList<Tutor> GetTutors(){
        return Storage.getTutore();
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

    public static ArrayList<Uddannelse> getUdannelser(){
        return Storage.getUddannelser();
    }

    public static void addTutorTilHold(Hold hold, Tutor tutor){
        if (hold.getTutors().contains(tutor)){
            hold.addTurtor(tutor);
        }
    }

    public static void addArrangementTilTutor(Arrangement arrangement, Tutor tutor){
            int i = 0;
            while (i < tutor.getArrangementer().size()) {

                LocalTime  nåetTilStartTid = tutor.getArrangementer().get(i).getStartTid();
                LocalTime  nåetTilSlutTid = tutor.getArrangementer().get(i).getSlutTid();

                if (arrangement.getDate().equals(tutor.getArrangementer().get(i).getDate()) &&
                        !arrangement.getSlutTid().isBefore(nåetTilStartTid) && !arrangement.getStartTid().isAfter(nåetTilSlutTid)) {
                    throw new RuntimeException("Tider overlapper");
                }
                i++;
            }
            tutor.addArrangement(arrangement);
        }

        public static void removeArrangementFraTutor(Arrangement arrangement, Tutor tutor){
                if (tutor.getArrangementer().contains(arrangement)){
                    tutor.removeArrangement(arrangement);
                }
        }


    public static ArrayList<Hold> holdUdenTutorer(){
        ArrayList<Hold> holdUdenTutor = new ArrayList<>();
        for (Uddannelse u : Storage.getUddannelser()){
            for (Hold h : u.getTeams()){
                if (h.getTutors() == null){
                    holdUdenTutor.add(h);
                }
            }
        }
        return holdUdenTutor;
    }

    public static void tutorOversigtTilFil(String filnavn){
        try {
            PrintWriter printWriter = new PrintWriter(filnavn);
            for (Uddannelse uddannelse : getUdannelser()){
                for (Hold hold : uddannelse.getTeams()){
                    printWriter.println(hold.getUddannelse().tutorOversigt());
                }
            }
            printWriter.flush();
            printWriter.close();
            System.out.println("Filen er lavet");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Arrangement> ikkeValgteArrangementer(Tutor tutor){
        ArrayList<Arrangement> ikkeValgteArrangementer = new ArrayList<>();
        for (Arrangement a : Storage.getArrangementer()){
            if (!tutor.getArrangementer().contains(a)){
                ikkeValgteArrangementer.add(a);
            }
        }
        return ikkeValgteArrangementer;
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
        Hold hold1 = Controller.createHold("1dmE17S","Margrethe Dybdahl" ,dmu);
        Hold hold2 = Controller.createHold("1dmE17T","Kristian Dorland" ,dmu);
        Hold hold3 = Controller.createHold("1dmE17U","Kell Ørhøj" ,dmu);
        Hold hold4 = Controller.createHold("1fiE17B","Karen Jensen",finø);

        //opretter tutor
        Tutor tutor1 = Controller.createTutor(" Anders Hansen","aaa@students.eaaa.dk");
        Tutor tutor2 = Controller.createTutor("Peter Jensen","ppp@students.eaaa.dk" );
        Tutor tutor3 = Controller.createTutor("Niels Madsen","nnn@students.eaaa.dk" );
        Tutor tutor4 = Controller.createTutor("Lone Andersen","lll@students.eaaa.dk");
        Tutor tutor5 = Controller.createTutor("Mads Miller","mmm@students.eaaa.dk");

        //opretter Arrangementer
        Arrangement arrangement1 = Controller.createArrangement("Rusfest",LocalDate.of(2017,8 ,31) ,LocalTime.of(18,00 ) ,LocalTime.of(23,30 ) ,250);
        Arrangement arrangement2 = Controller.createArrangement("Fodbold",LocalDate.of(2017,8 ,30) ,LocalTime.of(14,00 ) ,LocalTime.of(17,30 ) ,100);
        Arrangement arrangement3 = Controller.createArrangement("Brætspil",LocalDate.of(2017,8 ,29) ,LocalTime.of(12,00 ) ,LocalTime.of(16,30 ) ,25);
        Arrangement arrangement4 = Controller.createArrangement("Mindeparken",LocalDate.of(2017,8 ,30) ,LocalTime.of(18,00 ) ,LocalTime.of(22,00 ) ,25);

        //Tiklføger tutor til hold
        Controller.addTutorTilHold(hold1,tutor1);
        Controller.addTutorTilHold(hold1,tutor4);

        Controller.addTutorTilHold(hold3,tutor2);
        Controller.addTutorTilHold(hold3,tutor3);

        Controller.addTutorTilHold(hold4,tutor5);

        //Tilføger arrangementer til tutor
        Controller.addArrangementTilTutor(arrangement1,tutor1);
        Controller.addArrangementTilTutor(arrangement1,tutor2);
        Controller.addArrangementTilTutor(arrangement1,tutor5);

        Controller.addArrangementTilTutor(arrangement2,tutor3);

        Controller.addArrangementTilTutor(arrangement3,tutor3);
        Controller.addArrangementTilTutor(arrangement3,tutor4);

        Controller.addArrangementTilTutor(arrangement4,tutor1);
        Controller.addArrangementTilTutor(arrangement4,tutor5);


    }

    public static void init() {
        initStorage();
    }

}
