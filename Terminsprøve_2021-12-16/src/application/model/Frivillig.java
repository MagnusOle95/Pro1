package application.model;

import java.util.ArrayList;

public class Frivillig {

    //attributter
    private String navn;
    private String mobil;
    private int maxAntalTimer;


    //Link attributter
    ArrayList<Vagt> vagter;


    //Contruktor
    public Frivillig(String navn, String mobil, int maxAntalTimer) {
        this.navn = navn;
        this.mobil = mobil;
        this.maxAntalTimer = maxAntalTimer;
        vagter = new ArrayList<>();
    }


    //Get og set metoder
    public String getNavn() {
        return navn;
    }

    public String getMobil() {
        return mobil;
    }

    public int getMaxAntalTimer() {
        return maxAntalTimer;
    }


    //metoder
    public ArrayList<Vagt> getvagter() {
        return new ArrayList<>(vagter);
    }

    void addVagt(Vagt vagt) {
        vagter.add(vagt);
    }

    public void removevagt(Vagt vagt) {
        if (vagter.contains(vagt)) {
            vagter.remove(vagt);
        }
    }

    public int ledigeTimer() {
        int samletAntalTimer = this.maxAntalTimer;

        if (vagter != null) {
            for (Vagt v : vagter) {
                samletAntalTimer = samletAntalTimer - v.getTimer();
            }
        }
        return samletAntalTimer;
    }


    public String toString(){
        return navn + " " + mobil + " " + maxAntalTimer;
    }





}
