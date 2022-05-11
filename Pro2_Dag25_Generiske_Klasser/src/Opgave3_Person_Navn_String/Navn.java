package Opgave3_Person_Navn_String;

public class Navn implements Comparable<Navn> {

    private String fornavn;
    private String efterNavn;

    public Navn(String fornavn, String efterNavn){
        this.fornavn = fornavn;
        this.efterNavn = efterNavn;
    }

    public void setFornavn(String fornavn){
        this.fornavn = fornavn;
    }

    public String getFornavn(){
        return this.fornavn;
    }

    public void setEfterNavn(String efterNavn){
        this.efterNavn = efterNavn;
    }

    public String getEfterNavn(){
        return this.efterNavn;
    }

    public String toString(){
        return fornavn + " " + efterNavn;
    }

    @Override
    public int compareTo(Navn o) {
        int result;

        int comForNavn = this.fornavn.compareTo(o.fornavn);
        int comEfternavn = this.efterNavn.compareTo(o.efterNavn);

        if (comForNavn == 0){
            result = comEfternavn;
        }else{
            result = comForNavn;
        }

        return result;
    }
}
