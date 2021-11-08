package Opgave4;

public class Bolig {

    //Attributer
    private int kvm;
    private String adresse;
    private int prisPrMaaned;

    //Link arttributer

    //Constructor
    public Bolig(int kvm, String adresse, int prisPrMaaned){
        this.kvm = kvm;
        this.adresse = adresse;
        this.prisPrMaaned = prisPrMaaned;
    }

    //Get metoder
    public int getKvm(){
        return this.kvm;
    }

    public String getAdresse(){
        return this.adresse;
    }

    public int getPrisPrMaaned(){
        return this.prisPrMaaned;
    }

    //set metoder
    public void setKvm(int kvm){
        this.kvm = kvm;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public void setPrisPrMaaned(int prisPrMaaned){
        this.prisPrMaaned = prisPrMaaned;
    }

}
