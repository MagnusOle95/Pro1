package application.model;

import java.util.ArrayList;

public class Hold {

    //attributter
    private String navn;
    private String diciplin;
    private int maxAntal;


    //Link attributter
    ArrayList<Tilmelding> tilmeldinger;


    //Contruktor
    public Hold(String navn, String diciplin, int maxAntal) {
        this.navn = navn;
        this.diciplin = diciplin;
        this.maxAntal = maxAntal;
        tilmeldinger = new ArrayList<>();
    }


    //Get og set metoder
    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }


    public String getDiciplin() {
        return diciplin;
    }

    public void setDiciplin(String diciplin) {
        this.diciplin = diciplin;
    }


    public int getMaxAntal() {
        return maxAntal;
    }

    public void setMaxAntal(int maxAntal) {
        this.maxAntal = maxAntal;
    }

    public ArrayList<Tilmelding> getTilmeldinger(){
        return new ArrayList<>(tilmeldinger);
    }


    //metoder
    public Tilmelding createTilmelding(boolean aktiv, boolean VIPmedlem,Medlem medlem){
        Tilmelding tilmelding = new Tilmelding(aktiv,VIPmedlem ,medlem);
        tilmeldinger.add(tilmelding);
        return tilmelding;
    }

    public void removeTilmelding(Tilmelding tilmelding){
        if (tilmeldinger.contains(tilmelding)){
            removeTilmelding(tilmelding);
        }
    }

    public int getAntalTilmeldinger(String adresse){
        int antalTilmeldinger = 0;
        for (Tilmelding t : tilmeldinger){
            if (t.getMedlem().getadresse().equals(adresse)){
                antalTilmeldinger++;
            }
        }
        return antalTilmeldinger;
    }


    public String findVIPMedlem(){
        String navn = null;
        int i = 0;
        while (navn == null && i < tilmeldinger.size()){
            Tilmelding k = tilmeldinger.get(i);
            if (k.isVIPmedlem() == true){
                navn = k.getMedlem().getNavn();
            }else{
                i++;
            }
        }
        return navn;
    }






}
