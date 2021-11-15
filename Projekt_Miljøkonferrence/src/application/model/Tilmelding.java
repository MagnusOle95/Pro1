package application.model;

import javafx.scene.control.DatePicker;

import java.util.ArrayList;

public class Tilmelding {

    //Attributer
    private DatePicker ankomstDato;
    private DatePicker afrejseDato;
    private Konferrence konferrence;

    //Linkattributter
    private ArrayList<Tilvalg> hotelTilvalg;
    private Deltager deltager;
    private Ledsager ledsager;


    //Construktor
    public Tilmelding(DatePicker ankomstDato, DatePicker afrejseDato, Konferrence konferrence,Deltager deltager) {
        this.ankomstDato = ankomstDato;
        this.afrejseDato = afrejseDato;
        this.konferrence = konferrence;
        this.hotelTilvalg = new ArrayList<>();
        this.deltager = deltager;
    }

    //set og get metoder
    public DatePicker getAnkomstDato() {
        return ankomstDato;
    }
    public void setAnkomstDato(DatePicker ankomstDato) {
        this.ankomstDato = ankomstDato;
    }

    public DatePicker getAfrejseDato() {
        return afrejseDato;
    }
    public void setAfrejseDato(DatePicker afrejseDato) {
        this.afrejseDato = afrejseDato;
    }

    public Konferrence getKonferrence() {
        return konferrence;
    }
    public void setKonferrence(Konferrence konferrence) {
        this.konferrence = konferrence;
    }


    public void addHotelTilvalg(Tilvalg tilvalg){
        if (!this.hotelTilvalg.contains(tilvalg)){
            this.hotelTilvalg.add(tilvalg);
        }
    }
    public void removeHotelTilvalg(Tilvalg tilvalg){
        if (this.hotelTilvalg.contains(tilvalg)){
            this.hotelTilvalg.remove(tilvalg);
        }
    }
    public ArrayList<Tilvalg> getHotelTilvalg(){
        return new ArrayList<>(hotelTilvalg);
    }


    public Deltager getDeltager(){
        return this.deltager;
    }

    public void setLedsager(Ledsager ledsager) {
        if (this.ledsager != ledsager) {
            this.ledsager = ledsager;
            if (ledsager != null){
                ledsager.addTilmelding(this);
            }
        }
    }


}
