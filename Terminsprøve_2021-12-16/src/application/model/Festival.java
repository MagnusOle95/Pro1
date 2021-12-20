package application.model;

import storage.Storage;

import java.time.LocalDate;
import java.util.ArrayList;

public class Festival {

	//attributter
    private String navn;
    private LocalDate fraDato;
    private LocalDate tilDato;


	//Link attributter
    ArrayList<Job> jobs;

	//Contruktor
    public Festival(String navn, LocalDate fraDato, LocalDate tilDato) {
        this.navn = navn;
        this.fraDato = fraDato;
        this.tilDato = tilDato;
        jobs = new ArrayList<>();
    }


    //Get og set metoder
    public String getNavn() {
        return navn;
    }

    public LocalDate getFraDato() {
        return fraDato;
    }

    public LocalDate getTilDato() {
        return tilDato;
    }


    //Create,remove,and get jobs
    public Job createJob(String kode, String beskrivelse, LocalDate dato, int timeHonorar, int antalTimer){
        Job j = new Job(kode,beskrivelse ,dato ,timeHonorar ,antalTimer);
        jobs.add(j);
        return j;
    }

    public ArrayList<Job> getJobs(){
        return new ArrayList<>(jobs);
    }

    public void removeJob(Job job){
        if (jobs.contains(job)){
            jobs.remove(job);
        }
    }

    //Opgave 1
    public int budgetteretJobUdgift(){
        int pris = 0;
        for (Job j : jobs){
            pris += j.getAntalTimer() * j.getTimeHonorar();
        }
        return pris;
    }

    //Opgave 2
    public int realiseretJobUdgift(){
        int pris = 0;
        for (Job j : jobs){
            for (Vagt v : j.getvagter()){
                pris += v.getTimer() * j.getTimeHonorar();
            }
        }
        return pris;
    }

    //Fatter nada opgave 8
    public int gaverTilFrivilige(){
        Storage.getFrivilige();
        return -1;
    }


    public String toString(){
        return navn + " " + "\nStartDato: " + fraDato + " " + "\nSlutdato: " + tilDato;
    }
}
