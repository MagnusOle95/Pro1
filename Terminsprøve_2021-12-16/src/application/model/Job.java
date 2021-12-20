package application.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Job {

    //attributter
    private String kode;
    private String beskrivelse;
    private LocalDate dato;
    private int timeHonorar;
    private int antalTimer;


    //Link attributter
    ArrayList<Vagt> vagter;


    //Contruktor
    Job(String kode, String beskrivelse, LocalDate dato, int timeHonorar, int antalTimer) {
        this.kode = kode;
        this.beskrivelse = beskrivelse;
        this.dato = dato;
        this.timeHonorar = timeHonorar;
        this.antalTimer = antalTimer;
        vagter = new ArrayList<>();
    }


    //Get og set metoder
    public String getKode() {
        return kode;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public LocalDate getDato() {
        return dato;
    }

    public int getTimeHonorar() {
        return timeHonorar;
    }

    public int getAntalTimer() {
        return antalTimer;
    }


    //Create,remove,get vagter
    public Vagt createVagt(int timer,Frivillig frivillig){
        if (frivillig.ledigeTimer() >= timer && this.ikkeBesatteTimer() >= timer) {
            Vagt v = new Vagt(timer, this, frivillig);
            vagter.add(v);
            return v;
        }else{
            throw new RuntimeException("Vagtens er enten for lang til den frivilige, eller for lang i forhold til jobbet");
        }
    }

    public ArrayList<Vagt> getvagter(){
        return new ArrayList<>(vagter);
    }

    public void removeVagt(Vagt vagt){
        if (vagter.contains(vagt)){
            vagter.remove(vagt);
            vagt.getFrivilig().removevagt(vagt);
        }
    }

    public int ikkeBesatteTimer(){
        int ikkeBesatteTimer = this.antalTimer;

            if (vagter != null) {
                for (Vagt v : vagter) {
                    ikkeBesatteTimer = ikkeBesatteTimer - v.getTimer();
                }
            }
            return ikkeBesatteTimer;
        }



}
