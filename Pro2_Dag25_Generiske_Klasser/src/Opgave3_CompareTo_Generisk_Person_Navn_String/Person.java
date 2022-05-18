package Opgave3_CompareTo_Generisk_Person_Navn_String;

public class Person< E extends Comparable<E>> implements Comparable<Person<E>>{

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

    public String toString(){
        return this.navn + "";
    }


    @Override
    public int compareTo(Person<E> o) {
        return this.navn.compareTo(o.navn);
    }
}
