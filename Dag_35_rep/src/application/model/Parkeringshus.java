package application.model;

import java.lang.annotation.Target;
import java.util.ArrayList;

public class Parkeringshus {

    //Attributter
    private String adresse;
    private double saldo;

    //Link attributter
    private ArrayList<Parkeringsplads> parkeringspladser;

    //Construktor
    public Parkeringshus(String adresse){
        this.adresse = adresse;
        parkeringspladser = new ArrayList<>();
        this.saldo = 0;
    }

    //liste over parkeringspladser
    public ArrayList<Parkeringsplads> getParkeringspladser(){
        return new ArrayList<>(parkeringspladser);
    }


    //Opretter parkeringspladser.
    public Parkeringsplads createParkeringsPlads(int nummer){
        Parkeringsplads p = new Parkeringsplads(nummer,this);
        parkeringspladser.add(p);
        return p;
    }

    public void removeParkeringsplads(Parkeringsplads parkeringsplads){
        if (parkeringspladser.contains(parkeringsplads)){
            parkeringspladser.remove(parkeringsplads);
        }
    }


    //Opretter invalidParkeringspladser.
    public InvalidePlads createInvalidPlads(int nummer,double areal){
        InvalidePlads ip = new InvalidePlads(nummer,this,areal);
        parkeringspladser.add(ip);
        return ip;
    }

    public void removeInvalidPlads(InvalidePlads invalidePlads){
        if (parkeringspladser.contains(invalidePlads)){
            parkeringspladser.remove(invalidePlads);
        }
    }

    //Opgave 2, metode der finder antal ledige pladser.
    public int antalLedigePladser(){
        int antalLedigePladser = 0;
        for (Parkeringsplads plads: parkeringspladser){
            if (plads.getBil() == null){
                antalLedigePladser++;
            }
        }
        return antalLedigePladser;
    }


    //Opgave 3, søgning efter bil.
    public int findPladsMedBil(String regNummer){
        int indeks = -1;
        int i = 0;

        while (indeks == -1 && i < parkeringspladser.size()) {

            Parkeringsplads k = parkeringspladser.get(i);
            Bil b = k.getBil();

            if (b.getRegNr().equals(regNummer))
                indeks = k.getNummer();

            else
                i++;
        }

        return indeks;
    }

    //Opgave 5
    public void tilføgsaldo(double beløb){
        this.saldo = beløb;
    }

    public double getSaldo(){
        return this.saldo;
    }

    //Opgave 7
    public int findAntalBiler(Bilmærke bilmærke){
        int antal = 0;
        for (Parkeringsplads pp : parkeringspladser){
            if (pp.getBil().getBilmærke() == bilmærke){
                antal++;
            }
        }
        return antal;
    }

    public ArrayList<String> optagnePladser(){
        ArrayList<String> optagnepladser = new ArrayList<>();
        for (Parkeringsplads pp : parkeringspladser){
            if (pp.getBil() != null){
                String optagetPplads = "P nummer: " + pp.getNummer() + " Regnr: " + pp.getBil().getRegNr() + " Mærke: " + pp.getBil().getBilmærke();
                optagnepladser.add(optagetPplads);
            }
        }
        return optagnepladser;
    }



}
