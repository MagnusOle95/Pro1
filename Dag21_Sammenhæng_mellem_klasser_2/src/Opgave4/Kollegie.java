package Opgave4;

import java.util.ArrayList;

public class Kollegie {

    //Attributer
    private String navn;
    private String adresse;

    //Link attributer
    ArrayList<Bolig> boliger;

    //Constructor
    public Kollegie(String navn, String adresse){
        this.navn = navn;
        this.adresse = adresse;
        boliger = new ArrayList<>();
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

    //Create metode til bolig
    public Bolig createBolig(int kvm, String adresse, int prismaaned){
        Bolig b = new Bolig(kvm,adresse ,prismaaned);
            boliger.add(b);
            return b;
    }

    //add metode til bolig
    public void addBolig(Bolig bolig){
        if (!boliger.contains(bolig)){
            boliger.add(bolig);
        }
    }

    //Slet metode til bolig
    public void removeBolig(Bolig bolig){
        if (boliger.contains(bolig)){
            boliger.remove(bolig);
        }
    }

    //Retunere bolig i et nyt array
    public ArrayList<Bolig> getBoliger(){
        return new ArrayList<>(boliger);
    }





}
