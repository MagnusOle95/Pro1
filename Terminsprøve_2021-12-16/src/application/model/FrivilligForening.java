package application.model;

public class FrivilligForening extends Frivillig {

    //attributter
    private String foreningsnavn;
    private int antalPersoner;


    //Link attributter


    //Contruktor
    public FrivilligForening(String navn, String mobil, int maxAntalTimer, String foreningsnavn, int antalPersoner) {
        super(navn, mobil, maxAntalTimer);
        this.foreningsnavn = foreningsnavn;
        this.antalPersoner = antalPersoner;
    }


    //Get og set metoder
    public String getForeningsnavn() {
        return foreningsnavn;
    }

    public int getAntalPersoner() {
        return antalPersoner;
    }


    //metoder


}
