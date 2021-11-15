package application.model;

public class Foredrag {

    //Attributter
    private String foredragsNavn;
    private String foredragsHoldersNavn;

    //Link attribut
    private Deltager foredragsHolder;

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
}
