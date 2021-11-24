package application.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bil {

    private String bilNavn;
    private String bilMærke;
    private PrisGruppe prisGruppe;
    private LocalDate årgang;
    private int kilometerKørt;
    private ArrayList<Reservation> reservationer;

    public Bil(String bilNavn, String bilMærke, PrisGruppe prisGruppe, LocalDate årgang, int kilometerKørt) {
        this.bilNavn = bilNavn;
        this.bilMærke = bilMærke;
        this.prisGruppe = prisGruppe;
        this.årgang = årgang;
        this.kilometerKørt = kilometerKørt;
        this.reservationer = new ArrayList<>();
    }

    public ArrayList<Reservation> getReservationer(){
        return new ArrayList<>(reservationer);
    }

    public void addReservationTilBil(Reservation reservation){
        if (!reservationer.contains(reservation)){
            reservationer.add(reservation);
        }
    }

    public void removeReservationFraBil(Reservation reservation){
        if (reservationer.contains(reservation)){
            reservationer.remove(reservation);
        }
    }

    public String getBilNavn() {
        return bilNavn;
    }

    public void setBilNavn(String bilNavn) {
        this.bilNavn = bilNavn;
    }

    public String getBilMærke() {
        return bilMærke;
    }

    public void setBilMærke(String bilMærke) {
        this.bilMærke = bilMærke;
    }

    public PrisGruppe getPrisGruppe() {
        return prisGruppe;
    }

    public void setPrisGruppe(PrisGruppe prisGruppe) {
        this.prisGruppe = prisGruppe;
    }

    public LocalDate getÅrgang() {
        return årgang;
    }

    public void setÅrgang(LocalDate årgang) {
        this.årgang = årgang;
    }

    public int getKilometerKørt() {
        return kilometerKørt;
    }

    public void setKilometerKørt(int kilometerKørt) {
        this.kilometerKørt = kilometerKørt;
    }
}
