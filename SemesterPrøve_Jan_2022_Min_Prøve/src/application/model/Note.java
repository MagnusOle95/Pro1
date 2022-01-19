package application.model;

import java.util.ArrayList;

public class Note {

	//attributter
    private int strafSekunder;


	//Link attributter
    private Forhindring forhindring;


	//Contruktor
    Note(int strafSekunder, Forhindring forhindring) {
        this.strafSekunder = strafSekunder;
        this.forhindring = forhindring;
    }


    //Get og set metoder
    public int getStrafSekunder() {
        return strafSekunder;
    }

    public Forhindring getForhindring(){
        return this.forhindring;
    }


    //metoder

    @Override
    public String toString(){
        return forhindring + "  Straftid: " + strafSekunder + "s";
    }



}
