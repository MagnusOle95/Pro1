package application.model;

import javafx.scene.control.DatePicker;

public class Tilmelding {

    //Attributer
    private DatePicker ankomstDato;
    private DatePicker afrejseDato;
    private Konferrence konferrence;

    //Construktor
    public Tilmelding(DatePicker ankomstDato, DatePicker afrejseDato, Konferrence konferrence) {
        this.ankomstDato = ankomstDato;
        this.afrejseDato = afrejseDato;
        this.konferrence = konferrence;
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
}
