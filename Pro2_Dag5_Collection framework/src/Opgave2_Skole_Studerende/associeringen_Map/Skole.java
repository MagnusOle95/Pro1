package Opgave2_Skole_Studerende.associeringen_Map;

import java.util.ArrayList;
import java.util.HashMap;

public class Skole {

    //Attributter
    private String navn;


    //Link attributer
    HashMap<Integer,Studerende> studerendes;

    //Construktor
    public Skole(String navn){
        this.navn = navn;
        this.studerendes = new HashMap();
    }


    //Get og set metode
    public String getNavn(){
        return this.navn;
    }

    public void setNavn(String navn){
        this.navn = navn;
    }


    //Add og remove studerende
    public void addStuderende(Integer studieNr,Studerende studerende) {
        if (!studerendes.containsKey(studieNr)) {
            studerendes.put(studieNr,studerende);
            studerende.setStudieNr(studieNr);
        }
    }

    public void removeStuderende(int studieNr) {
        if (studerendes.containsKey(studieNr)) {
            studerendes.remove(studieNr);
        }
    }

    //Udregner gennemsnit af skolens elever.
    public double gennemsnit(){
        double karakterSum = 0;
        double antalKarakterGivet = 0;

        for (Studerende s : studerendes.values()){
            for (int k : s.getKarakters()){
                antalKarakterGivet++;
                karakterSum += k;
            }
        }
        return karakterSum / antalKarakterGivet;
    }


    //finder studerende ud fra studie nummer
    public Studerende findStuderende(int studieNr){
            Studerende stud = null;
            if (studerendes.containsKey(studieNr)){
               stud = studerendes.get(studieNr);
            }
            return stud;
        }


    //to String
    public String toString(){
        return this.navn;
    }


}
