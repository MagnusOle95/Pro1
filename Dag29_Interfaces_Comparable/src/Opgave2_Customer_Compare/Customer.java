package Opgave2_Customer_Compare;

import java.util.ArrayList;

public class Customer implements Comparable<Customer> {

    //
    private String forNavn;
    private String efterNavn;
    private int alder;

    public Customer(String forNavn, String efterNavn, int alder){
        this.forNavn = forNavn;
        this.efterNavn = efterNavn;
        this.alder = alder;
    }

    public String getForNavn() {
        return forNavn;
    }

    public void setForNavn(String forNavn) {
        this.forNavn = forNavn;
    }

    public String getEfterNavn() {
        return efterNavn;
    }

    public void setEfterNavn(String efterNavn) {
        this.efterNavn = efterNavn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    @Override
    public int compareTo(Customer c){
        int comp = this.efterNavn.compareTo(c.getEfterNavn());

        if(comp == 0){
            comp = this.forNavn.compareTo(c.getForNavn());
        }

        if (comp == 0){
            comp = this.alder - c.getAlder();
        }
        return comp;
    }

    public String toString(){
        return "Fornavn: " + forNavn + " efternavn: " + efterNavn + " alder: " + alder + "\n";
    }


}
