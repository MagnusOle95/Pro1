package Opgave3;

import java.util.ArrayList;
import java.util.List;

public class Team {

    //Attributer//
    private String name;
    private ArrayList<Player> player;

    //Opgave 3 c.1 laver en Constructor//
    public Team(String name){
        this.name = name;
        this.player = new ArrayList<>();
    }

    //Opgave 3 c.2 Get metode til klubbens navn//
    public String getName(){
        return this.name;
    }

    //Opgave 3 c.3 Metode der tilføger en spiller til, arraylisten//
    public void AddPlayer(Player player){
        this.player.add(player);
    }

    //Opgave 3 c.4 Metode til at printe alle spillere fra holdet//
    public void printPlayers(){
        System.out.println("Spillere på holdet");

        //For løkke//
        for (int i = 0; i < player.size(); i++){
            System.out.println("Navn:" + player.get(i).getName() + " Alder:" + player.get(i).getAge() + " Score:" + player.get(i).getscore());
        }

        System.out.println(); //Mellemrum

        //Foreach Løkke//
        for (Player spiller: player){
            System.out.println("Navn:" + spiller.getName() + " Alder:" + spiller.getAge() + " Score:" + spiller.getscore());
        }
    }

    //Opgave 3 c.5 Metode til at udregne gennemsnitsalderen for spillerene på holdet//
    public double CalcAvageAge(){
        double sum = 0;
        for (Player spiller: player){
            sum = sum + spiller.getAge();
        }
        sum = sum / player.size();
        return sum;
    }

    //Opgave 3 c.6 Metode der retunere den samlede score for alle spillerende på holdet//
    public int calcTotalScore(){
        int sum = 0;
        for (Player spiller: player){
            sum += spiller.getscore();
        }
        return sum;
    }

    //Opgave 3 c.7 Metode der retunere den samlede score for spillere der er ældre end agelimit.
    public int calcOldPlayerScore (int ageLimit){
        int sum = 0;
        for (Player spiller: player){
            if (spiller.getAge() > ageLimit){
                sum += spiller.getscore();
            }
        }

        return sum;
    }

    //Opgave 3 c.8 Metode der retunere, den højeste score for de samlige spillere på holdet//
    public int maxScore(){
        int sum = 0;
        for (Player spiller: player){
            if (spiller.getscore() > sum){
                sum = spiller.getscore();
            }
        }
        return sum;
    }

    //Opgave 3 c.9 Metode der retunere, den højeste score for den spiller der har den højeste score//
    public String bestPlayer(){
        int sum = 0;
        int arrayLocation = 0;
        for (int i = 0; i < player.size(); i++){
            if (player.get(i).getscore() > sum){
                sum = player.get(i).getscore();
                arrayLocation = i;
            }
        }
        return player.get(arrayLocation).getName();
    }



}




