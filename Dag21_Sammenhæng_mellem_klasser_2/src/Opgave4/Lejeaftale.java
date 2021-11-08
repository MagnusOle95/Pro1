package Opgave4;

import java.time.LocalDate;

public class Lejeaftale {

    //Attributer
    private LocalDate fraDato;
    private LocalDate tilDato;

    //Link Attributer

    //Construcktor
    public Lejeaftale(){
        this.fraDato = LocalDate.now();
        this.tilDato = null;
    }

    //Get metoder
    public LocalDate getFraDato(){
        return this.fraDato;
    }

    public LocalDate getTilDato(){
        return this.tilDato;
    }

    //Set metoder
    public void setFraDato(LocalDate fraDato){
        this.fraDato = fraDato;
    }

    public void setTilDato(LocalDate tilDato){
        this.tilDato = tilDato;
    }

    public void opsigelseAfKontakt(){
        this.tilDato = LocalDate.now();
    }

}
