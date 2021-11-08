package Opgave4;

public class Kollegie {

    //Attributer
    private String navn;
    private String adresse;

    //Link attributer

    //Constructor
    public Kollegie(String navn, String adresse){
        this.navn = navn;
        this.adresse = adresse;
    }

    //Get metoder
    public String getName(){
        return this.navn;
    }

    public String getAdresse(){
        return this.adresse;
    }

    //Set metoder
    public void setNavn(String navn){
        this.navn = navn;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }



}
