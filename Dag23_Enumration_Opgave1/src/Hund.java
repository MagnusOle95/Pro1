public class Hund {

    //Attributer
    private String navn;
    private boolean stamTavle;
    private int pris;
    private Race race;

    public Hund(String navn, Boolean stamTavle, int pris, Race race){
        this.navn = navn;
        this.stamTavle = stamTavle;
        this.pris = pris;
        this.race = race;
    }

    public Race getRace(){
        return this.race;
    }

    public int getPris(){
        return pris;
    }


}
