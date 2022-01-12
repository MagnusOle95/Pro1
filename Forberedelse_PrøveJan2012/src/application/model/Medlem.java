package application.model;

import java.util.ArrayList;

public class Medlem {

	//attributter
    private String navn;
    private String adresse;
    private String email;
    private int mobilNr;


	//Link attributter
    ArrayList<Tilmelding> tilmeldinger;

	//Contruktor
    public Medlem(String navn, String adresse, String email, int mobilNr){
        this.navn = navn;
        this.adresse = adresse;
        this.email = email;
        this.mobilNr = mobilNr;
        tilmeldinger = new ArrayList<>();
    }



	//Get og set metoder
    public String getNavn(){
        return this.navn;
    }

    public void setNavn(String navn){
        this.navn = navn;
    }


    public String getadresse(){
        return this.adresse;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public int getMobilNr() {
        return mobilNr;
    }

    public void setMobilNr(int mobilNr) {
        this.mobilNr = mobilNr;
    }


    public ArrayList<Tilmelding> getTilmeldinger(){
        return new ArrayList<>(tilmeldinger);
    }


    //metode
    public void addTilmelding(Tilmelding tilmelding){
        if (!tilmeldinger.contains(tilmelding)){
            tilmeldinger.add(tilmelding);
        }
    }

    public void removeTilmelding(Tilmelding tilmelding){
        if (tilmeldinger.contains(tilmelding)){
            tilmeldinger.remove(tilmelding);

        }
    }









}
