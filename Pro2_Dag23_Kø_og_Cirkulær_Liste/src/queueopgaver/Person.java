package queueopgaver;

public class Person {

    private String navn;
    private int alder;

    public Person(String navn,int alder){
        this.navn = navn;
        this.alder = alder;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public String toString(){
        return this.navn + " " + this.alder + "År";
    }

}
