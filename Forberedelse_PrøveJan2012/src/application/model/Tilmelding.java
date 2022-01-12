package application.model;

public class Tilmelding {

    //attributter
    private boolean aktiv;
    private boolean VIPmedlem;


    //Link attributter
    private Medlem medlem;

    //Contruktor

    Tilmelding(boolean aktiv, boolean VIPmedlem,Medlem medlem) {
        this.aktiv = aktiv;
        this.VIPmedlem = VIPmedlem;
        this.medlem = medlem;
        medlem.addTilmelding(this);
    }


    //Get og set metoder
    public boolean isAktiv() {
        return aktiv;
    }

    public void setAktiv(boolean aktiv) {
        this.aktiv = aktiv;
    }


    public boolean isVIPmedlem() {
        return VIPmedlem;
    }

    public void setVIPmedlem(boolean VIPmedlem) {
        this.VIPmedlem = VIPmedlem;
    }


    public Medlem getMedlem(){
        return this.medlem;

    }


    //metoder




}
