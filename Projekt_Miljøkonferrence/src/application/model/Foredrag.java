package application.model;

import java.util.ArrayList;

public class Foredrag {

    //Attributter
    private String foredragsNavn;
    private String foredragsHoldersNavn;

    //Link attribut
    private Deltager foredragsHolder;
    private Konferrence konferrence;


    //Construktor
    public Foredrag(String foredragsNavn, String foredragsHoldersNavn) {
        this.foredragsNavn = foredragsNavn;
        this.foredragsHoldersNavn = foredragsHoldersNavn;
    }

    //Get og set metoder
    public String getForedragsNavn() {
        return foredragsNavn;
    }

    public void setForedragsNavn(String foredragsNavn) {
        this.foredragsNavn = foredragsNavn;
    }

    public String getForedragsHoldersNavn() {
        return foredragsHoldersNavn;
    }

    public void setForedragsHoldersNavn(String foredragsHoldersNavn) {
        this.foredragsHoldersNavn = foredragsHoldersNavn;
    }

    public Deltager getForedragsHolder() {
        return foredragsHolder;
    }

    public void setForedragsHolder(Deltager foredragsHolder) {
        this.foredragsHolder = foredragsHolder;
    }


    public void setKonferrence(Konferrence konferrence){
        if (this.konferrence != konferrence){
            if (this.konferrence != null){
                this.konferrence.removeFordrag(this);
            }
            this.konferrence = konferrence;
            if (konferrence != null){
                konferrence.addForedrag(this);
            }
        }
    }



}

