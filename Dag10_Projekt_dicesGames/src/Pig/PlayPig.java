package Pig;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PlayPig {
    private Die die;
    private Scanner scan;
    private boolean Player1;
    private int player1Score;
    private int Player2Score;
    private int Playto;
    private boolean isFirstRoll;
    private int dieSum;
    private boolean finish;
    private String spillerNavn;
    private double amoundOfRolls;
    private double amoundOfPlayerChance;

    PlayPig() {
        die = new Die();
        scan = new Scanner(System.in);
        Player1 = true;
        player1Score = 0;
        Player2Score = 0;
        isFirstRoll = true;
        dieSum = 0;
        finish = false;
        spillerNavn = "Spiller 1";
        amoundOfRolls = 0;
        amoundOfPlayerChance = 1;
    }

    public void Welcometogame() {
        System.out.println("Velkommen til spillet Pig");
    }

    public void gameOver() {
        if (player1Score > Player2Score) {
            System.out.println("\nTillykke player 1, du har vundet");
        } else {
            System.out.println("\nTillykke player 2, du har vundet");
        }
        System.out.println("\nStatestik/Gennemsnit\nSlag pr runde: " + amoundOfRolls / amoundOfPlayerChance);
        scan.close();
    }

    public void takeTurn() {
        die.roll();
        System.out.println(die.getFaceValue());
        if (die.getFaceValue() == 1) {
            System.out.println("Du slog 1, slut");
            changeplayer();
        } else {
            dieSum += die.getFaceValue();
        }
        amoundOfRolls++;
    }

    public void changeplayer() {
        if (player1Score >= Playto || Player2Score >= Playto) {
            finish = true;
        } else {
            if (Player1 == true) {
                Player1 = false;
                spillerNavn = "Spiller 2";
            } else {
                Player1 = true;
                spillerNavn = "Spiller 1";
            }
            dieSum = 0;
            amoundOfPlayerChance++;
        }
    }

        public void startgame () {
            Welcometogame();
            if (isFirstRoll) {
                System.out.println("Hvad vil i spille til");
                Playto = scan.nextInt();
                isFirstRoll = false;
            }

            while (!finish) {
                System.out.println("\nVil du kaste dine terninger " + spillerNavn);
                String fortsæt = scan.next();
                if (fortsæt.equalsIgnoreCase("Nej") || die.getFaceValue() == 0) {
                    if (Player1 == true) {
                        player1Score += dieSum;
                    } else if (Player1 == false) {
                        Player2Score += dieSum;
                    }
                    System.out.println("player 1: " + player1Score);
                    System.out.println("player 2: " + Player2Score);
                    changeplayer();
                } else {
                    takeTurn();
                }
            }
            gameOver();
        }
    }

