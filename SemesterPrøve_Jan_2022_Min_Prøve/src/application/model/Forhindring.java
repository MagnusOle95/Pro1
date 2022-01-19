package application.model;

import java.util.ArrayList;

public class Forhindring {

	//attributter
    private int nummer;
    private String navn;



	//Link attributter
    private ArrayList<Løb> løbs = new ArrayList<>();



	//Contruktor
    public Forhindring(int nummer, String navn) {
        this.nummer = nummer;
        this.navn = navn;
    }


    //Get og set metoder
    public int getNummer() {
        return nummer;
    }

    public String getNavn() {
        return navn;
    }

    public ArrayList<Løb> getLøbs(){
        return new ArrayList<>(løbs);
    }


    //metoder
    public void addLøb(Løb løb) {
        if (!løbs.contains(løb)) {
            løbs.add(løb);
            løb.addForhindring(this);
        }
    }

    public void removeløb(Løb løb) {
        if (løbs.contains(løb)) {
            løbs.remove(løb);
            løb.removeForhindring(this);
        }
    }

    @Override
    public String toString(){
        return navn;
    }





}
