package Craps_play;

import java.security.PrivateKey;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CrapsPlay {

    private Die die1;
    private Die die2;
    private boolean gameWon;
    private int firstRoll;
    private boolean isFirstRoll;
    private Scanner scan;
    private boolean finished;
    private int vundet;
    private int tabt;

    CrapsPlay(){
        die1 = new Die();
        die2 = new Die();
        gameWon = false;
        firstRoll = 0;
        isFirstRoll = true;
        scan = new Scanner(System.in);
        finished = false;
        vundet = 0;
        tabt = 0;

    }

    public void welcomeToTheGame(){
        System.out.println("Velkommen til spillet");
    }

    public void gameover(){
        if (gameWon == true){
            System.out.println("spillet er vundet");
            vundet++;
        }else{
            System.out.println("Spillet er tabt");
            tabt++;
        }

        System.out.println("\nVil du spille igen");
        String fortsæt = scan.next();
        if (fortsæt.equalsIgnoreCase("Ja") ){
            firstRoll = 0;
            isFirstRoll = true;
            finished = false;
            System.out.println();
            startGame();
        }else{
            System.out.println("Øv håber vi ser dig en anden gang");
            System.out.println("Antal vundet spil: " + vundet + "\nAntal talbte spil: " + tabt);
        }
        scan.close();
    }

    public void taketurn(){
        die1.roll();
        die2.roll();
        int Value = die1.getFaceValue() + die2.getFaceValue();
        System.out.println("Du har kastet " + Value);

        if (isFirstRoll) {
            if (Value == 7 || Value == 11) {
                gameWon = true;
                finished = true;
            } else if (Value == 2 || Value == 3 || Value == 11) {
                gameWon = false;
                finished = true;
            } else {
                firstRoll = Value;
                isFirstRoll = false;
            }
        }else{
            if (Value == firstRoll){
                gameWon = true;
                finished = true;
            }else if (Value == 7){
                finished = true;
            }
        }
    }

    public void startGame(){
        welcomeToTheGame();

        while (!finished){
            System.out.println("Vil du kaste dine terninger");
            String fortsæt = scan.next();
            if (fortsæt.equalsIgnoreCase("nej")){
                finished = true;
            }else{
                taketurn();
            }
        }
        gameover();
    }
}
