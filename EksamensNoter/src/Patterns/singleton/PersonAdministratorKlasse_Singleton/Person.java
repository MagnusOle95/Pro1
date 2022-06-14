package Patterns.singleton.PersonAdministratorKlasse_Singleton;

public class Person {

    private String navn;
    private int alder;

    public Person(String navn, int alder){
        this.navn = navn;
        this.alder = alder;
    }

    public int getAlder(){ return  alder;}
    public String getNavn() {
        return navn;
    }

    public String toString(){
        return navn + " " + alder;
    }


}
