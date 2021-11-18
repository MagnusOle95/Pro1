package application.model;

import java.util.ArrayList;

public class Foredrag {

    //Attributter
    private String foredragsNavn;

    //Link attribut
    private Deltager foredragsHolder;
    private Konferrence konferrence;


    //Construktor
    Foredrag(String foredragsNavn,Konferrence konferrence) {
        this.foredragsNavn = foredragsNavn;
        this.konferrence = konferrence;
    }

    //Get og set metoder
    public String getForedragsNavn() {
        return foredragsNavn;
    }

    public void setForedragsNavn(String foredragsNavn) {
        this.foredragsNavn = foredragsNavn;
    }

    public Deltager getForedragsHolder() {
        return foredragsHolder;
    }

    public void setForedragsHolder(Deltager foredragsHolder) {
        this.foredragsHolder = foredragsHolder;
    }




}

