package Opgave4;

public class Lejer {

    //Attributer
    private String navn;
    private String uddannelse;

    //Link attributer

    //Construktor
    public Lejer(String navn, String uddannelse){
        this.navn = navn;
        this.uddannelse = uddannelse;
    }

    //Get metoder
    public String getNavn(){
        return this.navn;
    }

    public String getUddannelse(){
        return this.uddannelse;
    }

    //Set metoder
    public void setNavn(String navn){
        this.navn = navn;
    }

    public void setUddannelse(String uddannelse){
        this.uddannelse = uddannelse;
    }

}
