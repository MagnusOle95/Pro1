package application.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Løb {

	//attributter
    private LocalDate dato;
    private String sted;
    private int normalPris;
    private LocalDate earlyBirdDate;
    private int earlyBirdPris;



	//Link attributter
    private ArrayList<Tilmelding> tilmeldinger = new ArrayList<>();
    private ArrayList<Forhindring> forhindringer = new ArrayList<>();


	//Contruktor
    public Løb(LocalDate dato, String sted, int normalPris, LocalDate earlyBirdDate, int earlyBirdPris) {
        this.dato = dato;
        this.sted = sted;
        this.normalPris = normalPris;
        this.earlyBirdDate = earlyBirdDate;
        this.earlyBirdPris = earlyBirdPris;
    }


    //Get og set metoder
    public LocalDate getDato() {
        return dato;
    }

    public String getSted() {
        return sted;
    }

    public int getNormalPris() {
        return normalPris;
    }

    public LocalDate getEarlyBirdDate() {
        return earlyBirdDate;
    }

    public int getEarlyBirdPris() {
        return earlyBirdPris;
    }

    public ArrayList<Tilmelding> getTilmeldinger(){
        return new ArrayList<>(tilmeldinger);
    }

    public ArrayList<Forhindring> getForhindringer(){
        return new ArrayList<>(forhindringer);
    }



    //metoder
    public Tilmelding createTilmelding(String navn, boolean kvinde, LocalDate tilmeldingsDato, int løbeNummer){
        Tilmelding tilmelding = new Tilmelding(navn,kvinde ,tilmeldingsDato ,løbeNummer , this);
        tilmeldinger.add(tilmelding);
        return tilmelding;
    }

    public void addForhindring(Forhindring forhindring) {
        if (!forhindringer.contains(forhindring)) {
            forhindringer.add(forhindring);
            forhindring.addLøb(this);
        }
    }

    public void removeForhindring(Forhindring forhindring) {
        if (forhindringer.contains(forhindring)) {
            forhindringer.remove(forhindring);
            forhindring.removeløb(this);
        }
    }

    public int earlyBirdIndtjening(){
        int sum = 0;
        for (Tilmelding t : tilmeldinger){
            if (t.getTilmeldingsDato().isEqual(earlyBirdDate) || t.getTilmeldingsDato().isBefore(earlyBirdDate)){
                sum = sum + earlyBirdPris;
            }
        }
        return sum;
    }

    public double gennemsnitStrafSekunder(Forhindring forhindring){
        double sum = 0;
        int antalStrafTiderUdelt = 0;

        for (Tilmelding t : tilmeldinger){
            for (Note n : t.getnoter()){
                if (n.getForhindring().equals(forhindring)){
                    sum += n.getStrafSekunder();
                    antalStrafTiderUdelt++;
                }
            }
        }
        return sum / antalStrafTiderUdelt;
    }

    public String getVinderAfLøbet(){
        int hurtigsteTid = tilmeldinger.get(0).resultatTid();
        int indeks = 0;

        for (int i = 1; i < tilmeldinger.size(); i++){
            if (hurtigsteTid > tilmeldinger.get(i).getLøbsTid()){
                hurtigsteTid = tilmeldinger.get(i).getLøbsTid();
                indeks = i;
            }
        }

        Tilmelding HurtigsteDeltager = tilmeldinger.get(indeks);

        return HurtigsteDeltager.getLøbeNummer() + " " + HurtigsteDeltager.getNavn() + " " + HurtigsteDeltager.resultatTid();
    }

    public String findløber(String name) {
        String løber = "Deltager findes ikke";
        int i = 0;
        while (løber.equals("Deltager findes ikke") && i < tilmeldinger.size()) {
            Tilmelding k = tilmeldinger.get(i);
            if (k.getNavn().equals(name))
                løber = k.getLøbeNummer() + " " + k.getNavn() + " " + k.resultatTid() + " " + k.getnoter().size();
            else {
                i++;
            }
        }
        return løber;
    }

    @Override
    public String toString(){
        return sted + " " + dato + " " + normalPris;
    }









}

