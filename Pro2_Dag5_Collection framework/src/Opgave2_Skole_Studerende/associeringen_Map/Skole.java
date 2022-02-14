package Opgave2_Skole_Studerende.associeringen_Map;

import java.util.ArrayList;

public class Skole {

    //Attributter
    private String navn;


    //Link attributer
    ArrayList<Studerende> studerendes;

    //Construktor
    public Skole(String navn){
        this.navn = navn;
        this.studerendes = new ArrayList<>();
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
        if (!studerendes.contains(studerende)) {
            studerendes.add(studerende);
        }
    }

    public void removeStuderende(Studerende studerende) {
        if (studerendes.contains(studerende)) {
            studerendes.remove(studerende);
        }
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
            int i = 0;
            while (stud == null && i < studerendes.size()) {
                int k = studerendes.get(i).getStudieNr();
                if (k == studieNr)
                    stud = studerendes.get(i);
                else
                    i++;
            }
            return stud;
        }


    //to String
    public String toString(){
        return this.navn;
    }


}
