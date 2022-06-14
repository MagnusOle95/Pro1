package collection_framework.Opgave2_Skole_Studerende.associeringen_Set;

import java.util.HashSet;

public class Skole {

    //Attributter
    private String navn;


    //Link attributer
    HashSet<Studerende> studerendes;

    //Construktor
    public Skole(String navn){
        this.navn = navn;
        this.studerendes = new HashSet<>();
    }


    //Get og set metode
    public String getNavn(){
        return this.navn;
    }

    public void setNavn(String navn){
        this.navn = navn;
    }


    //Add og remove studerende
    public void addStuderende(Studerende studerende) {
            studerendes.add(studerende);
    }

    public void removeStuderende(Studerende studerende) {
            studerendes.remove(studerende);
    }

    //Udregner gennemsnit af skolens elever.
    public double gennemsnit(){
        double karakterSum = 0;
        double antalKarakterGivet = 0;

        for (Studerende s : studerendes){
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
        for (Studerende s : studerendes){
            int k = s.getStudieNr();
            if (k == studieNr){
                stud = s;
            }
        }
        return stud;
    }


    //to String
    public String toString(){
        return this.navn;
    }


}
