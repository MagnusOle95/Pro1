package Opgave_4_Personeksempel;

import javax.naming.Name;
import java.security.KeyStore;
import java.security.PrivateKey;

public class Person {
    //attributer, der beskriver den ansatte//
    private String navn;
    private String adresse;
    private double månedløn;
    private int antalvirkomheder;


    //Constructor når man opretter personen//
    public Person(String inputnavn,String inputadresse,int inputAntalvirksomheder,double inputmånedsløn){
        navn = inputnavn;
        adresse = inputadresse;
        månedløn = inputmånedsløn;
        antalvirkomheder = inputAntalvirksomheder;

    }

    //****************************************************************************************

    //sætter navnet eller, sætter "navn" til det nye indput//
    public void setNavn(String inputname){
        navn = inputname;
    }

    //retunere navnet, når der forespørgeres getname//
    public String getNavn() {
        return navn;
    }


    //***************************************************************************************


    //sætter adressen, eller ændre "adresse" til det nye indput//

    public void setAdresse(String inputAdresse){
        adresse = inputAdresse;
    }

    //retunere adressen, når der forespørges getadresse//
    public String getAdresse(){
        return adresse;
    }


    //*****************************************************************************************


    //sætter månedsløn,eller ændre "månedsløn" til det nye indput//
    public void setMånedløn(double inputmånedsløn){
        månedløn = inputmånedsløn;
    }

    //retunere månedsløn, når der forespørges getmånedsløn//
    public double getmånedløn(){
        return månedløn;
    }


    //*******************************************************************************************


    //Sætter antalfirmaer før dette, altså antalfirmaer til det nye input//
    public void setAntalvirkomheder(int inputantalVirksomHeder){
        antalvirkomheder = inputantalVirksomHeder;
    }

    //retunere "antalvirksomheder" når der forespørges getantalvirksomheder//
    public int getAntalvirkomheder(){
        return antalvirkomheder;
    }

    //Ny virksomhed, altså medarbejderen er belevet ansat i en ny virksomhed//
    public void ny_arbejdsplads(){
    antalvirkomheder = antalvirkomheder + 1;
    }


    //******************************************************************************************



    //metoden, der printer personens information ud//
    public void printPerson(){
        System.out.println("**************************");
        System.out.println("Navn " + navn);
        System.out.println("Adresse " + adresse);
        System.out.println("Antal firmaer " + antalvirkomheder);
        System.out.println("månedsløn " + månedløn + "kr");
        System.out.println("Årsløn med feriepenge " + (månedløn*1.025)*12 + " kr");
        System.out.println("***************************");
        System.out.println("   ");
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////




}

