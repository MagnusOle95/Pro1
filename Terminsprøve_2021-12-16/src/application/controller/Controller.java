package application.controller;

import application.model.*;
import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;

public class Controller {

    //Create,add,remove,update objekter igennem gui

    public static Festival createFestival(String navn, LocalDate fraDato, LocalDate tilDato){
        Festival festival = new Festival(navn,fraDato , tilDato);
        Storage.addfestivaler(festival);
        return festival;
    }

    public static ArrayList<Festival> getFestivaler(){
        return Storage.getFestivaler();
    }


    public static Frivillig createFrivillig(String navn, String mobil, int maxAntalTimer){
        Frivillig frivillig = new Frivillig(navn,mobil ,maxAntalTimer);
        Storage.addFrivilige(frivillig);
        return frivillig;
    }

    public static ArrayList<Frivillig> getFrivilige(){
        return Storage.getFrivilige();
    }

    public static FrivilligForening createFrivilligForening(String navn, String mobil, int maxAntalTimer, String foreningsnavn, int antalPersoner){
        FrivilligForening friviligFor = new FrivilligForening(navn,mobil ,maxAntalTimer ,foreningsnavn ,antalPersoner);
        Storage.addFrivilige(friviligFor);
        return friviligFor;
    }


    public static Job createJob(String kode, String beskrivelse, LocalDate dato, int timeHonorar, int antalTimer,Festival festival){
        Job j = festival.createJob(kode,beskrivelse , dato,timeHonorar,antalTimer);
        return j;
    }

    public static Vagt createVagt(int timer,Frivillig frivillig,Job job){
        Vagt v = job.createVagt(timer,frivillig);
        return v;
    }





    // -------------------------------------------------------------------------

    /**
     * Initializes the storage with some objects.
     */
    public static void initStorage() {
        //Her tilføges alle de ting, som skal pre sættes.

        //Festivalen
        Festival f1 = Controller.createFestival("Northside",LocalDate.of(2020,06 ,04),LocalDate.of(2020,06 ,06));

        //Frivvillige
        Frivillig fri1 = Controller.createFrivillig("Jane Jensen","12345677" ,20);
        Frivillig fri2 = Controller.createFrivillig("Lone Hansen","78787878" ,25);
        Frivillig fri3 = Controller.createFrivillig("Anders Mikkelsen","55555555" ,10);

        //Frivillige forening
        FrivilligForening frifor = Controller.createFrivilligForening("Christian Madsen","23232323" ,100 ,"Erhversakademi Aarhus" ,40);

        //Opretter jobs
        Job job1 = Controller.createJob("T1","Rengøring af toiletter" ,LocalDate.of(2020,6 ,4),100,5,f1);
        Job job2 = Controller.createJob("T2","Rengøring af toiletter" ,LocalDate.of(2020,6 ,4),100,5,f1);
        Job job3 = Controller.createJob("T3","Rengøring af toiletter" ,LocalDate.of(2020,6 ,4),100,5,f1);
        Job job4 = Controller.createJob("T4","Rengøring af toiletter" ,LocalDate.of(2020,6 ,5),100,5,f1);
        Job job5 = Controller.createJob("T5","Rengøring af toiletter" ,LocalDate.of(2020,6 ,5),100,5,f1);
        Job job6 = Controller.createJob("T6","Rengøring af toiletter" ,LocalDate.of(2020,6 ,5),100,5,f1);
        Job job7 = Controller.createJob("T7","Rengøring af toiletter" ,LocalDate.of(2020,6 ,6),100,5,f1);
        Job job8 = Controller.createJob("T8","Rengøring af toiletter" ,LocalDate.of(2020,6 ,6),100,5,f1);
        Job job9 = Controller.createJob("T9","Rengøring af toiletter" ,LocalDate.of(2020,6 ,6),100,5,f1);

    }

    public static void init() {
        initStorage();
    }
}
