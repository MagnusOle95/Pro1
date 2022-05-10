package Opgave3_Person_Navn_String;

public class Navn implements Comparable<String> {

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
    public int compareTo(String o) {
        String fuldNavn = getFornavn() + " " + getEfterNavn();
        int result = fuldNavn.compareTo(o);
        return result;
    }
}
