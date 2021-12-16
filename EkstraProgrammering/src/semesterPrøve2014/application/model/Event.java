package semesterPrøve2014.application.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Event {
    private String navn;
    private LocalDate startDato;
    private LocalDate slutDato;

    // aggregering --> 1 Arrangement
    private Arrangement arrangement;

    // associering --> 0..* Ressource
    private final ArrayList<Ressource> ressourcer = new ArrayList<>();

    Event(String navn, LocalDate startDato, LocalDate slutDato,Arrangement arrangement) {
        this.navn = navn;
        this.startDato = startDato;
        this.slutDato = slutDato;
        this.arrangement = arrangement;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public LocalDate getStartDato() {
        return startDato;
    }

    public void setStartDato(LocalDate startDato) {
        this.startDato = startDato;
    }

    public LocalDate getSlutDato() {
        return slutDato;
    }

    public void setSlutDato(LocalDate slutDato) {
        this.slutDato = slutDato;
    }

    //-----------------------------------------------------

    public Arrangement getArrangement() {
        return arrangement;
    }

    //-----------------------------------------------------


    public ArrayList<Ressource> getRessourcer() {
        return new ArrayList<>(ressourcer);
    }

    //-----------------------------------------------------

    public void addRessource(Ressource ressource) {
        if (!ressourcer.contains(ressource)) {
            ressourcer.add(ressource);
            ressource.addEvent(this);
        }
    }

    public void removeRessource(Ressource ressource) {
        if (ressourcer.contains(ressource)) {
            ressourcer.remove(ressource);
            ressource.removeEvent(this);
        }
    }



}
