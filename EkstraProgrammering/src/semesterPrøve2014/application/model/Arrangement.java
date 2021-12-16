package semesterPrøve2014.application.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;

public class Arrangement {
    private String navn;
    private String ansvarlig;
    private LocalDate premiereDato;
    private int pris;

    // aggregering --> 0..* Event
    private final ArrayList<Event> events = new ArrayList<>();

    public Arrangement(String navn, String ansvarlig, LocalDate premiereDato, int pris) {
        this.navn = navn;
        this.ansvarlig = ansvarlig;
        this.premiereDato = premiereDato;
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAnsvarlig() {
        return ansvarlig;
    }

    public void setAnsvarlig(String ansvarlig) {
        this.ansvarlig = ansvarlig;
    }

    public LocalDate getPremiereDato() {
        return premiereDato;
    }

    public void setPremiereDato(LocalDate premiereDato) {
        this.premiereDato = premiereDato;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    //-----------------------------------------------------

    public ArrayList<Event> getEvents() {
        return new ArrayList<>(events);
    }

    //-----------------------------------------------------

    public int getAntalLangeEvents(){
        int antal = 0;
        for (Event event: events){
            if (ChronoUnit.DAYS.between(event.getStartDato(),event.getSlutDato()) > 3){
                antal++;
            }
        }
        return antal;
    }

    public Event createEvent(String navn, LocalDate startDato, LocalDate slutDato){
        if (startDato.isBefore(slutDato) || startDato.equals(slutDato)){
            Event e = new Event(navn,startDato ,slutDato,this);
            events.add(e);
            return e;
        }else{
            throw new WrongDateException("Startdato skal være før slutdato");
        }
    }

    public Event eventOnDate(LocalDate dato){
        Event event = null;
        int i = 0;
        while (event == null && i < events.size()) {
            Event k = events.get(i);
            if (k.getStartDato().compareTo(dato) <= 0 && k.getSlutDato().compareTo(dato) >= 0)
                event = k;
            else {
                i++;
            }
        }
        return event;
    }



 }

