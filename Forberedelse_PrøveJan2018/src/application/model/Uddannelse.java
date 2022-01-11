package application.model;

import java.util.ArrayList;

public class Uddannelse {

	//attributter
    private String navn;

	//Link attributter
    private ArrayList<Hold> teams;


	//Contruktor
    public Uddannelse(String navn){
        this.navn = navn;
        this.teams = new ArrayList<>();
    }


	//Get og set metoder
    public String getNavn(){
        return this.navn;
    }


	//metoder
    public ArrayList<Hold> getTeams(){
        return new ArrayList<>(teams);
    }

    public Hold createHold(String betegnelse, String holdLeder){
        Hold hold = new Hold(betegnelse,holdLeder,this);
        this.teams.add(hold);
        return hold;
    }

    public void removeHold(Hold hold){
        if (teams.contains(hold)){
            teams.remove(hold);
        }
    }

    public ArrayList<String> tutorOversigt(){
        ArrayList<String> oversigtliste = new ArrayList<>();
        for (Hold hold: teams){
            if (hold.getTutors() != null){
                for (Tutor tutor : hold.getTutors()){
                    oversigtliste.add(tutor.getNavn() + " " + this.navn + " " + hold.getBetegnelse() + " " + hold.getHoldLeder());
                }
            }
        }
        return oversigtliste;
    }


}
