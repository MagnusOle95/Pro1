package Opgave_4;

import java.util.Objects;

public class Radiator {

    //Attributer//
    private int temperatur;

    //Constructer 1 radiator med parameter//
    public Radiator(int temperatur){
        this.temperatur = temperatur;
    }

    //Constructer 2 radiater uden parameter, der sætter radiator på 20//
    public Radiator(){this.temperatur = 20;
    }


    //Get temperatur, forspørg om temperatur//
    public int getRadiatorTemp(){
        return temperatur;
    }


    //Temperatur regulering//
    public void skruOp(int grader) {
        this.temperatur = temperatur + grader;
    }
    public void skruNed(int grader){
        this.temperatur = temperatur - grader;
    }
}

