package Opgave3_Person_Navn_String;

public class Person<E> implements Comparable<E>{

    //Attribut
    private E navn;

    //Contruktor
    Person(E navn){
        this.navn = navn;
    }

    //Set metode.
    public void setNavn(E navn){
        this.navn = navn;
    }

    //Get metode.
    public E getNavn(){
        return this.navn;
    }


    @Override
    public int compareTo(E o) {

    }

    public String toString(){
        return this.navn + "";
    }


}
