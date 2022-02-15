package Opgave3_Comparable_TreeSET;

import java.util.ArrayList;

public class Studerende implements Comparable<Studerende> {

    //Attributer
    private int studieNr;
    private String navn;
    private ArrayList<Integer> karakters;


    //Construktor
    public Studerende(int studieNr, String navn){
        this.studieNr = studieNr;
        this.navn = navn;
        karakters = new ArrayList<>();
    }

    public int getStudieNr() {
        return studieNr;
    }

    public void setStudieNr(int studieNr) {
        this.studieNr = studieNr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    //Add og get karakter
    public void addKarater(int karakter){
        this.karakters.add(karakter);
    }

    public ArrayList<Integer> getKarakters(){
        return new ArrayList<>(karakters);
    }

    //ToString
    public String toString(){
        return this.studieNr + " " + this.navn + " " + getKarakters();
    }


    @Override
    public int compareTo(Studerende o) {
        return studieNr - o.getStudieNr();
    }
}


