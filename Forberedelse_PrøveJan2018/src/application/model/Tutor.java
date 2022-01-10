package application.model;

import java.io.PrintStream;
import java.util.ArrayList;

public class Tutor {

    //attributter
    private String navn;
    private String eMail;


    //Link attributter
    private Hold hold;
    private ArrayList<Arrangement> arrangementer;



    //Contruktor
    public Tutor(String navn, String eMail) {
        this.navn = navn;
        this.eMail = eMail;
    }


    //Get og set metoder
    public String getNavn() {
        return this.navn;
    }

    public String geteMail() {
        return this.eMail;
    }


    //metoder
    public Hold getHold(){
        return this.hold;
    }

    public void setHold(Hold hold){
        if (this.hold != hold){
            Hold oldhold = this.hold;
            if (oldhold != null){
                oldhold.removeTutor(this);
            }
            this.hold = hold;
            if (hold != null){
                hold.addTurtor(this);
            }
        }
    }

    public ArrayList<Arrangement> getArrangementer(){
        return new ArrayList<>(arrangementer);
    }

    public void addArrangement(Arrangement arrangement){
        if (!arrangementer.contains(arrangement)){
            arrangementer.add(arrangement);
        }
    }

    public void removeArrangement(Arrangement arrangement){
        if (arrangementer.contains(arrangement)){
            arrangementer.remove(arrangement);
        }
    }


    public double arrangementsPris(){
        double sum = 0;
        for (Arrangement arg : arrangementer){
            sum += arg.getPris();
        }
        return sum;
    }


}
